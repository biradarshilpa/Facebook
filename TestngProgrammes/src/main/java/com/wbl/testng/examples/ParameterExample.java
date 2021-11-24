package com.wbl.testng.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SuiteRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {
    WebDriver driver;

    @BeforeClass
    @Parameters({"browser", "url"})
    void setUp(String browser, String app) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Shilpa\\Chromedriver\\chromedriver.exe");
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\sunil\\Desktop\\geckodriver.exe");
            driver = new FirefoxDriver();


        }
        driver.get(app);
    }

    @Test(priority = 1)
    void loginTest() {
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        Assert.assertTrue(logo.isDisplayed(), "logo is not displayed");
    }

    @Test(priority = 2)
    void homePageTitle() {
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(actualTitle, "OrangeHRM", "Title is not matched");
    }

    @AfterClass
    void tearDown() {
        driver.close();
    }

}