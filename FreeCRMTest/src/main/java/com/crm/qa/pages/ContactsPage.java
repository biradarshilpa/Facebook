package com.crm.qa.pages;

import com.crm.qa.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactsPage extends BasePage {

    @FindBy(xpath = "//td[contains(text() , 'Contacts')]")
    WebElement contactsLabel;

    @FindBy(xpath = "//input[@id = 'first_name']")
    WebElement firstName;
    @FindBy(xpath = "//input[@id = 'surname']")
    WebElement lastName;
    @FindBy(name = "client_lookup")
    WebElement company;
    @FindBy(xpath = "//input[@type='submit' and @value ='Save']")
    WebElement saveBtn;

    public ContactsPage(){
        PageFactory.initElements(driver,this);
    }

    public boolean validateContactsLabel(){
        return contactsLabel.isDisplayed();
    }

    public boolean selectContacts(){
       WebElement name = driver.findElement(By.xpath("//a[text()='Arohi sunil']//parent::td[@class='datalistrow']"
               + "//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']"));
       name.click();
       return name.isSelected();
    }

    public void createNewContact(){
      // WebElement title = driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[2]/td[1]/table/tbody/tr[1]/td[2]/select"));
       // Select select = new Select(title);
       // select.selectByVisibleText("Mr.");

        firstName.sendKeys("aaa");
        lastName.sendKeys("bbb");
        company.sendKeys("watsapp");

        saveBtn.click();




    }


}
