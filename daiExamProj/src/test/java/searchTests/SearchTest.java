package searchTests;

import baseBase.BaseTest;
import data.TestData;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.PageProvider;

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
