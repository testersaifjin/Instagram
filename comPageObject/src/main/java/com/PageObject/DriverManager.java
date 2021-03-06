package com.PageObject;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager {

    static WebDriver driver;

//    @Before
    public void invokeBrowser() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        driver = new ChromeDriver();
//        driver=new FirefoxDriver();
//        driver.get("https://www.instagram.com/accounts/login/?hl=en");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);


    }

//    @After
    public void closeBrowser() {
        driver.quit();
    }
}
