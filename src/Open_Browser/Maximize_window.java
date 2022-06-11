package Open_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize_window 
{
	public static void main(String[] args) throws InterruptedException 
	{
	//  Step-I: Set path of chromedriver.exe file
	    // Parameter-I: Name of the browser
	    // Parameter-II: Path of chromedriver.exe file
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		
		//create object of chromedriver with reference to the webdriver interface
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.youtube.com/"); // to enter url or open url
		
		Thread.sleep(3000); // pause or wait for some seconds
		
		driver.manage().window().maximize(); //To maximize the browser window
		Thread.sleep(3000); // pause or wait for some seconds
		driver.close();

	}

}
