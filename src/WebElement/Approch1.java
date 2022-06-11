package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Approch1
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				  "C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.facebook.com/");
		  
		  Thread.sleep(2000);
		  
		  // Enter the username
		  driver.findElement(By.id("email")).sendKeys("ABCD");
		  
		  // Enter the password
		  driver.findElement(By.id("pass")).sendKeys("Abc@123");


	}

}
