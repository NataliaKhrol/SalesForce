package tests;

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

        new CreateContactPage(driver).create("Rak", "Alevtina", "Mrs.", "+375202658964",
                "+37517526985", "engineer", "Department of beauty", "01/09/1979",
                "Web", "Odoevskogo");
    }
}
