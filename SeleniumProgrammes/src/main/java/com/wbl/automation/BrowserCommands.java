package com.wbl.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

    public static void main(String[] args) {

        //Practice Exercise - 1
        //Launch a new Chrome browser.
        //Open Shop.DemoQA.com
        //Get Page Title name and Title length
        //Print Page Title and Title length on the Eclipse Console.
        //Get Page URL and verify if it is a correct page opened
        //Get Page Source (HTML Source code) and Page Source length
        //Print Page Length on Eclipse Console.
        //Close the Browser.

        System.setProperty("webdriver.chrome.driver","C:\\Shilpa\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.walmart.com/";
        driver.get(url);
        System.out.println(driver.getTitle());
        int title = driver.getTitle().length();
        System.out.println("Length of the Title "+title);
        String actualurl= driver.getCurrentUrl();
        if(actualurl.equals(url)){
            System.out.println("verification successful");
        }
        else {
            System.out.println("verification unsuccessful");
            System.out.println(url);
            System.out.println(actualurl);
        }
        String pagesource= driver.getPageSource();
       // System.out.println(pagesource);

        driver.close();
    }

}
