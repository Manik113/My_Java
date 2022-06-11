package Popup;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowsdr1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//click on New Tab Button
		driver.findElement(By.xpath("//input[@value='New Tab']")).click();
		
		Set<String> ALLWindowIDs=driver.getWindowHandles();
		System.out.println(ALLWindowIDs);
		
		String MainWindowID=driver.getWindowHandle();
		System.out.println(MainWindowID);
		
		ArrayList<String> al=new ArrayList<String>(ALLWindowIDs);
		
		String ChildWindow=al.get(1);
		System.out.println(ChildWindow);
		
		driver.switchTo().window(ChildWindow);
		
		// click on element of the child browser ie. Cypress
		
		driver.findElement(By.xpath("//span[text()='Cypress']")).click();
		
		// switch to main window
		 driver.switchTo().window(al.get(0));
		
		

	}

}
