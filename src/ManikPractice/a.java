package ManikPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				  "C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.facebook.com/");
		  
	 WebElement A=driver.findElement(By.xpath("//a[text()='Create New Account']"));
	  
	 System.out.println(A.getText());
	 
	 boolean B= driver.findElement(By.xpath("//button[text()='Log In']")).isEnabled();
	 System.out.println(B);
	 
	 if(B==true)
	 {
		 System.out.println("Button is enabled");
	 }
	 else
	 {
		 System.out.println("Button is disable");
	 }

	}

}
