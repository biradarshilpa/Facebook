package com.wbl.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowsHandler {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Shilpa\\Chromedriver\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@id ='windowButton']")).click();
        String parentwindow = driver.getWindowHandle();
        Set<String> allwindows = driver.getWindowHandles();
        Iterator <String> iterator = allwindows.iterator();
       // while(iterator.hasNext()){
           // String windows = iterator.hasNext();
          //  if(!parentwindow.equalsIgnoreCase()){

         //   }
      //  }

    }
}
