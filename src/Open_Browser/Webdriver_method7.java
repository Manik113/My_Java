package Open_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_method7 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/"); // to open url on the open browser
		
		driver.getCurrentUrl();  // to get URL of current webpage
		String A=driver.getCurrentUrl();
		
		System.out.println("The URL enterd of webpage:" +A);
	}

}
