package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Annotations1 
{
	@BeforeClass
	public void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		Reporter.log("Browser is open",true);
	}
	
	@BeforeMethod
	public void Login()
	{
		Reporter.log("Login to app", true);
	}
	
	@Test
	public void TC1()
	{
		Reporter.log("Test case 1",true);
	}
	@Test
	public void TC2()
	{
		Reporter.log("Test case 2",true);
	}
	
	@AfterMethod
	public void Logout()
	{
		Reporter.log("Log out ",true);
	}
	@AfterClass
	public void CloseBrowser()
	{
		Reporter.log("Close the browser",true);
	}
	
    
    

}
