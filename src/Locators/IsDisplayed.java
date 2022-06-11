package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				  "C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.facebook.com/");
		  
		  Thread.sleep(2000);
		  
		  // i want to inpect facebook logo is displayed or not
		 boolean Result= driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		 
		 System.out.println("Facebook logo is Displayed:" +Result);  // true

	}

}
