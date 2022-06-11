package Popup;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_WindowHandle {

	
	public static void main(String[] args, String ChildwindowID) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		
		//click on new tab button
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		  //click on new tab button
		  driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		  
		  //wait
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  
		        Set<String> IDs=driver.getWindowHandles();
		        
		        ArrayList<String> al=new ArrayList<String>(IDs);
		        
		        //to get main page ID
		             String MainpageID=al.get(0);
		             System.out.println(MainpageID);
		             
		         //To get window pop-up ID
		              String  windowID=al.get(1);
		              System.out.println(ChildwindowID);
		  
		 
		  //shift focus of selenium on window pop-up
		  driver.switchTo().window(ChildwindowID);
		   
		  //click on training link
		  driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		  
		  
		  //shift focus of selenium from window pop-up to main page
		  driver.switchTo().window(MainpageID);
		  
	}

}
