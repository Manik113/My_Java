package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;


public class Screenshot3 {

	public static void main(String[] args) throws IOException 
	{
	System.setProperty("webdriver.edge.driver",
	"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\edgedriver_win64\\msedgedriver.exe\\");
		
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.flipkart.com/");
	
	// Take screenshot
	 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 System.out.println(src);
	 
	 // create object of File class and In file constructor pass path where you want to save 
	 
	 File A=new File("C:\\Users\\Manik Kohale\\Desktop\\Screenshot\\.Flipkart2.jpg");
	 
	 FileHandler.copy(src, A);
	 
	 driver.close();

	}

}
