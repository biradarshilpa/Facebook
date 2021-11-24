package com.wbl.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWindows {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Shilpa\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        System.out.println(driver.getTitle());
        WebElement newtab = driver.findElement(By.xpath("//button[@id = 'tabButton']"));
        newtab.click();


    }
}
