package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import wrappers.Dropdown;
import wrappers.Input;
import wrappers.TextArea;

public class CreateAccountPage extends BasePage {
    private By NEW_BUTTON = By.cssSelector("[title=New]");;

   public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(BASE_URL + "lightning/o/Account/list?filterName=Recent");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
                ("//span[text()='Accounts' and @class='slds-context-bar__label-action slds-p-left--xx-small']")));

    }
    public void createNew(){
        driver.findElement(NEW_BUTTON).click();
    }
    public void create(String lastName, String firstName, String salutation, String phone, String homePhone,
                       String title, String department, String birthdate,  String leadSource, String mailingStreet) {
        new Input("Last Name", driver).write(lastName);
        new Input("First Name", driver).write(firstName);
        new Dropdown("Salutation", driver).select(salutation);
        new Input("Phone", driver).write(phone);
        new Input("Home Phone", driver).write(homePhone);
      //  new Input("Home HomePhone", driver).write("524");
        new Input("Title", driver).write(title);
        new Input("Department", driver).write(department);
        new Input("Birthdate", driver).write(birthdate);
        new Dropdown("Lead Source", driver).select(leadSource);
        new TextArea("Mailing Street", driver).write(mailingStreet);


    }
}