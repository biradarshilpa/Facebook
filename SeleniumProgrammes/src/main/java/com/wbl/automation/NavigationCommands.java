package com.wbl.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NavigationCommands {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Shilpa\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       /* driver.get("https://www.toolsqa.com/selenium-training/");
        WebElement join = driver.findElement(By.xpath("//a[@class='btn btn-primary-shadow btn-block']"));
        join.click();
        Thread.sleep(2000);
        driver.navigate().back();
        // Thread.sleep(2000);
        // driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();*/

        driver.get("https://www.walmart.com/");
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/");
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        driver.navigate().forward();
        driver.navigate().refresh();




    }
}
