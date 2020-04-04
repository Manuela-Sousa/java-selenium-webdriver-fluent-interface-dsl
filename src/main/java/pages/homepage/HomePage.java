package pages.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.search.ProductListActController;

import static factory.DriverFactory.getWebDriverWait;


public class HomePage {

    private WebDriverWait wait = getWebDriverWait();

    private ProductListActController act;

    private HomePage() {
        //homepage this way will only be available through getHomePage() method
    }

    public ProductListActController act() {
        return act;
    }

    private HomePage(ProductListActController act) {
        this.act = act;
    }


    public static HomePage getHomePage() {
        return new HomePage();
    }


    public static By SearchTextfield() {
        return By.cssSelector("#quick-search_query");
    }

}
