package pages;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


abstract public class ParentPage extends CommonActionsWithElements {

    protected Logger logger = Logger.getLogger(getClass());
    String baseUrl = "https://www.itbox.ua/";

    public ParentPage(WebDriver webDriver) {
        super(webDriver);
    }

    abstract protected String getRelativeUrl();

    protected void checkUrl() {
        Assert.assertEquals("URL is not expected", baseUrl + getRelativeUrl(), webDriver.getCurrentUrl());
    }

    protected void checkUrlWithPattern() {
        Assert.assertTrue("URL is not expected \n" + "Expected url: " + baseUrl + getRelativeUrl()
                + "\n Actual url: " + webDriver.getCurrentUrl(), webDriver.getCurrentUrl().matches(baseUrl + getRelativeUrl()));
    }
}
