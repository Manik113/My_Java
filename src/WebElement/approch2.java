package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class approch2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				  "C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.facebook.com/");
		  
		  Thread.sleep(2000);
		  
		  // Enter the username
		  driver.findElement(By.id("email"));
		 WebElement UN=driver.findElement(By.id("email"));
		 
		  UN.sendKeys("Virat");  // Enter the input
		  Thread.sleep(2000);
		  
		  UN.clear();           // Clear the input
		  Thread.sleep(2000);
		  
		  UN.sendKeys("Rohit");
		  Thread.sleep(2000);
		  
		  driver.close();

	}

}
