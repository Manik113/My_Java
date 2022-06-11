package ManikPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LISTBOX12 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		// click on create new account
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		
		//select month dropdown
	WebElement	Month=driver.findElement(By.xpath("//select[@id='month']"));
	
	
	// Create object of select class & 
	Select S=new Select(Month);
	Thread.sleep(2000);
	
	// select options from listbox
	//S.selectByVisibleText("Apr");
	S.selectByIndex(0);  //Jan
	//S.selectByValue("7");  //Jul
	
	
	System.out.println("------------------");
	WebElement FirstSelected=S.getFirstSelectedOption();
	
	 String Text=FirstSelected.getText();
	
	System.out.println(Text);
	
	List<WebElement> Options=S.getOptions();
	System.out.println(Options.size());//12
	
	// use for each loop
	for(WebElement A:Options)
	{
		System.out.println(A.getText());
	}
	
	
}
}
