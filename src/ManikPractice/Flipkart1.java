package ManikPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		//driver.manage().window().maximize();
		
		// here popup window is open now click on close button
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		// click on more button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='_3-PJz-']")).click();
		//a[text()='Login']
	}

}
