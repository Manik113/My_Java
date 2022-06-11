package Mock_NewProgramm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");  // url enter
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click(); // click on popup
		
		WebElement sell=driver.findElement(By.xpath("//span[text()='Become a Seller']"));  //
		
		// create object of 
		Actions act=new Actions(driver);
		
		//act.contextClick(sell).perform();  // Right click
		act.click(sell).perform();
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("12312312");
		driver.findElement(By.xpath("//div[text()='Register Now']")).click();
		
	 //	act.doubleClick();  // double click
		
		Thread.sleep(2000);
		
		//driver.switchTo().alert().accept();
            
	}

}
