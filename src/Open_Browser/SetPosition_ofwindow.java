package Open_Browser;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition_ofwindow 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.youtube.com/");
		
		// to change/ set the position of browser window
		Point P1=new Point(100,150);
		driver.manage().window().setPosition(P1);
		
		//Point P1=new Point(200,200);
		//driver.quit();
		//driver.close();
		driver.navigate();

	}

}
