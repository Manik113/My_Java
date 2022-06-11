package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				  "C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.facebook.com/");
		  
		  Thread.sleep(2000);
		  
		  // click on create new acoount 
		  driver.findElement(By.xpath("(//a[@role='button']) [2]")).click();  // Xpath by index
		  
		
		  
		  // find path of Female radio button 
		// driver.findElement(By.xpath("//label[text()='Female']"));
		 
		 Thread.sleep(2000);
		boolean result= driver.findElement(By.xpath("//label[text()='Female']")).isSelected();
		 
		 System.out.println("Female Button is Selected:" +result);
		 
		 // for Male radio button
		boolean Male= driver.findElement(By.xpath("//label[text()='Male']")).isSelected();
		 
		 System.out.println("Male Button is Selected:" +Male);
		
	}

}
