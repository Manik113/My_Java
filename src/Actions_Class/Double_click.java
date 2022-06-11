package Actions_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();   // maximize the window
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//find out element address
		WebElement Button=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		// create objct of Actions class & in constructor pas webdriver object
		Actions act=new Actions(driver);
		
		act.doubleClick(Button).perform();
		
		// Alert popup shows 
		Thread.sleep(2000);
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		
		al.accept();    // accept the popup
		

	}

}
