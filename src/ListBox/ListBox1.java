package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//click on create new account
		WebElement Button= driver.findElement(By.xpath("//a[text()='Create New Account']"));
		Button.click();
		
		
		//identify listbox address
		WebElement Date = driver.findElement(By.xpath("//select[@id='day']"));
		
		// Create object of Select class
		/*Select S2=new Select(Date);
		Thread.sleep(1000);
		
		//call the method
		//S.selectByValue("6");  // by using select By value
		S2.selectByVisibleText("4");
		Thread.sleep(1000);*/
	}

}
