package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowser_Testing 
{
	WebDriver driver;
	
	@BeforeTest
	@Parameters("browserName")
	public void setBrowser(String browserName)
	{
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else 
		{
			System.setProperty("webdriver.edge.driver", 
		       "C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\edgedriver_win64\\msedgedriver.exe");
			driver=new EdgeDriver(); 
		}
		
	}
	
	@Test
	public void TC1()
	{
		driver.findElement(By.xpath("//input[@id=\"userid\"]")).sendKeys("GP8097");
				
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Swami@0110");
				
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
				
		driver.findElement(By.xpath("//input[@id=\"pin\"]")).sendKeys("449192");
				
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
				
		 String ExpUserId="GP8097";
				 
		 String ActUserID=driver.findElement(By.xpath("//span[text()='GP8097']")).getText();
			
				 
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
