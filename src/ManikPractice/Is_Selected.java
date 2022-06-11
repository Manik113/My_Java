package ManikPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Selected {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				  "C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.facebook.com/");
		
		  // click on Create new account button
		  driver.findElement(By.xpath("//a[@rel='async']")).click();  // By using xpath expression 
		  
		  // Male, Female and custom button is Selected or not
		  
		 //driver.findElement(By.xpath("//input[@value='1']")); // Male Radio button address
		WebElement Male=driver.findElement(By.xpath("//input[@value='1']"));
		
		boolean Button=Male.isSelected();
		
		//System.out.println(Male.isSelected());  // is selected or not
		
		/*if(Button==true)
		{
			System.out.println("Button is selected");
		}
		else
		{
			System.out.println("Button is not selected");
		}*/
		  

	}

}
