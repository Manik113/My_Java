package ManikPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Enable_Disable {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				  "C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.facebook.com/");
		
		// check the is enable or disable
		  
		driver.findElement(By.id("email")); // address of Email address or phone number
		
		WebElement Search=	driver.findElement(By.id("email"));
		Search.isDisplayed();
		System.out.println("Display Status:" +  Search.isDisplayed()); // true
		System.out.println("Display Status:" + Search.isEnabled());    // true
		
		
		  
	}

}
