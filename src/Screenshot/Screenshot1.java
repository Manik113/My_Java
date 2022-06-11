package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class Screenshot1 {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.facebook.com/");
		 
		 //Take screenshot
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(src);
		
		// create object of file class and pass the destination where want to save screenshot
		// convert \ to\\ and give name.jpg format import File java.io
		File dest=new File("C:\\Users\\Manik Kohale\\Desktop\\Screenshot\\fb.jpg");
		
		// copy screenshot to destination folder by using filhandler class
		//
		FileHandler.copy(src, dest);  
		
	}

}
