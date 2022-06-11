package Mock_NewProgramm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_Tab_open {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		String Newtab=Keys.chord(Keys.CONTROL,Keys.RETURN);   // return type is String
		
		driver.findElement(By.xpath("//a[text()='Register']")).sendKeys(Newtab);
		
	}

}
