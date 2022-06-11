package Page_Object_Module_POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTestClass {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();   // create webdriver object
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// create object of POM classes & call the non-static methods
		
		// create object of POM class1
		
		KiteLoginPage1 login1=new KiteLoginPage1(driver);
		
		login1.EnterUserID();
		login1.EnterPassword();
		login1.ClickLogin();
		
		// create object of POM class2
		KiteLoginPage2 Login2=new KiteLoginPage2(driver);
		
		Login2.EnterPin();
		Login2.ConinueButton();
		
		// cfreate object of POM class3
		KiteHomePage DashBoard=new KiteHomePage(driver);
		
		DashBoard.VerifyUserID();
		
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.close();
	}

}
