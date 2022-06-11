package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_contains_usingText1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//tagname[contains(text(),'text')]
		//click on Forgotten password
		
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
