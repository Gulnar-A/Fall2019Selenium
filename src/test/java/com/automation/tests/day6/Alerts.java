package com.automation.tests.day6;

import com.automation.utilities.BrowsersUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Alerts {
        public static void main(String[] args) {
            WebDriver driver = DriverFactory.createDriver("chrome");
            driver.get("http://practice.cybertekschool.com/javascript_alerts");
            BrowsersUtils.wait(3);
            List<WebElement> buttons = driver.findElements(By.tagName("button"));
            buttons.get(0).click();//to click on the first button
            BrowsersUtils.wait(3);
            //to get the text from popup message
            String popupText = driver.switchTo().alert().getText();
            System.out.println(popupText);
            driver.switchTo().alert().accept();//to click OK
            String expected = "You successfully clicked an alert";
            String actual = driver.findElement(By.id("result")).getText();
            //if will fail, because there is a typo ##BUG##
            if(expected.equals(actual)){
                System.out.println("TEST PASSED");
            }else {
                System.out.println("TEST FAILED");
                System.out.println("Expected: "+expected);
                System.out.println("Actual:   "+actual);
            }
            buttons.get(1).click();//to click on the 2nd button
            BrowsersUtils.wait(3);
            //to click cancel
            driver.switchTo().alert().dismiss(); // result must be: You clicked: Cancel
            String expected2 = "You clicked: Cancel";
            String actual2 = driver.findElement(By.id("result")).getText();
            if(expected2.equals(actual2)){
                System.out.println("TEST PASSED");
            }else {
                System.out.println("TEST FAILED");
                System.out.println("Expected: "+expected2);
                System.out.println("Actual:   "+actual2);
            }
            BrowsersUtils.wait(3);
            buttons.get(2).click();
           Alert alert= driver.switchTo().alert();
           alert.sendKeys("Hello,World");
           String actual3=driver.findElement(By.id("result")).getText();
           String expected3="Hello,world";
           if(actual3.endsWith(expected3)){
               System.out.println("Test passed");
           }else{
               System.out.println("Test failed");
           }


            BrowsersUtils.wait(3);
            driver.quit();
        }
    }