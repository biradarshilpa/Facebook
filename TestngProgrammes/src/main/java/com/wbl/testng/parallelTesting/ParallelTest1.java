package com.wbl.testng.parallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelTest1 {

    WebDriver driver;
    @Test()
    void logoTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Shilpa\\Chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        Assert.assertTrue(logo.isDisplayed(),"Logo is not displayed");
        Thread.sleep(5000);

    }

    @Test()
    void homePageTitle() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Shilpa\\Chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(actualTitle,"OrangeHRM","Title not matched");
        Thread.sleep(5000);
    }

    @AfterMethod
    void tearDown(){
        driver.quit();
    }
}
