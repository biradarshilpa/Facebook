package com.wbl.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mouseover {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Shilpa\\Chromedriver\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.functionize.com/demo");
        driver.manage().window().maximize();
        Actions action = new Actions(driver);
        WebElement solutions=driver.findElement(By.xpath("//div[@id='w-dropdown-toggle-1']"));
        action.moveToElement(solutions).perform();
        WebElement ds = driver.findElement(By.linkText("Data Science"));
        ds.click();
        WebElement vt = driver.findElement(By.linkText("Visual Testing"));
        vt.click();
        WebElement demo = driver.findElement(By.linkText("Demo"));
        demo.click();
        WebElement jobrole = driver.findElement(By.name("job_role"));
        Select select = new Select(jobrole);
        select.selectByIndex(4);
        select.selectByValue("CIO / CTO");
        select.selectByVisibleText("Other");
    }
}
