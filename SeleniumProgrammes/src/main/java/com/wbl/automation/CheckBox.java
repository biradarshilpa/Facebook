package com.wbl.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Shilpa\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://itera-qa.azurewebsites.net/home/automation");
        driver.manage().window().maximize();
        WebElement monday = driver.findElement(By.cssSelector("body > div.container.body-content > div:nth-child(4) > div.card-body > div:nth-child(7) > label"));
        boolean isdisplayed = monday.isDisplayed();
        System.out.println(isdisplayed);
        if (isdisplayed == true){
            monday.click();
            System.out.println(monday.isEnabled());
        }
        WebElement Thursday = driver.findElement(By.id("thursday"));
        Thursday.click();



    }
}
