package com.crm.qa.pages;

import com.crm.qa.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//input[@placeholder = 'Username']")
    WebElement username;

    @FindBy(xpath = "//input[@placeholder = 'Password']")
    WebElement password;

    @FindBy(xpath = "/html/body/div[2]/div/div[1]/a/img")
    WebElement CRMLogo;

    @FindBy(xpath = "//input[@type = 'submit']")
    WebElement loginBtn;

    @FindBy(linkText = "Sign Up")
    WebElement signupBtn;

//initializing the page objects
    public LoginPage (){
        PageFactory.initElements(driver,this);
    }

    public String validateLoginPageTitle(){
        return driver.getTitle();
    }

    public boolean validateLoginPageLogo(){
        return CRMLogo.isDisplayed();
    }

    public HomePage login(String un, String pwd){
        username.sendKeys(un);
        password.sendKeys(pwd);
        loginBtn.click();
        return new HomePage();


    }


}
