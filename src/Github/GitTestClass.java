package Github;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GitTestClass extends GitBaseClass
{
	GitHomePage1 Home;
	GitLoginPage Log;
	WebDriver driver;
	
	@BeforeClass
	public void OpenBrowser()
	{
		initializeBrowser();
		
		Log=new GitLoginPage(driver);
		Home=new GitHomePage1(driver);
	}
	
	@BeforeMethod
	public void GitHub()
	{
		Log.EnterUsername();
		Log.EnterPassword();
		Log.Signin();
		
		Home.VerifyUserName();
		Home.RepoName();
		
	}
	@Test
	public void VerifyUserName()
	{
		String Expected="Manik113";
		
	}
	
	

}
