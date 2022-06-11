package Mock_NewProgramm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_tab_newURL_Open {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);  // to open next url on new tab
		
		// driver.switchTo().newWindow(WindowType.WINDOW);  // to open next url on new window 
		
		driver.get("https://www.amazon.in/");

	}

}
