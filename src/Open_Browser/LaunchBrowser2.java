package Open_Browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser2 
{

	public static void main(String[] args) 
	{
		// Step-I: Set path of chromedriver.exe file
		  //Parameter-I: Name of the browser
		  //Parameter-II: Path of chromedriver.exe file
		
		  System.setProperty("webdriver.chrome.driver", 
				  "\\C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		  
		  
		  //Create object of chromedriver class  
		   ChromeDriver driver=new  ChromeDriver();      //classname objectname=new classname();
		  
		  

	}

}
