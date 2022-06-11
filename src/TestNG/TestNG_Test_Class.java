package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_Test_Class 
{
	
	@Test public void m1() throws InterruptedException    // Test method or Test class
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
				
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://kite.zerodha.com/");
				
				driver.manage().window().maximize();
				
				Thread.sleep(3000);
				
				driver.close();
	}

}
