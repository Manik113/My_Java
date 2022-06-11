package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/V4/");  // enter the url
		
		// Enter the user id
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Manik");
		
	   // Enter the password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Manik@123");
		
	 // click on submit button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		
		// shift focus to alert pop-up
		Alert alt=driver.switchTo().alert();
		
		// Wait 
		Thread.sleep(2000);
		
		// click on ok button
		alt.accept();
		
		
		
	}

}
