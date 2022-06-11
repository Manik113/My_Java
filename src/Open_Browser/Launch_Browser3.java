package Open_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser3 
{

	public static void main(String[] args)
	{
		//set path of chromedriver.exe file
		// Name of browser
		// path of Chromedriver.exe file
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe");
		
		// Create object of chromedriver class & provide reference of Webdriver interface
		
		WebDriver driver=new ChromeDriver();
		

	}

}
