package TestNG_Manik;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Annotations 
{
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("Open Browser",true);
	}
	
	@BeforeMethod
	public void loginApp()
	{
		Reporter.log("Login to App",true);
	}
	@Test
	public void verifyPin()
	{
		Reporter.log("Running TC1",true);
	}
	
	@Test                    //(enabled=false)
	public void verifyUserID()
	{
		Reporter.log("Running TC2",true);
	}
	
	@AfterMethod
	public void logoutApp()
	{
		Reporter.log("Logout from Application",true);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("Close the Browser",true);
	}

}
