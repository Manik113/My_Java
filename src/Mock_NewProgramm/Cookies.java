package Mock_NewProgramm;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
	   Set<Cookie> COOKIES=driver.manage().getCookies();   // return type is Cookie
	 
	    //  COOKIES.size();   // got size of cookies
	     System.out.println(COOKIES.size());  // 3
	     
	     // Print all cookies by using for each loop
	     
	     for(Cookie A:COOKIES)
	     {
	    	 System.out.println(A.getName()+ ":"+ A.getValue()+":"+A.getExpiry());
	     }
	     
	     // Delete all cookies
	     driver.manage().deleteAllCookies();
	     
	   driver.quit();
	}
}
