package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe5 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		//switch to frame
		WebElement FrameName=driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		
		driver.switchTo().frame(FrameName);
		
		//identify text field and enter information
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Rohit");
		Thread.sleep(1000);
		
		// switch to main frame from childframe
		driver.switchTo().defaultContent();
		
		// click on Home tab which are present in Main frame
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		
		

	}

}
