package ManikPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite_Zerodha 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		//driver.navigate().to("https://kite.zerodha.com/");
		
		Thread.sleep(1000);
		//Enter username
		//driver.findElement(By.id("userid")).sendKeys("Virat");                     // find by using id locator
		driver.findElement(By.xpath("//input [@maxlength='6']")).sendKeys("Virat");  // by using relative xpath
		
		Thread.sleep(1000);
		
		// Enter the password
		//driver.findElement(By.id("password")).sendKeys("Kohli");   // by id
		driver.findElement(By.xpath("//input [@type='password']")).sendKeys("Kohli");;  // by Xpath
		
		WebElement Password=driver.findElement(By.xpath("//input [@type='password']"));
		System.out.println("Password text:" + Password.getAttribute("Value"));
		
		// click on login button
		driver.findElement(By.xpath("//button [text()='Login '] ")).click();  // using text Xpath by attribute
		
		
		driver.quit();
	}

}
