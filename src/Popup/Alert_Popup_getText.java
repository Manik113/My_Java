package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup_getText {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.guru99.com/V4/");  // enter the url
	
	// Enter the user id
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Manik");
	
  // click on Login button 
	driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	
	Thread.sleep(2000);
	
	// shift to alert pop-up
	Alert alt=driver.switchTo().alert();
	
	//Thread.sleep(2000);
	
	// get text from alert pop-up
	
	  String Text=alt.getText();
	  
	  System.out.println(Text);
	
	
	

	}

}
