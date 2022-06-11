package Keyboard_Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Navigate_Top {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();   // create webdriver object
		
		driver.get("https://www.facebook.com/");  //Enter url
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		    // click on create new account
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(1000);
		
		   // step-1 identify the listbox and store it into an object
		WebElement Month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
		
		//Step-2 Create object of Actions class
		Actions act=new Actions(driver);
		
		// Step-3 use action class method .click() to click on element
		act.click(Month).perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.HOME).perform();
		
		act.sendKeys(Keys.ENTER).perform();
	}

}
