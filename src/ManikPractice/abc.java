package ManikPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class abc {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		// isEnabled method
	boolean	Button=driver.findElement(By.xpath("//button[text()='Log In']")).isEnabled();
	System.out.println(Button);//true
	
	//click method . create new account

	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(2000);
	
	// isSelected
	WebElement Radio=driver.findElement(By.xpath("//label[text()='Female']"));
	 boolean Female=Radio.isSelected();
	
	System.out.println(Female);// false
	if(Female==true)
	{System.out.println("Female button is selected");
	}

	else
	{
	System.out.println("Female radio button is not selected");
	}

	//fb image isDisplayed
	
	// select Female radio button
	Radio.click();
	
	//select Male Radio button
	driver.findElement(By.xpath("//label[text()='Male']")).click();

	System.out.println("-----------");
	boolean fb=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
	System.out.println(fb);
	}

}
