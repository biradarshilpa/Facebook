package com.crm.qa.testcases;

import com.crm.qa.base.BasePage;
import com.crm.qa.pages.*;
import com.crm.qa.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BasePage {
    LoginPage loginPage;
    HomePage homePage;
    TestUtil testutil;
    ContactsPage contactsPage;
    DealsPage dealsPage;
    CasesPage casesPage;
    public HomePageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
        testutil = new TestUtil();
        contactsPage = new ContactsPage();
        dealsPage = new DealsPage();
        casesPage = new CasesPage();

       homePage =  loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }

    @Test(priority=1)
    public void validateHomepageTitleTest(){
       String actualTitle = homePage.validateHomePageTitle();
        Assert.assertEquals(actualTitle,"CRMPRO", "home page title is not matched");
    }

    @Test(priority = 2)

    public void validateHomeLogoTest(){
        testutil.switchToFrame();
       boolean logo = homePage.validateHomeLogo();
       Assert.assertTrue(logo);

    }

    @Test(priority = 3)
    public void validateHomepageUser(){
       testutil.switchToFrame();
       boolean name =  homePage.validateUser();
        Assert.assertTrue(name);

    }
   @Test(priority = 4)
    public void clickOnContactsLinkTest(){
        testutil.switchToFrame();
     contactsPage = homePage.clickOnContactsLink();
    }
    @Test(priority = 5)
    public void clickOnDealsLinkTest(){
        testutil.switchToFrame();
      dealsPage = homePage.clickOnDealsLink();
    }

    @Test(priority = 6)
    public void clickOnCasesLinkTest(){
        testutil.switchToFrame();
       casesPage = homePage.clickOnCasesLink();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
