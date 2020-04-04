package pages.search;

import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CommonVerification;

import static factory.DriverFactory.getWebDriverWait;
import static pages.CommonVerification.getCommonVerification;
import static pages.search.ProductListPage.PhysicalNutritionCategory;
import static pages.search.ProductListPage.PhysicalNutritionSubCategory;

public class ProductListActController {
    CommonVerification commonVerification = getCommonVerification();
    private WebDriverWait wait = getWebDriverWait();

    public ProductListActController() {
        //listproductpage this way will only be available through getListProductPage() method
    }

    public static ProductListActController getListProductPage() {
        return new ProductListActController();
    }

    public ProductListActController selectMainCategory() {
        commonVerification.clickOnElement(PhysicalNutritionCategory());
        return this;
    }

    public ProductListActController selectSubCategory() {
        commonVerification.clickOnElement(PhysicalNutritionSubCategory());
        return this;
    }

}
