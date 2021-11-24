package com.wbl.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Shilpa\\Chromedriver\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/?m=1");
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        WebElement from = driver.findElement(By.id("draggable"));
        WebElement to = driver.findElement(By.id("droppable"));
        actions.dragAndDrop(from,to).perform();
        WebElement source = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]/img"));
        WebElement destination = driver.findElement(By.xpath("//*[@id=\"trash\"]"));
        actions.dragAndDrop(source,destination).perform();
        WebElement source1 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[2]/img"));
        WebElement destination1 = driver.findElement(By.xpath("//*[@id=\"trash\"]"));
        actions.dragAndDrop(source1,destination1).perform();

    }
}
