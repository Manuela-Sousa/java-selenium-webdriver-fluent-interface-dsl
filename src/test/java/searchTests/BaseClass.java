package searchTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import static factory.DriverFactory.getChromeDriver;
import static factory.DriverFactory.getWebDriverWait;

//setup code should always be in a single place
public class BaseClass {

    WebDriver driver;
    WebDriverWait wait;


    @BeforeSuite
    public void startUpBrowser() {

        driver = getChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        wait = getWebDriverWait();
    }

    @BeforeMethod(groups = "method1")
    public void goToHomePage() {
        driver.get("https://www.prozis.com/pt/pt");
    }


    @AfterSuite(alwaysRun = true)
    public void closeBrowser() {
        driver.close();
    }
}
