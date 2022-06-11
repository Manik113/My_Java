package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		
		// Switch to frame
		driver.switchTo().frame("singleframe");  // By using ID attribute & attribute name
		Thread.sleep(2000);
		
		// Identify text field and enter information 
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Virat");
	}

}
