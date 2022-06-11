package Actions_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();   // create webdriver object
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// Step-1 Identify the source element  ie. drag element & store in the object
		WebElement Src=driver.findElement(By.xpath("//a[text()=' 5000']"));
		
		// Step-2 Identify the Destination element ie . drop 
		WebElement Dest=driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[4]"));
		
		  // create object of Action class
		Actions act=new Actions(driver);
		
		// to perform drag and drop action
		Thread.sleep(1000);
		
		act.dragAndDrop(Src, Dest).perform();
		

	}

}
