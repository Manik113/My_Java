package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class alloption1 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Manik%20Kohale/Desktop/Velocity%20Software%20Testing/HTML/listbox.html");
		Thread.sleep(2000);
		 //Step-I: Identify listbox and store into an object    
	     WebElement Country= driver.findElement(By.xpath("//select[@id='1234']"));
	     
	     Select S=new Select(Country);   // create object of Select class
	     S.selectByIndex(0); //ind
	     S.selectByIndex(1); // pak
	     S.selectByIndex(2); // sri lanka
	     S.selectByIndex(3); // china
	     
	 
	    // get all selected options text
	     List<WebElement>  Selected=S.getAllSelectedOptions();  // import java.util.list
	     
	     for(WebElement OPTIONS: Selected)
	     {
	    	 System.out.println(OPTIONS.getText());
	     }
	     
	     
	      

	}

}
