package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				  "C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.facebook.com/");
		  
		  Thread.sleep(2000);
		  
		  // verify login button is enabled or disabled
		 // driver.findElement(By.linkText("Log In")).click();  // path by LinkText
		  
		 boolean Button= driver.findElement(By.xpath("//button[text()='Log In']")).isEnabled();
		  
		  System.out.println("Login button is Enabled:" +Button);
		  
		  driver.close();
		  
		
	}

}
