package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe124 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		
		WebElement OuteFrame=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(OuteFrame);
		Thread.sleep(2000);
		
	WebElement	InnerFrame=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
	Thread.sleep(2000);
	
	driver.switchTo().frame(InnerFrame);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("xyz");
		
		
		
		
	}

}
