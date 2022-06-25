package Window_Tab_Handle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handle_Demo {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		WebElement ELE=driver.findElement(By.xpath("//*[@id=\"newWindowsBtn\"]"));
		
		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollintoView();",ELE);
		
		// click on open new Window
		driver.findElement(By.xpath("//button[@id=\"newWindowBtn\"]")).click();
		
		
		
		String ParentWindow=driver.getWindowHandle();
		System.out.println("Parent Window:" +ParentWindow);
		
		Set<String> Handles=driver.getWindowHandles();
		
		for(String H:Handles)
		{
			System.out.println(H);
		}
		
		Thread.sleep(5000);
		//New Window is open.. Enter the First name
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Ritesh");

	}

}
