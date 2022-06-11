package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class optionname1_text {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		 //click on create new account
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(1000);

		 //Step-I: Identify listbox and store into an object 
	WebElement	Month=driver.findElement(By.xpath("//select[@id='month']"));
	
	Thread.sleep(2000);
	
	Select s=new Select(Month);
	 // To get name of selected option  
	 WebElement   SelectedOption=s.getFirstSelectedOption();
	  String text=SelectedOption.getText();
	 System.out.println(text);
	

	}

}
