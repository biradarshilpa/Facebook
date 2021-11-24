package com.wbl.testng.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionExamples {
    WebDriver driver;
    @BeforeClass
    void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Shilpa\\Chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();//launch the browser
        driver.get("https://opensource-demo.orangehrmlive.com/");//open the url


    }

    @Test(priority = 1)
    void logoTest(){
     WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
     Assert.assertTrue(logo.isDisplayed(),"logo is not displayed");

    }

    @Test(priority = 2)
    void  homePageTitle() {
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(actualTitle, "OrangeHRM", "Title is not matched");
    }
@AfterClass
    void TearDown(){
       driver.close();
    }


}
