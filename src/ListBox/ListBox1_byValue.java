package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox1_byValue {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				  "C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.facebook.com/");  //open facebook 
		  
		  
		  //click on create new account
		 driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		  Thread.sleep(2000);
		  
		//Step-I: Identify listbox and store into an object  
		WebElement  Month=driver.findElement(By.xpath("//select[@id='month']"));
		
		 //Step-II:Create object of select class
		Select S1=new Select(Month);
		 Thread.sleep(2000);
		 
		//Step-III:Call the methods
		 S1.selectByValue("9");  //sep

	}

}
