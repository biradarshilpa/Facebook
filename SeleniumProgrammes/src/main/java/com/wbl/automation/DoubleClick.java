package com.wbl.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Shilpa\\Chromedriver\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/?m=1");
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        WebElement clickme = driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
        actions.doubleClick(clickme).perform();
    }
}
