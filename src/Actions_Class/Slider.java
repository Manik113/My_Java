package Actions_Class;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();   // create webdriver object
		
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		
		// find out address of slider
		List<WebElement> List=driver.findElements(By.tagName("iframe"));
		System.out.println(List.size()); // to find out how many iframe are present in the webpages
		
		// there is frame is present so you need to change the focus of selenium to iframe
				driver.switchTo().frame(0);
				
		// find out address of slider & slider is dynamic element 
		WebElement slider=driver.findElement(By.xpath("(//div[@id=\"slider\"])/span"));  //slider is dynamic
		
		Thread.sleep(2000);
		
		// create object of actions class
		Actions act=new Actions(driver);
		
		// perform action by action class methods
		act.moveToElement(slider).dragAndDropBy(slider, 50,60).build().perform();

	}

}
