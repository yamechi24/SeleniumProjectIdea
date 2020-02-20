package com.yarautomation.test;
import com.yarautomation.test.WebDriverCall;
import com.yarautomation.test.Browsers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Checkbox {
    static String browser;
    static WebDriver driver;

    public static void runTest() {
        driver.findElement(By.id("isAgeSelected")).click();
        String message = driver.findElement(By.id("txtAge")).getText();
        System.out.println(message);

        driver.findElement(By.id("check1")).click();
        WebElement valueText = driver.findElement(By.id("check1"));
        String text = valueText.getAttribute("value");
        System.out.println("Checkbox is displayed as: " +text);

        List<WebElement> cbs = driver.findElements(By.className("cb1-element"));

        // List<WebElement els = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for ( WebElement cb : cbs ) {
            if ( cb.isSelected() ) {
                cb.click();
            }
        }

        String text2 = valueText.getAttribute("value");
        System.out.println("Checkbox is displayed as: " +text2);
    }
}
