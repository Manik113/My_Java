package Open_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_url
{

	public static void main(String[] args) throws InterruptedException
	{
		 // Step-I: Set path of chromedriver.exe file
		  //Parameter-I: Name of the browser
		  //Parameter-II: Path of chromedriver.exe file
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe");
		
		// create object of Chromedriver class and provide reference of Webdriver interface
		
		WebDriver driver=new ChromeDriver();
		
		// to enter URL on the browser/ open any web application
		     driver.get("https://www.google.com/");  //get() is a non-static method of webdriver 
		                   // ie. call the method like objectname.methodname();
		
		   //Wait/Pause
	         Thread.sleep(2000);   // take pause of 2 second
	         
	    //Close browser/to close current tab of browser
	         driver.close();
	}

}
