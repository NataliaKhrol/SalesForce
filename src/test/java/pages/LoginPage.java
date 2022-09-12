package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
    private By USERNAME_INPUT = By.id("username");
    private By PASSWORD_INPUT = By.id("password");
    private By LOGIN_BUTTON = By.id("Login");
    private By SETUP_BUTTON = By.cssSelector("[title=Setup]");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(BASE_URL);
    }

    public void login(String userName, String passwsord) {
        driver.findElement(USERNAME_INPUT).sendKeys(userName);
        driver.findElement(PASSWORD_INPUT).sendKeys(passwsord);
        driver.findElement(LOGIN_BUTTON).click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(SETUP_BUTTON));

    }
}
