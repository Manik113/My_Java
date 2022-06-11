package Open_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_method3 
{

	public static void main(String[] args) throws InterruptedException 
	{
		 // Step-I: Set path of chromedriver.exe file
		  //Parameter-I: Name of the browser
		  //Parameter-II: Path of chromedriver.exe file
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe"); // set chrome browser
		
		 //Create object of chromedriver class and provide reference of  Webdriver interface  
		WebDriver driver=new ChromeDriver();
		
		// To enter URL on the browser/To open an application
		driver.get("https://www.youtube.com/");  //Youtube URL .copy here
		
		// wait / pause for 2 seconds
		Thread.sleep(2000);
		
		//Close the browser/to close all the tabs present on the browser
		driver.quit();

	}

}
