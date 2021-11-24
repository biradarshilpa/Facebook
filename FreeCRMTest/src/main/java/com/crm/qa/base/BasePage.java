package com.crm.qa.base;

import jdk.internal.dynalink.beans.StaticClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static com.crm.qa.util.TestUtil.IMPLICIT_WAIT;
import static com.crm.qa.util.TestUtil.PAGE_LOAD_TIMEOUT;

public class BasePage {


    public static WebDriver driver;
    public static Properties prop;

    public BasePage() {

        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream("C:\\Users\\sunil\\IdeaProjects"
                    + "\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
            prop.load(ip);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void initialization() {
        String browserName = prop.getProperty("browser");
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Shilpa\\Chromedriver\\chromedriver.exe");
            driver = new ChromeDriver();
        } else
        {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\sunil\\Desktop\\geckodriver.exe");
            driver = new FirefoxDriver();
        }


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();

        driver.get(prop.getProperty("url"));
    }

}
