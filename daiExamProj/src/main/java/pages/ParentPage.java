package pages;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


abstract public class ParentPage extends CommonActionsWithElements {


    @FindBy(xpath = "//*[@id='p-main']/section/section/div[2]/div[2]/div[1]/div[3]/a[4]")
    private WebElement favouriteButton;


    protected Logger logger = Logger.getLogger(getClass());
    String baseUrl = "https://www.itbox.ua/";

    @FindBy(xpath = "//a[@class='userlinks-link favorite-link userlinks-link__heart']//span[@class='userlinks-count scada' and text()='1']")
    private WebElement favouriteButtonInHeader;

    @FindBy(xpath = "//div[contains(@class, 'container') and contains(@class, 'hide-on-tablet')]//input[@type='text' and @name='q' and contains(@class, 'input-search')]")
    private WebElement searchInput;

    @FindBy(xpath = "//div[contains(@class, 'container') and contains(@class, 'hide-on-tablet')]//button[@type='submit' and contains(@class, 'qsr-submit') and text()='Знайти']")
    private WebElement searchButtonInInput;

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


    public void clickOnFavouriteButton() {
        clickOnElement(favouriteButton);
    }

    public void clickOnFavouriteButtonInHeader() {
        clickOnElement(favouriteButtonInHeader);
    }

    public void clickOnSearchInput() {
        clickOnElement(searchInput);
    }

    public ParentPage enterTextIntoSearchInput(String text) {
        clearAndEnterTextIntoElement(searchInput, text);
        return this;
    }

    public void clickOnSearchButtonInInput() {
        clickOnElement(searchButtonInInput);
    }
}