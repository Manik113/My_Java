package Open_Browser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_Size 
{
	private static final Dimension D1 = null;

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/"); // get the url
		
		//to set size of window which will be open on chrome browser
		
		Dimension D1=new Dimension(1000,800);
		
		driver.manage().window().setSize(D1);  // setSize() take Dimension input
		
		//Dimension D1=new Dimension(1000,800); //Dimension is inbuilt class 
		
	// Dimension is nothing but the pixel of window ie. width*height exa 1200*840
		
		

	}

}
