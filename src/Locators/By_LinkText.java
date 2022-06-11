package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_LinkText
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				  "C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.facebook.com/");
		  
		  Thread.sleep(2000);
		  
		  // click on login button by using linkText address
		  driver.findElement(By.linkText("Log In")).click();
		
	}

}
