package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Right_Left1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 Thread.sleep(2000);
		 
		 // identify the element upto we have to scroll
		 WebElement Element=driver.findElement(By.xpath("(//div[@class='canvas-middle'])[6]"));
		 
		 // To scroll horizontaly
		 
		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollintoView();",Element);
		 
		 
	}

}
