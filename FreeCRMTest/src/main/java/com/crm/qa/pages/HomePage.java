package com.crm.qa.pages;

import com.crm.qa.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(xpath = "//td[contains(text(),  'User: Shilpa Biradar')]")
    WebElement username;

    @FindBy(css = "body > table:nth-child(3) > tbody > tr:nth-child(2) > td:nth-child(1) > div > table > tbody > tr > td.logo_text")
    WebElement homeLogo;

    @FindBy(xpath = "//a[contains(text(),'Contacts')]")
    WebElement contacts;

    @FindBy(xpath = "//a[contains(text(),'Deals')]")
    WebElement deals;

    @FindBy(xpath = "//a[contains(text(),'Cases')]")
    WebElement cases;

    @FindBy(css = "//*[@id=\"navmenu\"]/ul/li[4]/ul/li[1]/a")
    WebElement newContact;

    @FindBy(css = "//a[contains(text(),'New Deal')]")
    WebElement newDeals;

    //Initializing page objects

    public HomePage (){
        PageFactory.initElements(driver,this);
    }

    public String validateHomePageTitle(){
       return driver.getTitle();
    }

    public boolean validateHomeLogo(){
       return homeLogo.isDisplayed();
    }

    public boolean validateUser(){
        return username.isDisplayed();
    }

    public ContactsPage clickOnContactsLink(){
        contacts.click();
        return new ContactsPage();
    }

    public DealsPage clickOnDealsLink(){
        deals.click();
        return new DealsPage();
    }

    public CasesPage clickOnCasesLink(){
        cases.click();
        return new CasesPage();
    }

    public void clickOnNewContactLink(){
        Actions actions = new Actions(driver);
        actions.moveToElement(contacts).build().perform();
        //actions.moveToElement(newContact).perform();
        newContact.click();

    }

    public void clickOnNewDealsLink(){
        Actions actions = new Actions(driver);
        actions.moveToElement(deals).build().perform();
        actions.moveToElement(newDeals).perform();
        newDeals.click();

    }



}
