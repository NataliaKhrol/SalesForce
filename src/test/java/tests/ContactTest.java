package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.CreateContactPage;
import pages.CreateContactPage;

public class ContactTest extends BaseTest{
    @Test
    public void login() {
        driver.get("https://rutu2-dev-ed.lightning.force.com/");
        driver.findElement(By.id("username")).sendKeys("tashapas@sandbox.com");
        driver.findElement(By.id("password")).sendKeys("marylandOC99");
        driver.findElement(By.id("Login")).click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[title=Setup]")));
        driver.get("https://rutu2-dev-ed.lightning.force.com/lightning/page/home");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[title='Sales Console']")));
        driver.findElement(By.cssSelector("[title=New]")).click();

        new CreateContactPage(driver).create("Rak", "+375202658964");


    }
}
