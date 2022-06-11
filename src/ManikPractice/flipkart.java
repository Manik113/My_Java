package ManikPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart 
{

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
	 WebDriver driver=new ChromeDriver();
	 
	 driver.get("https://www.flipkart.com/");
	 Thread.sleep(2000);
	 
	 //Handle popup window
	 
	 
	 // Search Box
	  driver.findElement(By.name("q"));
	 WebElement Search= driver.findElement(By.name("q"));
	 Search.sendKeys("Mobile");
	 
	 System.out.println(driver.getCurrentUrl());
	 System.out.println(driver.getTitle());
	 
	 driver.findElement(By.linkText("Travel"));

	}

}
