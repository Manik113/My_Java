package Open_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimize_window 
{
	public static void main(String[] args) throws InterruptedException
	{
	//  Step-I: Set path of chromedriver.exe file
	    // Parameter-I: Name of the browser
	    // Parameter-II: Path of chromedriver.exe file
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		// create object of Chromedriver with reference of webdriver interface
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://www.youtube.com/"); // get the url or enter url on open browser
		Thread.sleep(2000); // take pause for 2 seconds
		
		driver.manage().window().minimize(); // minimize the open window on the browser
		Thread.sleep(2000); // take pause for 2 seconds
		
		System.out.println(driver.getTitle()); // get title of current open url
		System.out.println(driver.getCurrentUrl());// get current url 
		
		//System.out.println(driver.getPageSource()); // get page source 
		
		

	}

}
