package tests;

import dto.Contact;
import org.testng.annotations.Test;

public class ContactTest extends BaseTest {
    @Test
    public void login() {
        loginPage.open();
        loginPage.login("tashapas@sandbox.com", "marylandOC99");
        createContactPage.open();
        createContactPage.createNew();

        Contact contact = new Contact("Lich", "Alevtina", "Mrs.", "375442598632", "3754826589",
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