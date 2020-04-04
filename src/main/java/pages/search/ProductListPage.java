package pages.search;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import static factory.DriverFactory.getWebDriverWait;

public class ProductListPage {

    private ProductListActController act;

    private WebDriverWait wait = getWebDriverWait();

    public ProductListActController act() {
        return act;
    }

    private ProductListPage() {
        //listproductpage this way will only be available through getListProductPage() method
    }

    private ProductListPage(ProductListActController act) {
        this.act = act;
    }


    public static ProductListPage getListProductPage() {
        return new ProductListPage(new ProductListActController());
    }


    public static By PhysicalNutritionCategory() {
        return By.xpath("//*[@data-menu-id='PRZMN5002' and contains(text(), 'Nutrição Desportiva')]");
    }

    public static By PhysicalNutritionSubCategory() {
        return By.xpath("//*[@class='category-tree__level category-tree__level-2']//a[@data-clkid='ctree:PRZ20002']");
    }

    public static By PhysicalNutritionSubCategoryText() {
        return By.xpath("//*[@class='list__title mb-3']//h1[contains(text(), 'Proteína')]");
    }

}
