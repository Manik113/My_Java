package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class verifylistbox2 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Manik%20Kohale/Desktop/Velocity%20Software%20Testing/HTML/listbox.html");
		
		 //Step-I: Identify listbox and store into an object   
		WebElement Country=driver.findElement(By.xpath("//select[@id ='1234']"));
		
		//Step-II:Create object of select class
		Select S=new Select(Country);
		
		////Step-III:Call the methods
		System.out.println("List box is Multiple:"+ S.isMultiple());  //true

	}

}
