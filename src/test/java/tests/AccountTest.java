package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.CreateAccountPage;
import pages.CreateContactPage;

public class AccountTest extends BaseTest{
    @Test
    public void login() {
        loginPage.open();
        loginPage.login("tashapas@sandbox.com", "marylandOC99");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[title=Setup]")));

       createAccountPage.open();
       createAccountPage.createAccount();

       new CreateAccountPage(driver).create("Warm", "Bla", "+375202658964", "+3754896235",
               "Mira", "Customer - Direct", "Victory ave");

        //создать LoginPage, создать страницу листа контактов
    }
}
