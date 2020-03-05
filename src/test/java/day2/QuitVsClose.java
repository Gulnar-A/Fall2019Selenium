package day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose  {
    public static void main(String[] args)throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://learn.cybertekschool.com/courses/283/modules");
        Thread.sleep(3000);
       // driver.close();
        driver.quit();
    }

}
