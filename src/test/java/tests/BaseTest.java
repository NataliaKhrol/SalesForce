package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import pages.CreateAccountPage;
import pages.CreateContactPage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

@Listeners(TestListener.class)
public class BaseTest {

    WebDriver driver;
    LoginPage loginPage;
    CreateContactPage createContactPage;
    CreateAccountPage createAccountPage;
   /*
    ProductsPage productsPage;
    CartPage cartPage;
    CheckOutPage checkOutPage;
    CheckOutCompletePage checkOutCompletePage;
    CheckoutOverviewPage checkoutOverviewPage;*/

    @Parameters({"browser"})
    @BeforeMethod
    public void setup(@Optional("chrome") String browser) {
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            // options.setHeadless(true);
            driver = new ChromeDriver(options);
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            //TODO implement firefox opening
        }


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        loginPage = new LoginPage(driver);
        createContactPage = new CreateContactPage(driver);
        createAccountPage = new CreateAccountPage(driver);


      /*  productsPage = new ProductsPage(driver);
        checkOutPage = new CheckOutPage(driver);
        checkOutCompletePage = new CheckOutCompletePage(driver);
        checkoutOverviewPage = new CheckoutOverviewPage(driver);
        cartPage = new CartPage(driver);*/
    }

    @AfterMethod(alwaysRun = true)
    public void close() {
        if (driver != null) {
            driver.quit();
        }
    }
}

