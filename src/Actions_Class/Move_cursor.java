package Actions_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move_cursor {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");  // url is enter
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Step-1 identify the dropdown element & store into an object
		WebElement Dropdown=driver.findElement(By.xpath("//a[text()='SwitchTo']"));  // SwitchTo select
		
		// Step-2 create object of Actions class & pass WebDriver Object in that constructor
		Actions act=new Actions(driver);
		
		// To move cursor to selected selected webelement
		act.moveToElement(Dropdown).perform();
		Thread.sleep(2000);
		
		// click on windows option..
		driver.findElement(By.xpath("//a[text()='Windows']")).click();
		
		String Text=driver.getTitle();
		System.out.println(Text);

		
	}

}
