package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class alloptions3_Multiselectable 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Manik%20Kohale/Desktop/Velocity%20Software%20Testing/HTML/listbox.html");
		Thread.sleep(2000);
		 //Step-I: Identify listbox and store into an object    
		
	 WebElement Options=driver.findElement(By.xpath("//select[@id='1234']"));
	 
	 Select S=new Select(Options);  // create object of select class
	 
	      List<WebElement> OPTIONLIST=S.getOptions();  // get all options present in 
	      
	      for(WebElement LIST:OPTIONLIST)
	      {
	    	  System.out.println(LIST.getText());
	      }
	      
	    
		
	}

}
