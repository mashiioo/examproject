package pages;

import org.openqa.selenium.WebDriver;

public class PageProvider {
    private WebDriver webDriver;

    public PageProvider(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public  LoginPage getLoginPage() {
        return new LoginPage(webDriver);
    }

    public HomePage getHomePage() {
        return new HomePage(webDriver);
    }

    public DashboardPage getDashboardPage() {
        return new DashboardPage(webDriver);
    }

    public MyDataPage getMyDataPage() {
        return new MyDataPage(webDriver);
    }

    public CatalogPage getCatalogPage() {
        return new CatalogPage(webDriver);
    }

    public LaptopsPage getLaptopsPage() {
        return new LaptopsPage(webDriver);
    }

    public Laptop1Page getLaptop1Page() {
        return new Laptop1Page(webDriver);
    }

    public FavouritePage getFavouritePage() {
        return new FavouritePage(webDriver);
    }

    public SearchResultPage getSearchResultPage() {
        return new SearchResultPage(webDriver);
    }

    public CartPage getCartPage() {
        return new CartPage(webDriver);
    }

}
