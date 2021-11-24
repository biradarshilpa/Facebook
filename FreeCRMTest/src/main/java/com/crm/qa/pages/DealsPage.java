package com.crm.qa.pages;

import com.crm.qa.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DealsPage extends BasePage {

    @FindBy (xpath = "//input[@id = 'title']")
    WebElement title;

    @FindBy (xpath = "//input[@name = 'client_lookup']")
    WebElement company;

    @FindBy (xpath = "//input[@id = 'amount' ]")
    WebElement amount;

    @FindBy (xpath = "//input[@type  = 'submit'  and @value = 'Save' ]")
    WebElement saveButton;

    public DealsPage(){
        PageFactory.initElements(driver,this);
    }

    public void verifyNewDeals(){
        title.sendKeys("bbb");
        company.sendKeys("google");
        amount.sendKeys("1000");
        saveButton.click();
    }


}
