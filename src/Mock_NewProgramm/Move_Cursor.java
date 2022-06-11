package Mock_NewProgramm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move_Cursor {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");  // url enter
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		// find element and store to object
	WebElement	Acct=driver.findElement(By.xpath("//span[text()='Account & Lists']"));
	
	// create object of Action class & pass webdriver object in the constructor of action class
	Actions act=new Actions(driver);
	
	act.moveToElement(Acct).perform();
	
	driver.findElement(By.xpath("//span[text()='Your Account']")).click();
	
	System.out.println("The current title of Webpage:" +driver.getTitle());
	
	
		

	}

}
