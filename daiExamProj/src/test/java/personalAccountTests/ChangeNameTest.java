package personalAccountTests;

import baseBase.BaseTest;
import data.TestData;
import org.junit.Before;
import org.junit.Test;

public class ChangeNameTest extends BaseTest {


    @Before
    public void setUp() {
        pageProvider.getLoginPage().openLoginPage();
        pageProvider.getLoginPage().clickOnLoginButton();
        pageProvider.getLoginPage().enterPhoneNumber(TestData.VALID_PHONE_NUMBER);
        pageProvider.getLoginPage().enterPassword(TestData.VALID_PASSWORD);
        pageProvider.getLoginPage().clickOnLoginButton();
    }

    @Test
    public void TC_005_ChangeFirstName() {
        pageProvider.getHomePage().clickOnFirstNamebutton();
        pageProvider.getPersonalAccountPage().checkIsRedirectToPersonalAccountPage();
        pageProvider.getPersonalAccountPage().clickOnEditDataButton();
    }
}
