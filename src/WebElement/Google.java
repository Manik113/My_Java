package WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		// find links
		List<WebElement> Links=driver.findElements(By.xpath("//a"));
		
		// find how many links are present
		System.out.println(Links.size());
		
		// print all the links present 
		// use for each loop
		
		for(WebElement AllLinks:Links)
		{
			System.out.println(AllLinks.getText());
		}
		
		
		
		
		
	}

}
