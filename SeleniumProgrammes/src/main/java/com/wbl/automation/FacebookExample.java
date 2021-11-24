package com.wbl.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookExample {
    public static void main(String[] args) {
       //Launch a new Chrome browser.
       //Open ToolsQA Practice Automation Page for Switch Windows: https://www.toolsqa.com/automation-practice-switch-windows/
       //Use this statement to click on a New Browser Window button "driver.findElement(By.id("New Browser Window")).click();"
       //Close the browser using close() command

       System.setProperty("webdriver.chrome.driver","C:\\Shilpa\\Chromedriver\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://demoqa.com/browser-windows");
      // driver.manage().window().maximize();
       driver.switchTo().window("www.walmart.com");
       //WebElement email =driver.findElement(By.xpath("//input[@id='email']"));
     //  email.sendKeys("shilpa@gamil.com");
     //  WebElement pwd =driver.findElement(By.xpath("//input[@id='pass']"));
     //  pwd.sendKeys("aaaaaa");
     //  WebElement login =driver.findElement(By.xpath("//button[@name = 'login']"));
    //   login.click();
       driver.close();
    }
}
