package com.wbl.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Shilpa\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://itera-qa.azurewebsites.net/home/automation");
        driver.manage().window().maximize();
        WebElement female = driver.findElement(By.id("female"));
        boolean select = female.isSelected();
        if (select == false){
            female.click();
        }
        Thread.sleep(2000);
        WebElement male = driver.findElement(By.id("male"));
        boolean select1 = male.isDisplayed();
        if (select1 == true){
           boolean select2 = male.isSelected();
           if(select2== false) {
                male.click();
            }
        }


    }
}
