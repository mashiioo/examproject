package loginTests;

import baseBase.BaseTest;
import data.TestData;
import org.junit.Test;

public class LoginTest  extends BaseTest {

    @Test
    public void TC_001_LoginWithValidData() {
        pageProvider.getLoginPage().openLoginPage();
        pageProvider.getLoginPage().clickOnLoginButton();
        pageProvider.getLoginPage().enterPhoneNumber(TestData.VALID_PHONE_NUMBER);
        pageProvider.getLoginPage().enterPassword(TestData.VALID_PASSWORD);
    }
}
