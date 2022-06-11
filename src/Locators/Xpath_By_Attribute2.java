package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Attribute2 
{

	public static void main(String[] args) throws InterruptedException
	{
		//set path of chromedriver.exe.file
		//parameter1 name of browser
		//parameter2 path of driver.exe.file
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/login/");
		//Enter Username
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Rohit");
		Thread.sleep(2000);
		
		// Enter Password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Rohit@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@value='1']")).click();
	}

}
