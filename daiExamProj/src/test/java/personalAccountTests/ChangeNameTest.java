package personalAccountTests;

import baseBase.BaseTest;
import data.TestData;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ChangeNameTest extends BaseTest {



    public final String NEW_FIRST_NAME = "Нейм";

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
    public void TC_005_ChangeFirstName() {
        pageProvider.getHomePage().clickOnFirstNamebutton();
        pageProvider.getDashboardPage().checkIsRedirectToDashboardPage();
        pageProvider.getDashboardPage().clickOnEditDataButton();
        pageProvider.getMyDataPage().checkIsRedirectToMyDataPage();
        pageProvider.getMyDataPage().enterNewFirstName(NEW_FIRST_NAME);
        pageProvider.getMyDataPage().clickOnSaveButton();
        pageProvider.getMyDataPage().checkIsNameUpdated(NEW_FIRST_NAME);
        Assert.assertFalse("Save button is displayed", pageProvider.getMyDataPage().isSaveButtonVisible());

    }

    @After
    public void tearDown1() {
        pageProvider.getMyDataPage().enterNewFirstName("Марія");
        pageProvider.getMyDataPage().clickOnSaveButton();
        pageProvider.getMyDataPage().checkIsNameUpdated("Марія");

        Assert.assertFalse("Save button is displayed", pageProvider.getMyDataPage().isSaveButtonVisible());
    }
}
