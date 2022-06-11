package ManikPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args)
	{
		// 1 open Chrome Browser
	System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
				
	WebDriver driver=new ChromeDriver(); // Object create of chromedriver with reference to WebDriver
	
	// open url on browser
	driver.get("https://login.upstox.com/"); // Upstox login url
	
	System.out.println("URL Is:"  + driver.getCurrentUrl());  // get the current url 
	
	System.out.println("Title of URL :"  + driver.getTitle());     // Get title of url
	
	
	System.out.println(driver.getPageSource());  // get page source of ie code 

	}

}
