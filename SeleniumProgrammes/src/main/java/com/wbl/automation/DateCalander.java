package com.wbl.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DateCalander {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Shilpa\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        WebElement d = driver.findElement(By.id("ctl00_mainContent_view_date1"));
        d.click();
        d.sendKeys("9302021");


    }
}
