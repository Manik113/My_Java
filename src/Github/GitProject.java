package Github;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GitProject {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://github.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// Enter username address
		WebElement UserName=driver.findElement(By.xpath("//input[@id='login_field']"));  
		
		 // Enter the password address
		WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));  
		
		UserName.sendKeys("Manik113");
		Password.sendKeys("Manik@git123");
		
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();     // click on sign in button
		
		// Login credentials Username and password enter 
		
		WebElement Profile=driver.findElement(By.xpath("//img[@class='avatar avatar-small circle']"));
		
		Profile.click();
		
		// Testcase 1: Verify that username text
		WebElement USERNAME=driver.findElement(By.xpath("//strong[@class='css-truncate-target']"));
		
		String Actualusername=USERNAME.getText();
		String Expectet="Manik113";
		
		//Assert.assertEquals(Actualusername, Expectet);
		
		if(Actualusername.equals(Expectet))
		{
			System.out.println("Test case1 Pass");
		}
		else
		{
			System.out.println("Test case1 Fail");
		}
		
		
	  
	  
	}

}
