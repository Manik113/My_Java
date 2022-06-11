package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_contains_use_Attribute2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		// Open FB and click on create account by using Xpath by contains
		
		driver.get("https://www.facebook.com/");  // facebook url will be open on chrome browser
		Thread.sleep(2000);
		
		  //tagname[contains(@atributename,'atributevalue')]
		
		driver.findElement(By.xpath("//a [contains(@data-testid,'open')]")).click();
		Thread.sleep(2000);
		
		driver.close();

	}

}
