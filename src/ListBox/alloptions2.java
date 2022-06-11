package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class alloptions2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/"); // get url
		Thread.sleep(2000);
		
		// find address of create new account
	WebElement NewAcoount=driver.findElement(By.xpath("//a[text()='Create New Account']")); 
		
	NewAcoount.click(); // click on create new account button
	Thread.sleep(2000);
	 //Step-I: Identify listbox and store into an object 
	 WebElement Month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
	 
	 Month.click();  // click on month dropdown
	 
	 Select S=new Select(Month);
	 
	 WebElement A=S.getFirstSelectedOption();
	 System.out.println(A.getText());  // get by default selected option
	 System.out.println("-------------------------");
	 
	 
	//To get all options of listbox
	  List<WebElement> OptionList=S.getOptions();
	  System.out.println(OptionList.size());
	  System.out.println("---------------");
	  
	  for(WebElement MONTHS:OptionList )    // for each loop to get list 
	  {
		  System.out.println(MONTHS.getText());
	  }
	
	
	
	
	
	
	
	
	
	}

}
