package Actions_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");  // open flipkart url
		//driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		// close the pop-up 
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();  // click
		
		// step-1 identify the webelement : Cart
		WebElement Cart=driver.findElement(By.xpath("//span[text()='Cart']"));
		Thread.sleep(2000);
		
		// create object of action class
		Actions act=new Actions(driver);
		
		// to perform Right click call method contextClick() & for click use perform()
		act.contextClick(Cart).perform();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}
