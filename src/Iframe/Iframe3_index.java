package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe3_index {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		// focus of selenium to frame .switch to frame
		driver.switchTo().frame(0);
		
		//identified text field and enter information
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("XYZ");

	}

}
