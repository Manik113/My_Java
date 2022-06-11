package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Annotations 
{
	@BeforeClass
	public void OpenBrowser()
	{
		Reporter.log("Open the browser", true);
		
	}
	
	@BeforeMethod
	public void LoginToApp()
	{
		Reporter.log("Login the app",true);
	}
	
	@Test
	public void TC1()
	{
		Reporter.log("Test case 1",true);
	}
	
	
	@AfterMethod
	public void LogOutApp()
	{
	  Reporter.log("Log out ",true);	
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		Reporter.log("Close the browser",true);
	}

}
