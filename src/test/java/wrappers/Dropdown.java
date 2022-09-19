package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Dropdown {
    WebDriver driver;
    String label;

    public Dropdown(String label, WebDriver driver) {
        this.label = label;
        this.driver = driver;
    }

    /*public void select(String text){

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath(String.format("//label[text()='%s']/..//button", label))).click();
        driver.findElement(By.xpath(String.format("//label[text()='%s']/..//span[text()='%s']", label, text))).click();*/
    public void select(String text) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
                driver.findElement(By.xpath(String.format
                ("//label[text()='%s']/..//button", label))));
        ((JavascriptExecutor)
                driver).executeScript("arguments[0].click();",
                driver.findElement(By.xpath(String.format
                ("//label[text()='%s']/..//span[text()='%s']", label, text))));

    }
}

