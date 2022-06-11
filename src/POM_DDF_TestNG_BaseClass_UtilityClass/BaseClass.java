package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	public WebDriver driver;   // globally declared
	
	public void initializeBrowser()
	{
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		 
		 driver.get("https://kite.zerodha.com/");
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	

}
