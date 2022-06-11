package Open_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Method1
{

	public static void main(String[] args) 
	{
		  // Step-I: Set path of chromedriver.exe file
		  //Parameter-I: Name of the browser
		  //Parameter-II: Path of chromedriver.exe file
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe");
		
		//Create object of chromedriver class and provide reference of  Webdriver interface  
		
		WebDriver driver=new ChromeDriver();
		
		// To enter URL on the browser/To open an application
		
		driver.get("https://www.google.com/");   //get() is a non-static method of webdriver
			

	}

}
