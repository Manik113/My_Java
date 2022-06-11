package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpath_By_attribute_Edge 
{
   public static void main(String[]args) throws InterruptedException
   {
	   // Launch or open Edge Browser
	   System.setProperty("webdriver.edge.driver",
			   "C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\edgedriver_win64\\msedgedriver.exe");
	   
	   WebDriver driver=new EdgeDriver(); // open Microsoft Edge Browser
	   
	   Thread.sleep(2000);
	   
	   driver.get("https://www.google.com/"); // open Google url on Edge Browser
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//input[@name='q']")).sendKeys("India");
	   Thread.sleep(2000);
	   driver.close();
   }
}
