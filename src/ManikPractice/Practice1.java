package ManikPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) 
	{
		// open Different different Browsers
		
		// 1 open Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver(); // Object create of chromedriver with reference to WebDriver
		
		/* 2 open Edge Browser
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\edgedriver_win64\\msedgedriver.exe");
		
		   WebDriver driver=new EdgeDriver();   create object of Edge Driver class
		
		3 open FireFox Driver
		System.setProperty("webdriver.firefox.driver", "Path of FireFox driver.exe file");
		
		WebDriver driver=new FireFoxDriver();          */
	}

}
