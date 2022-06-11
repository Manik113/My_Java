package Mock_NewProgramm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Size_Location_webelement {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//find out fb logo size & location
		// find address of fb logo
		WebElement FBLogo=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		
		// get location
		FBLogo.getLocation();
		System.out.println("Location of logo:"+FBLogo.getLocation());
		
		FBLogo.getLocation().getX();
		System.out.println("X cooardinate:"+FBLogo.getLocation().getX());
		
		FBLogo.getLocation().getY();
		System.out.println("Y coordinate:"+FBLogo.getLocation().getY());
		
		// Size of webelement
		FBLogo.getSize();
		System.out.println("Size Of logo:"+FBLogo.getSize());
		

	}

}
