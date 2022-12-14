package pages;

import dto.Contact;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import wrappers.Dropdown;
import wrappers.Input;
import wrappers.TextArea;

import java.time.Duration;

@Log4j2
public class CreateContactPage extends BasePage {
    private By NEW_BUTTON = By.cssSelector("[title=New]");


    public CreateContactPage(WebDriver driver) {
        super(driver);
    }

    @Step("Open new page '{Contact}'")
    public void open() {
        driver.get(BASE_URL + "lightning/o/Contact/list?filterName=Recent");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Contacts' and @class='slds-truncate']")));
    }

    @Step("Redirect to new page")
    public void createNew() {
        driver.findElement(NEW_BUTTON).click();
    }

    @Step("Create new Contact by filling lots of personal data")
    public void create(Contact contact) {
        log.info("Creating contact '{}'", contact);
        new Input("Last Name", driver).write(contact.getLastName());
        new Input("First Name", driver).write(contact.getFirstName());
        new Dropdown("Salutation", driver).select(contact.getSalutation());
        new Input("Phone", driver).write(contact.getPhone());
        new Input("Home Phone", driver).write(contact.getHomePhone());
        //  new Input("Home HomePhone", driver).write("524");
        new Input("Title", driver).write(contact.getTitle());
        new Input("Department", driver).write(contact.getDepartment());
        new Input("Birthdate", driver).write(contact.getBirthdate());
        new Dropdown("Lead Source", driver).select(contact.getLeadSource());
        new TextArea("Mailing Street", driver).write(contact.getMailingStreet());
    }
}
/*
public class CreateContactPage extends BasePage {
    private By NEW_BUTTON = By.cssSelector("[title=New]");
    ;

    public CreateContactPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(BASE_URL + "lightning/o/Contact/list?filterName=Recent");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Contacts' and @class='slds-context-bar__label-action slds-p-left--xx-small']")));
    }

    public void createNew() {
        driver.findElement(NEW_BUTTON).click();
    }

    public void create(String lastName, String firstName, String salutation, String phone, String homePhone,
                       String title, String department, String birthdate, String leadSource, String mailingStreet) {
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
 */