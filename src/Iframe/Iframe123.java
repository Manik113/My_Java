package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe123 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		Thread.sleep(2000);
		WebElement A=driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(A);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Rohit");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		/*driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("SingleFrame");
		driver.switchTo().frame("//input[@type='text'])[2]");
		//driver.switchTo().frame(2);
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Virat");*/
		
		
		

	}

}
