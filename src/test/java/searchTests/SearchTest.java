package searchTests;

import org.testng.annotations.Test;
import pages.CommonVerification;
import pages.search.ProductListPage;

import static pages.CommonVerification.getCommonVerification;
import static pages.homepage.HomePage.SearchTextfield;
import static pages.search.ProductListPage.PhysicalNutritionSubCategoryText;
import static pages.search.ProductListPage.getListProductPage;

public class SearchTest extends BaseClass {

    ProductListPage productListPage = getListProductPage();
    CommonVerification commonVerification = getCommonVerification();

    @Test(groups = "method1")
    public void basicSearch() {
        commonVerification.search("banana", SearchTextfield());

        productListPage.act().selectMainCategory()
                .selectSubCategory();

        commonVerification.verifyIsDisplayed(PhysicalNutritionSubCategoryText());

    }

}
