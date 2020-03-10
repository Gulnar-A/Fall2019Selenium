package com.automation.tests.day6;

import com.automation.utilities.BrowsersUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdowns {
    public static void main(String[] args) {
        WebDriver driver= DriverFactory.createDriver("chrome");
        driver.get(" http://practice.cybertekschool.com/dropdown");
        BrowsersUtils.wait(2);
        WebElement simpledropdown=driver.findElement(By.id("dropdown"));

        Select selectSimpleDropDown=new Select(simpledropdown);
        selectSimpleDropDown.selectByVisibleText("Option 2");
        Select selectYear=new Select(driver.findElement(By.id("year")));
        Select selectMonth=new Select(driver.findElement(By.id("month")));
        Select selectDay=new Select(driver.findElement(By.id("day")));
        BrowsersUtils.wait(5);


        selectYear.selectByVisibleText("2003");
        selectMonth.selectByVisibleText("February");
        selectDay.selectByVisibleText("25");
        List<WebElement> months=selectMonth.getOptions();
        for(WebElement eachmonth: months){
            String monthName=eachmonth.getText();
            selectMonth.selectByVisibleText(monthName);
        }
        BrowsersUtils.wait(2);
        driver.quit();
    }
}
