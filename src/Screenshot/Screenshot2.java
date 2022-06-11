package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;





public class Screenshot2 {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.flipkart.com/");
		 
		 // take screenshot  // import File Jav.io
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(src);
		
		// create object of File class
		File dest=new File("C:\\Users\\Manik Kohale\\Desktop\\Screenshot\\.Fp.jpg");
		
		FileHandler.copy(src, dest);  // add throws declaration
		 

	}

}
