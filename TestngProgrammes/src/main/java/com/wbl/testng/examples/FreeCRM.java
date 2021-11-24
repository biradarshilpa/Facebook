package com.wbl.testng.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FreeCRM {

    WebDriver driver;
    @BeforeClass
    void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Shilpa\\Chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();//launch the browser
        driver.get("https://classic.freecrm.com/index.html");//open the url
    }

    @Test(priority = 1)
    void login(){
        WebElement username = driver.findElement(By.xpath("//input[@placeholder = 'Username']"));
        username.sendKeys("tsetusershilpa");
        WebElement password = driver.findElement (By.xpath( "//input[@placeholder = 'Password']"));
        password.sendKeys("testusershilpa1");
        WebElement login = driver.findElement(By.xpath("//input[@type = 'submit']"));
        login.click();
        WebElement contacts = driver.findElement(By.xpath("\"//a[contains(text(),'Contacts')]\""));
        WebElement title = driver.findElement(By.name("title"));
        Select select = new Select(title);
        select.selectByVisibleText("Mr.");
        WebElement firstname = driver.findElement(By.xpath ( "//input[@id = 'first_name']"));
        firstname.sendKeys("aaa");
        WebElement lastname = driver.findElement(By.xpath ( "//input[@id = 'surname']"));
        lastname.sendKeys("bbb");
        WebElement save = driver.findElement(By.xpath ( "//input[@type='submit' and @value ='Save']"));

        save.click();




    }


}
