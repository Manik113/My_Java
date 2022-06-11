package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				  "C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.facebook.com/");
		  
		  Thread.sleep(2000);
		  
		  // to get the Text 
		  driver.findElement(By.xpath("//a[text()='Forgotten password?']")); // address of Forgotten Password
		 // driver.findElement(By.linkText("Forgotten password?")).click();// By.linkText("Text Value")
		  
		WebElement ForgottenLink= driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		ForgottenLink.getText();
		
		String Text=ForgottenLink.getText();
		System.out.println("Inside Text is:" +Text);
	}

}
