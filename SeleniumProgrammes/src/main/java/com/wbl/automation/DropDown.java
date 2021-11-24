package com.wbl.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Shilpa\\Chromedriver\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://itera-qa.azurewebsites.net/home/automation");
        driver.manage().window().maximize();
        WebElement dropdown = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/select"));

        Select citydropdown = new Select(dropdown);
        citydropdown.selectByIndex(4);
        Thread.sleep(1000);
        citydropdown.selectByValue("6");
        Thread.sleep(1000);

        citydropdown.selectByVisibleText("Turkey");
        //driver.close();



    }
}
