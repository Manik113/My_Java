package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();   // create webdriver object
		
      driver.get("file:///C:/Users/Manik%20Kohale/Desktop/Velocity%20Software%20Testing/HTML/My%20practice/WebTable.html");
 
       // Identify the table and row
     List<WebElement> Allrows=driver.findElements(By.xpath("//tbody//tr"));
     
     // to get how many rows present in the webtable
     System.out.println("No of Rows:" +Allrows.size());
     
     // to get how many columns are present in the webtable
    List<WebElement> AllColumn=driver.findElements(By.xpath("//tbody//tr/th"));
    
    System.out.println("Columns :"+AllColumn.size());
     
     
 
 
 
 
 
 
	}

}
