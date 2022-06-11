package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_TC1 
{
	@Test
	public void ZerodhaKite() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
        driver.get("https://kite.zerodha.com/");
        Thread.sleep(2000);
        driver.close();
	}

}
