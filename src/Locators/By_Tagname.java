package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_Tagname 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				  "C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("file:///C:/Users/Manik%20Kohale/Desktop/Velocity%20Software%20Testing/HTML/tagname.html");
		  
		  driver.findElement(By.tagName("input")).sendKeys("Rohit");

	}

}
