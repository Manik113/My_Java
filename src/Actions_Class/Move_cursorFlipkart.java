package Actions_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move_cursorFlipkart {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");  // open flipkart url
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();  // click 
		
		// select the dropdown element & store into the object
		WebElement Elect=driver.findElement(By.xpath("//div[text()='Electronics']"));   // Electronics
		
		// create object of Actions class & pass the webdriver object in that constructor
		Actions act=new Actions(driver);
		
		// Now to move Mouse cursor on Selected Webelement 
		act.moveToElement(Elect).perform();        // now Mouse Cursor is on Webelement
		
		Thread.sleep(1000);
		
		// select particular options from dropdown
		
		// driver.findElement(By.xpath("//h1[text()='Computer Accessories']")).click();
		
		
		

	}

}
