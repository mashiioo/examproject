package cartTests;

import baseBase.BaseTest;
import data.TestData;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddToCartTest extends BaseTest {

    private String laptopName = "Ноутбук Vinga Iron S150 (S150-12158512G)";

    @Before
    public void setUp() {
        pageProvider.getLoginPage().openLoginPage();
        pageProvider.getLoginPage().clickOnLoginButton();
        pageProvider.getLoginPage().enterPhoneNumber(TestData.VALID_PHONE_NUMBER);
        pageProvider.getLoginPage().enterPassword(TestData.VALID_PASSWORD);
        pageProvider.getLoginPage().clickOnLoginButtoninModal();

        Assert.assertFalse("Login button is displayed", pageProvider.getLoginPage().isButtonLoginVisible());
        Assert.assertTrue("First name is not displayed", pageProvider.getHomePage().isFirstNameVisible());
    }

    @Test
    public void TC_003_AddToCart() {
        pageProvider.getHomePage().clickOnCatalogButton();
        pageProvider.getCatalogPage().checkIsRedirectToCatalogPage();
        pageProvider.getCatalogPage().clickOnLaptopCategoryButton();
        pageProvider.getLaptopsPage().checkIsRedirectToLaptopsPage();
        pageProvider.getLaptopsPage().clickOnFirstLaptop(laptopName);
        pageProvider.getLaptop1Page().checkIsRedirectToLaptop1Page();
        pageProvider.getLaptop1Page().clickOBuyButton();

        Assert.assertTrue("Laptop is not added to cart", pageProvider.getLaptop1Page().isFirstLaptopDisplayedInCartModal());


    }

    @After
    public void clearCart() {
        pageProvider.getLaptop1Page().clickOnCloseButtonInCartModal();
        pageProvider.getLaptop1Page().checkIsButtonPlaceOrderVisible();
        pageProvider.getLaptop1Page().clickOnCartButton();
        pageProvider.getCartPage().checkIsRedirectToCartPage();
        pageProvider.getCartPage().clickOnClearTheCartButton();
        pageProvider.getCartPage().checkIsCartEmpty();
    }

}

