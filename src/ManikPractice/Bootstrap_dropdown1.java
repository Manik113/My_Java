package ManikPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap_dropdown1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hdfcbank.com/");
		Thread.sleep(2000);
		
		// click on select product type dropdown 
		driver.findElement(By.xpath("//div[@class='drp1']")).click();
		
		// select from  dropdown
		//div[@class='drp1']//div[@class='dropdown open']
		// click on particular name from dropdown
		driver.findElement(By.xpath("//li[text()='Loans']")).click();
		
		// list of webelements presents under dropdown
	List<WebElement> ListDropdown=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li"));
	System.out.println(ListDropdown.size());
	//System.out.println(ListDropdown);
	
	}

}
