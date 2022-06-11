package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_division {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				  "C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.flipkart.com/");  //open facebook 
		  Thread.sleep(2000);
		  
		  //Hidden popup open just inspect it
		  
		  //Enter mobile no/ Email 
		 driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("Virat@123");
		 Thread.sleep(2000);
		  // Enter password
		  driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Kohli@123");
		  Thread.sleep(2000);
		  // click on login
		  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		  
		  
	}

}
