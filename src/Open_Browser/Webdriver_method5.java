package Open_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_method5
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe");
		
		//Create object of chromedriver class and provide reference of  Webdriver interface 
		WebDriver driver=new ChromeDriver();  // and import webdriver and Chromedriver 
		
		// To enter URL on the browser/To open an application
		 driver.navigate().to("https://www.youtube.com/");
		  //wait
        Thread.sleep(2000);
        
     // To enter URL on the browser/To open an application  
        driver.navigate().to("https://www.flipkart.com/");
       
        Thread.sleep(2000); //wait for 2 seconds
        
       driver.navigate().back(); //To move backward
       
       Thread.sleep(3000);  // wait or pause for 2 seconds
       
       driver.navigate().forward();  // To move forword
       
       Thread.sleep(2000);    //wait for 2 seconds
    
       driver.navigate().refresh();  //to refresh webpage
       
       Thread.sleep(2000); //wait
       
       driver.close();  //To close browser
        

	}

}
