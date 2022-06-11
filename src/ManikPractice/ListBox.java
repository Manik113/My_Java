package ManikPractice;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ListBox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(1000);
		
	WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
	
	Select s=new Select(month);
	
	//s.selectByIndex(1);
	//s.selectByValue("4");
	s.selectByVisibleText("Oct");
	System.out.println(s.getFirstSelectedOption().getText());
	
	List<WebElement> Alloptions=s.getOptions();
	System.out.println(Alloptions.size());
	
	//print options for each loop
	for(WebElement xyz:Alloptions)
	{
		System.out.println(xyz.getText());
	}

		
		

	}

}
