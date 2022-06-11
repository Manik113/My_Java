package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselectablelistbox_forloop {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Manik%20Kohale/Desktop/Velocity%20Software%20Testing/HTML/listbox.html");
		Thread.sleep(2000);
		 //Step-I: Identify listbox and store into an object    
	     WebElement Country= driver.findElement(By.xpath("//select[@id='1234']"));
	      
	     Select S1=new Select(Country);
	     //Step-III:Call the methods
	     S1.selectByVisibleText("Ind");
	     S1.selectByVisibleText("Pak");
	     S1.selectByIndex(2);
	     S1.selectByIndex(3);
	     
	     List<WebElement> allsSelect=S1.getAllSelectedOptions();
	     System.out.println(allsSelect.size()); 
	     
	     // get text from selected options
	     for(WebElement A:allsSelect)
	     {
	    	 System.out.println(A.getText());
	     }
	     
	     
	     
	     //System.out.println(Country.size());


	}

}
