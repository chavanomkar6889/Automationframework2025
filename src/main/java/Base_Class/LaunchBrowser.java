package Base_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
    public static void main(String[] args) {
        // Automatically setup ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();

        // Open a website
        driver.get("https://www.facebook.com");

        // Print the title of the page
        System.out.println("Page Title: " + driver.getTitle());
        
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        
        
        WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));

        
        Select s1 = new Select(Month);
        
        s1.selectByVisibleText("Sep");
        // Close the browser
      //  driver.quit();
    }
}
