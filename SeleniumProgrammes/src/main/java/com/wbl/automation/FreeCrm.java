package com.wbl.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FreeCrm {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Shilpa\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://classic.freecrm.com/index.html");
        driver.manage().window().maximize();
        WebElement user =driver.findElement(By.xpath("//input[@placeholder = 'Username']"));
        WebElement pwd =driver.findElement(By.xpath("//input[@placeholder = 'Password']"));
        user.sendKeys("testusershilpa");
        pwd.sendKeys("testusershilpa1");
        WebElement login=driver.findElement(By.xpath("//input[@type = 'submit']"));
        login.click();
        driver.switchTo().frame("mainpanel");
        WebElement contact = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
       contact.click();
       driver.navigate().back();
        driver.switchTo().frame("mainpanel");
        WebElement contact1 = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
        Actions action = new Actions(driver);
        action.moveToElement(contact1).build().perform();
        WebElement newcontact = driver.findElement(By.xpath("//a[contains(text(),'New Contact')]"));
       // action.moveToElement(newcontact).build().perform();
        newcontact.click();
        WebElement newcontact1 = driver.findElement(By.xpath("//a[contains(text(),'New Contact')]"));
        newcontact1.click();
       // driver.switchTo().frame("mainpanel");
       // WebElement titl = driver.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[2]/td[1]/table/tbody/tr[1]/td[2]/select"));
       // Select select = new Select(titl);
       // select.selectByIndex(2);


    }
}