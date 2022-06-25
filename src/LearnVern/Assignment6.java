package LearnVern;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Assignment6 
{
	WebDriver driver;
	
	@BeforeTest
	@Parameters("browserName")
	public void setBrowser(String browserName)
	{
		System.out.println("The browser is:"+browserName);
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equals("Edge"))
		{
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\edgedriver_win64\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		else
		{
			System.setProperty("webdriver.edge.driver","Path Of fiefoxdriver.exe File");
			driver=new FirefoxDriver();
		}
	}
	
	@Test
	public void testParameter() throws InterruptedException
	{
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("GP8097");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Swami@0110");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div/div/form/div[4]/button")).click();
		Thread.sleep(2000);
		
		
		
	}
	@AfterTest
	public void down()
	{
		driver.quit();
	}

}
/* xml code
 * <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="TestChrome">
  <parameter name="browserName" value="Chrome"></parameter>
    <classes>
      <class name="LearnVern.Assignment6"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite --> */
