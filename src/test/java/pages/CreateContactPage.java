package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.BaseTest;
import wrappers.Input;

public class CreateContactPage extends BasePage {
   public CreateContactPage(WebDriver driver) {
        super(driver);
    }

    public void create(String lastName, String phone) {
        new Input("Last Name", driver).write(lastName);
        new Input("Phone", driver).write(phone);
        new Input("Phone", driver).write(phone);


    }
}
