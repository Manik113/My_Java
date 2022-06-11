package Open_Browser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Size 
{      // to get pixel size of the current window which will be open in chrome browser

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.youtube.com/");
		
		driver.manage().window().getSize();   // getSize(); its return type is Dimension
		
		Dimension Size=driver.manage().window().getSize();// size is variable and its datatype is Dimension
		
		System.out.println(Size);
		//System.out.println(driver.manage().window().getSize());
		
		System.out.println(driver.getCurrentUrl()); // to get the current url
		
		System.out.println(driver.getTitle()); // get title of the open url on the browser
		System.out.println(driver.toString());
		System.out.println(driver.getWindowHandle());

	}

}
