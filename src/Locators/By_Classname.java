package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_Classname
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				  "C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.facebook.com/");
		
		  // click on username by Classname
		  driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("ABCD");
		  
		  // click on password
		 // driver.findElement(By.className("inputtext _55r1 _6luy _9npi")).sendKeys("Abc@123");
		  
		  
		 // "inputtext _55r1 _6luy"
	}

}
