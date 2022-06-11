package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_ByIndex12 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/"); // open facebook url
		
		// Click on create new account
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		//click on first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Virat");
		Thread.sleep(2000);
		
		//click on Surname
		/*driver.findElement(By.xpath("(//input[@type=\"text\"])[3]")).sendKeys("Kohli");
		Thread.sleep(2000);
		
		//click on Mobile number or Email Address
		driver.findElement(By.xpath("(//input[@type=\"text\"])[4]")).sendKeys("1234123456");
		Thread.sleep(2000);
		
		driver.close();*/
	}

}
