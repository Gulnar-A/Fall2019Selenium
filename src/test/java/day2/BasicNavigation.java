package day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(3000);

        String str = driver.getTitle();
        System.out.println("Title is " + str);

        String expected = "Google";
        if (expected.equals(str)) {
            System.out.println("Test passed");
        } else {


            System.out.println("Test failed");
        }
        driver.navigate().to("http://amazon.com");
        Thread.sleep(3000);
        if (driver.getTitle().toLowerCase().contains("http://amazon.com")) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

driver.navigate().back();
        verifyequals(driver.getTitle(),"Google");
        driver.navigate().forward();
        System.out.println("title"+ driver.getTitle());
driver.navigate().refresh();
        System.out.println(driver.getCurrentUrl());
        driver.close();
    }

    private static void verifyequals(String b, String arg2) {
        if (b.equals(arg2)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }
}