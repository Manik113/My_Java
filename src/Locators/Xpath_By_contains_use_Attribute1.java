package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_contains_use_Attribute1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// Xpath by Attribute --> By contains
		
		  System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
            WebDriver driver=new ChromeDriver();
            Thread.sleep(2000);
		
           driver.get("https://www.facebook.com/login/");
           
        // Enter Username
           driver.findElement(By.xpath("//input [contains(@placeholder,'Email address ')]")).sendKeys("Rohit");
           
      // Enter password
       driver.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys("Rohit@123");
       
       Thread.sleep(2000);
       driver.findElement(By.xpath("//button[contains(@type,'sub')]")).click();

	}

}
