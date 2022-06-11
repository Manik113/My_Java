package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class By_Id1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/login.php");
		Thread.sleep(2000);
		
		// Enter the Email or Phone Number
		driver.findElement(By.id("email")).sendKeys("Jadeja");
		Thread.sleep(2000);
		
		//Enter the password
		driver.findElement(By.id("pass"));
	  WebElement Password=driver.findElement(By.id("pass"));  //Password take variable & store address of password
	  Password.sendKeys("Jaddu@123");                         // and WebElement is return type of password variable
	  
	  // click on login button
	  driver.findElement(By.id("loginbutton"));  // this is the address of login button
	  WebElement Login=driver.findElement(By.id("loginbutton")); //store address in Login variable
	  Login.click();   // click on login button
	  
	  

	}

}
