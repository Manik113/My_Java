package ManikPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap_dropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hdfcbank.com/");
		Thread.sleep(2000);
		
		// click on select product type dropdown 
		driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
		
		// now click on List item present under select product dropdown
		// or capture all the list items from dropdown
	List<WebElement> Product=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
    // List import from java.util & WebElement 
	// Product contains list of webelements
	System.out.println("No of options present:" + Product.size());
	
	// i want to click on Accounts from list of dropdown
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//li[text()='Accounts']")).click();
	
	 
	
	 /*  for(WebElement Ptype:Product)
	   {
		   if(Ptype.getText().equals("Accounts"));
		   break;
	   }*/
	}

}
