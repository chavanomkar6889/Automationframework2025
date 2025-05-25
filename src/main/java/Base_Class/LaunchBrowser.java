package Base_Class;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        // Automatically setup ChromeDriver
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        
        options.addArguments("--disable-notifications");
        
        // Launch Chrome browser
        WebDriver driver = new ChromeDriver(options);
        
        // Maximize the browser window
        driver.manage().window().maximize();

        // Open a website
        driver.get("https://academy.naveenautomationlabs.com/");

        // Print the title of the page
        System.out.println("Page Title: " + driver.getTitle());
        
        // To get current url
        System.out.println(driver.getCurrentUrl());
        
        
       Thread.sleep(3000);
       
        WebElement Demologin = driver.findElement(By.xpath("//a[contains(text(),'Demo Site')]"));
        
        Demologin.click();
        
       
        // Close the browser
      //  driver.quit();
    }
}
