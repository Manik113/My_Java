package Actions_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Left_Click {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");  // open flipkart url
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		      // close the pop-up 
	  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();  // click
	  
	  WebElement Seller=driver.findElement(By.xpath("//span[text()='Become a Seller']")); // Become a Seller
	  
	  // create a object of Actions box and pass parameter inthe constructor ie. object of webdriver
	  Actions alt=new Actions(driver);
	  
	  // Left click on webelement
	  alt.click(Seller).perform();
	  
	  // get the Title of current webpage
	  System.out.println(driver.getTitle());
	  
	  
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("12312312");  // enter no
	  Thread.sleep(1000);
	  
	  // now left click or click on that element
	   // step-1 find the webelement : Register Now
	  WebElement Regst=driver.findElement(By.xpath("//div[text()='Register Now']"));
	  
	  alt.click(Regst).perform();
	  
	  // Now alert popup shows Handle that popup Don't Allow & Allow
	 /* Thread.sleep(5000);
	  
	  String Text=driver.switchTo().alert().getText();
	  
	  System.out.println(Text);
	  driver.switchTo().alert().dismiss();*/
	  
	  
	  

	}

}
