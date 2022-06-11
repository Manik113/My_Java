package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Text1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		        //set path of chromedriver.exe.file
				//parameter1 name of browser
				//parameter2 path of driver.exe.file
		
		System.setProperty("webdriver.chrome.driver", 
						"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
				
	driver.get("https://www.facebook.com/login/");
		//Enter Username
	driver.findElement(By.xpath("//input[@class='inputtext _55r1 inputtext _1kbt inputtext _1kbt']"))
	                                                                              .sendKeys("Virat");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Virat@abc");
	                                                          
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Log In']")).click();

	}

}
