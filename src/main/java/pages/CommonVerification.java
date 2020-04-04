package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static factory.DriverFactory.getChromeDriver;
import static factory.DriverFactory.getWebDriverWait;

public class CommonVerification {

    protected WebDriver driver = getChromeDriver();
    protected WebDriverWait wait = getWebDriverWait();

    private CommonVerification() {
        //pages.CommonVerification this way will only be available through getCommonVerification() method
    }

    public static CommonVerification getCommonVerification() {
        return new CommonVerification();
    }


    public CommonVerification verifyIsDisplayed(By element) {
        Assert.assertTrue(getChromeDriver().findElement(element).isDisplayed());
        return this;
    }


    public CommonVerification clickOnElement(By element) {
        WebElement element_click = wait.until(
                ExpectedConditions.visibilityOfElementLocated(element));
        element_click.click();
        return this;
    }

    public void search(String value, By element) {
        WebElement search = wait.until(
                ExpectedConditions.visibilityOfElementLocated(element));
        search.sendKeys(value);
        search.sendKeys(Keys.ENTER);

    }
}
