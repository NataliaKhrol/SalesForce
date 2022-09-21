package tests;

import dto.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.CreateContactPage;
import pages.CreateContactPage;

public class ContactTest extends BaseTest {
    @Test
    public void login() {
        loginPage.open();
        loginPage.login("tashapas@sandbox.com", "marylandOC99");
        createContactPage.open();
        createContactPage.createNew();

        Contact contact = new Contact("Rak", "+375202658964", "Mrs.", "Alevtina", "+37517526985",
                "engineer", "Department of beauty", "01/09/1979", "Web", "Odoevskogo");


    }
}
/*
public class ContactTest extends BaseTest {
    @Test
    public void login() {
        loginPage.open();
        loginPage.login("tashapas@sandbox.com", "marylandOC99");
        createContactPage.open();
        createContactPage.createNew();


        new CreateContactPage(driver).create("Rak", "+375202658964", "Mrs.", "Alevtina", "+37517526985
                , "engineer", "Department of beauty", "01/09/1979",
                "Web", "Odoevskogo");
    }
 */