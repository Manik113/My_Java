package Handling_DynamicElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// close the popup
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		
		//search element findout & enter item 
		driver.findElement(By.xpath("//input[@class=\"_3704LK\"]")).sendKeys("redmi note 10s");
		
		// click on search button
		driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
		
		// identify rating element ie. dyanamic element by relative xpath
		WebElement dynamic=driver.findElement(By.xpath("((//div[@class=\"_1AtVbE col-12-12\"])[3]//span)[6]"));
		
		String Text=dynamic.getText();
		System.out.println(Text);
		
		
	}

}
