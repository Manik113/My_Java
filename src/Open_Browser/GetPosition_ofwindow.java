package Open_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPosition_ofwindow 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.youtube.com/");
		
		// to get position of window which will be open on chrome browser
		driver.manage().window().getPosition();
		
		System.out.println(driver.manage().window().getPosition());

	}

}
