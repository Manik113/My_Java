package demoqa_com;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	public WebDriver driver;
	
	public void InitializeBrowser()
	{
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
	
     driver=new ChromeDriver();
	
	driver.get("https://demoqa.com/");
	
	//to perform Scroll on application using Selenium
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,350)", "");
	
	
	}

}
