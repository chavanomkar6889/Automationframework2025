package Base_Class;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewCustomer {
	public static void main(String[] args) throws InterruptedException

	{

		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();

		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.get("https://academy.naveenautomationlabs.com/");

		WebElement demo = driver.findElement(By.xpath("//a[contains(text(),'Demo Site')]"));

		demo.click();
		
		Thread.sleep(2000);

		Set<String> Win = driver.getWindowHandles();

		ArrayList<String> Ar = new ArrayList<String>(Win);

		String mainpage = Ar.get(0);
		System.out.println(mainpage);

		String popup = Ar.get(1);
		System.out.println(popup);
		
		driver.switchTo().window(popup);

		Thread.sleep(2000);

		WebElement customer = driver.findElement(By.xpath("//a[contains(text(),'Continue')]"));
		
		Thread.sleep(2000);
		
		customer.click();

		 WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		 WebElement lname = driver.findElement(By.xpath("//input[@name='lastname']"));
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		
		WebElement tel = driver.findElement(By.xpath("//input[@name='telephone']"));
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		
		WebElement cpass = driver.findElement(By.xpath("//input[@name='confirm']"));
		
		WebElement cbox = driver.findElement(By.xpath("//input[@name='agree']"));
		
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		
		
		
		
		
	
		Thread.sleep(2000);
	
		fname.sendKeys("Omkar");
		
		lname.sendKeys("Chavan");
		
		email.sendKeys("chavanomkar12@gmail.com");
		
		tel.sendKeys("9921626889");
		
		pass.sendKeys("Gabber3018$");
		
		cpass.sendKeys("Gabber3018$");
		
		cbox.click();
		
		submit.click();
		
		Thread.sleep(5000);
		
		WebElement con = driver.findElement(By.xpath("//a[@class='btn btn-primary']")); 
		
	   con.click(); 
		
		
		
		
	}

}
