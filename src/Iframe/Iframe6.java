package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe6 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		// switch to frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='singleframe']")));
		
		//identify text field and enter information
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("MS Dhoni");
		
		Thread.sleep(2000);
		
		//To switch to main page
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		
		// click on Webtable
		driver.findElement(By.xpath("//a[text()='WebTable']")).click();
		
	}

}
