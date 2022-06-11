package Github;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHubTestClass {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://github.com/login");
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		 GitLoginPage Log=new GitLoginPage(driver);
		 Log.EnterUsername();
		 Log.EnterPassword();
		 Log.Signin();
		 
		 GitHomePage1 Home=new GitHomePage1(driver);
		 Home.VerifyUserName();
		 
		 
		 

	}

}
