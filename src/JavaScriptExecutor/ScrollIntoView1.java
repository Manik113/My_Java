package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("http://demo.guru99.com/test/guru99home/");
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		 Thread.sleep(2000);
		 
		 // Identify element upto we have to scroll
		WebElement ELE=driver.findElement(By.xpath("a[text()='Facebook']"));
		
		 
		 // to perform ScrollIntoView action
		 
		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollintoView();",ELE);
		 

	}

}
