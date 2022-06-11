package Open_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Launch_EdgeBrowser 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// launch or open Edge Browser ie. microsoft edge
		
        System.setProperty("webdriver.edge.driver", 
      		  "C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\edgedriver_win64\\msedgedriver.exe");
        
        WebDriver driver=new EdgeDriver();
        
        driver.get("https://www.flipkart.com/");  // open Flipkart on Microsoft Edge browser
        
       // Thread.sleep(2000);  // sleep after 2 seconds
        

	}

}
