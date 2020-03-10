package com.automation.tests.day5;

import com.automation.utilities.BrowsersUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonsTest {
    public static void main(String[] args) {
        WebDriver driver= DriverFactory.createDriver("chrome");
        driver.get("  http://practice.cybertekschool.com/radio_buttons  ");
        BrowsersUtils.wait(2);
        WebElement blackButton= (WebElement) driver.findElements(By.id("black"));
blackButton.click();
if(blackButton.isDisplayed()&& blackButton.isEnabled()){
    System.out.println("clicked on black button");
    blackButton.click();
}else{
    System.out.println("failed to click on black button");
}
if(blackButton.isSelected()){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }
        driver.quit();
    }
}
