package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_atrribute_Flipkart 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://www.flipkart.com/"); // open flipkart url on chrome browser
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input [@class='_2IX_2- VJZDxU']")).sendKeys("1234567891"); // mobile no
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input [@type='password']")).sendKeys("Mumbai@123");
		Thread.sleep(2000);
		driver.close();

	}

}
