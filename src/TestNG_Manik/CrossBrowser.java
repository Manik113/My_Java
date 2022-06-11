package TestNG_Manik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser 
{
	WebDriver driver;
	
	@BeforeTest
	@Parameters("browserName")
	public void setBrowser()
	{
		
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.get("https://www.gmail.com/");
	}
	
     
    @Test
    public void testParameter()
    {
    	driver.findElement(By.id("Email")).sendKeys("instructor.learnvern");
    }
}


