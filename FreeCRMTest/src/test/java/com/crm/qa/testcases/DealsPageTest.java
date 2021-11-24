package com.crm.qa.testcases;

import com.crm.qa.base.BasePage;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DealsPageTest extends BasePage {
    LoginPage loginPage;
    ContactsPage contactsPage;
    HomePage homePage;
    TestUtil testutil;
    DealsPage dealsPage;
    public DealsPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        loginPage = new LoginPage();
        homePage = new HomePage();
        testutil = new TestUtil();
        contactsPage = new ContactsPage();
        dealsPage = new DealsPage();
        homePage  =  loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        testutil.switchToFrame();
        homePage.clickOnDealsLink();
        homePage.clickOnNewDealsLink();

    }
    @Test
    public void verifyNewDealsTest(){
         homePage.clickOnNewDealsLink();
    }
}
