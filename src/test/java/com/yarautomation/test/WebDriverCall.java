package com.yarautomation.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverCall {

    public WebDriver CreateInstance(Browsers browser) {
        if (Browsers.CHROME == browser) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\QIS8\\Tools\\drivers\\chromedriver.exe");
            return new ChromeDriver();
        } else if (Browsers.FIREFOX == browser) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\QIS8\\Tools\\drivers\\geckodriver.exe");
            //DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            return new FirefoxDriver();

        }
    }
}