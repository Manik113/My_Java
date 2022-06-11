package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe4 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		// switch to frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='singleframe']")));
		
		//identified the element and enter the information
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1234");
		
		
		
	}

}
