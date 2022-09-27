package pages;

import io.qameta.allure.Step;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import wrappers.Dropdown;
import wrappers.Input;
import wrappers.TextArea;

@Log4j2

public class CreateAccountPage extends BasePage {
    private By NEW_BUTTON = By.cssSelector("[title=New]");

   public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    @Step("Open new page '{Account}'")
    public void open() {
        driver.get(BASE_URL + "lightning/o/Account/list?filterName=Recent");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
                ("//span[text()='Accounts' and @class='slds-var-p-right_x-small']")));
        driver.findElement(By.cssSelector("[title='Accounts']")).click();
    }

    @Step("Create new Contact by filling lots of personal data")
    public void createAccount(){
        driver.findElement(NEW_BUTTON).click();
    }
    public void create(String rating, String accountName, String phone, String fax, String accountNumber, String type,
                       String billingStreet, String shippingStreet) {
       log.info("Creating account: '{}'", accountName);
        new Dropdown("Rating", driver).select(rating);
        new Input("Account Name", driver).write(accountName);
        new Input("Phone", driver).write(phone);
        new Input("Fax", driver).write(phone);
        new Input("Account Number", driver).write(phone);
        new  Dropdown("Type", driver).select(type);
        new TextArea("Billing Street", driver).write(billingStreet);
        new TextArea("Shipping Street", driver).write(shippingStreet);

    }
}
