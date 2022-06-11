package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_Attribute
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/"); // open facebook url on chrome browser
		Thread.sleep(2000);
		//enter username as Virat
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Virat"); // Username = Virat
		Thread.sleep(2000);
		// Enter password Kohli@123
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Kohli@123"); // Password= Kohli@123
		
		System.out.println("Path Location is:" +driver.findElement(By.xpath("//input[@name='pass']")) );
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@value='1']"));
	}

}
