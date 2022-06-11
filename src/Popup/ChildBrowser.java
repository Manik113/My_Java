package Popup;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//click on New Tab Button
		driver.findElement(By.xpath("//input[@value='New Tab']")).click();
		
		// It will open new tab
		// get child window ID -->.getwindowHandles()--> get id of both main & child page
		
		Set <String> AllWindowIDs=driver.getWindowHandles(); // it contains no. of window IDs
		
		System.out.println(AllWindowIDs); // get main page id as well as main page id(Id1,Id2)
		
		// Get only Child Window Id (Main id index is 0, child id index 1)
		String ChildID=driver.getWindowHandle();
		System.out.println(ChildID); //will get id of only child browser
		
	ArrayList<String> al=new ArrayList<>(AllWindowIDs); // Mainpage ID(0),ChildWindow ID(1)
	
	String ChildWindowID=al.get(1); 
	
	System.out.println(ChildWindowID);
	
	// Switch the focus of selenium from main window to child window
	
	driver.switchTo().window(ChildWindowID);
	
	// click on element of the child browser ie. Training
	driver.findElement(By.xpath("//span[text()='Training']")).click();
	
	//
		
		
		
		
		
		
		
	}

}
