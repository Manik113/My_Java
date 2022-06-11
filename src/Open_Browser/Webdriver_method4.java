package Open_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_method4
{

	public static void main(String[] args) throws InterruptedException
	{
		//   Step-I: Set path of chromedriver.exe file
		  // Parameter-I: Name of the browser
		  // Parameter-II: Path of chromedriver.exe file
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		// To enter URL on the browser/To open an application
				driver.get("https://www.flipkart.com/");  //Flipkart URL .copy here
				
			// wait/ pause
			  Thread.sleep(2000);
			      
		 //Close browser
			  driver.close();  //for automatic close the open window close() method is call

	}

}
