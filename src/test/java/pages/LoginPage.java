package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {
    private By USERNAME_INPUT = By.id("username");
    private By PASSWORD_INPUT = By.id("password");
    private By LOGIN_BUTTON = By.id("Login");
    private By SETUP_BUTTON = By.cssSelector("[title=Setup]");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Step("Opening Login page")
    public void open() {
        driver.get(BASE_URL);
    }

    @Step("Login by '{username}' using password '{password}'")
    public void login(String userName, String password) {
        driver.findElement(USERNAME_INPUT).sendKeys(userName);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(SETUP_BUTTON));

    }
}
