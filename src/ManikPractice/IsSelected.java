package ManikPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.facebook.com/");
		 
		 // click on create new account
		 driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		 Thread.sleep(2000);
		 
		 // check Female radio button is Enabled or Not
		boolean Status= driver.findElement(By.xpath("//label[text()='Female']")).isSelected();
		
		System.out.println("Button is Selected :"+Status);
		if(Status==true)
		{
			System.out.println("Female Radio button is Selected");
		}
		else
		{
			System.out.println("Female radio button is not selected");
		}
		
		driver.close();
		  

	}

}
