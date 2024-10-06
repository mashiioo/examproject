package searchTests;

import baseBase.BaseTest;
import data.TestData;
import org.junit.Assert;
import org.junit.Test;

public class SearchTest extends BaseTest {

    @Test
    public void TC_002_SearchWithValidData() {
        pageProvider.getLoginPage().openLoginPage();
        pageProvider.getLoginPage().clickOnSearchInput();
        pageProvider.getLoginPage().enterTextIntoSearchInput(TestData.SEARCH_DATA);
        pageProvider.getLoginPage().clickOnSearchButtonInInput();

        Assert.assertTrue("Search result is not displayed", pageProvider.getSearchResultPage().isSearchResultDisplayed());
    }

}
