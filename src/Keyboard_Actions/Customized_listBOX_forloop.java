package Keyboard_Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Customized_listBOX_forloop {

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
		
		// find out listbox element
		WebElement Day=driver.findElement(By.xpath("//select[@aria-label=\"Day\"]"));
		
		// Create object of Actions class
		Actions act=new Actions(driver);
		
		// click on day 
		act.click(Day).perform();
		for(int i=0; i<=5; i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
		}
		
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();   // press Enter
		
		

	}

}
