package com.crm.qa.testcases;

import com.crm.qa.base.BasePage;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ContactsPageTest extends BasePage {

   LoginPage loginPage;
   ContactsPage contactsPage;
   HomePage homePage;
   TestUtil testutil;

    public ContactsPageTest() {
       super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        loginPage = new LoginPage();
        homePage = new HomePage();
        testutil = new TestUtil();
        contactsPage = new ContactsPage();
        homePage  =  loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        testutil.switchToFrame();
        contactsPage = homePage.clickOnContactsLink();
    }

    @Test(priority = 1)
    public void validateContactsLabelTest(){
        boolean label = contactsPage.validateContactsLabel();
        Assert.assertTrue(label);

    }

    @Test(priority = 2)
    public void validateSelectContactsNameTest() {
        boolean check = contactsPage.selectContacts();
        Assert.assertTrue(check);
    }

    @Test(priority = 3)
    public void validateCreateNewContactTest(){
       // homePage.clickOnNewContactLink();
        contactsPage.createNewContact();

    }

    @AfterMethod
    public void tearDown(){

        driver.quit();
    }

}
