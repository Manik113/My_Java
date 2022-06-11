package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_Name 
{

	public static void main(String[] args) throws InterruptedException 
	{
	  System.setProperty("webdriver.chrome.driver",
			  "C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.facebook.com/");
	 
	  
	  // Click on Email address or Phone Number by using Name locator
	  driver.findElement(By.name("email")).sendKeys("Virat");
	  Thread.sleep(1000);
	  
	  // click on password by using name locator
	  driver.findElement(By.name("pass")).sendKeys("abc@123");
	  
	    driver.getCurrentUrl();     // Current url which are open on chrome browser
	   String A=driver.getCurrentUrl();   // 
	   System.out.println(A);
	   
	   System.out.println(driver.getTitle());  // get Title of that url
	   
	   
	   
	   
	   
	
	  //driver.close();

	}

}
