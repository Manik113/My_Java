package Framework;

import java.util.concurrent.TimeUnit;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_DDF {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();   // create webdriver object
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// Enter UserId
		driver.findElement(By.xpath("//input[@id=\"userid\"]")).sendKeys("GP8097");
		
		// Enter Password
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Swami@0110");
		
		// Click on login button
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		
		// Enter the pin
		driver.findElement(By.xpath("//input[@id=\"pin\"]")).sendKeys("449192");
		
		// click on continue button
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
		
		 String ExpUserId="GP8097";
		 
		 // Actua user id 
		 String ActUserID=driver.findElement(By.xpath("//span[text()='GP8097']")).getText();
		 
		 
		 // Check or compare Expected user id to Actual user id
		 
		 if(ExpUserId.equals(ActUserID))
		 {
			 System.out.println("Test is Pass");
		 }
		 else
		 {
			 System.out.println("Test is Fail");
		 }
		 
		
	}

}
