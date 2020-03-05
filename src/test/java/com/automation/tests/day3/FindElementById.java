package com.automation.tests.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementById {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/login");
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("SuperSecretPassword");
        driver.findElement(By.id("wooden_spoon")).click();
        Thread.sleep(2000);
        String expected = "Welcome to the Secure Area. When you are done click logout below.";
        String actual = driver.findElement(By.tagName("h4")).getText();
        if (expected.equals(actual)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
            WebElement logout = driver.findElement(By.partialLinkText("Logout"));
            String href = logout.getAttribute("href");
            System.out.println(href);
            String classname = logout.getAttribute("class");
            System.out.println(classname);
            logout.click();
            Thread.sleep(3000);
            driver.findElement(By.name("username")).sendKeys("wrong");
            driver.findElement(By.name("password")).sendKeys("wrong");
driver.findElement(By.id("wooden_spoon"));
WebElement errorMessage=driver.findElement(By.id("flash-messages"));
        System.out.println(errorMessage.getText());
            driver.quit();

    }
}
