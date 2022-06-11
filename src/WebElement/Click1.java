package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				  "C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.facebook.com/");
		  
		  Thread.sleep(2000);
		  
		  // Enter the username
		  driver.findElement(By.id("email"));
		 WebElement UN=driver.findElement(By.id("email"));
		 
		 Thread.sleep(2000);
		 
		 // click on forgotten link
		 driver.findElement(By.linkText("Forgotten password?")).click();
		 
		 // Enter the Email Address or Email
		 driver.findElement(By.xpath("//input[@type='text']"));
		WebElement EnterEmail= driver.findElement(By.xpath("//input[@type='text']"));
		
		EnterEmail.sendKeys("Virat@123");
		
		driver.quit();

	}

}
