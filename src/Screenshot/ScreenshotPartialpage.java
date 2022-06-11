package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotPartialpage {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//WebElement screen=driver.findElement(By.xpath("//div[@class=\"_8esn\"]"));
		WebElement NewSc=driver.findElement(By.xpath("//div[@class=\"_8esl\"]"));
		
		//File src=screen.getScreenshotAs(OutputType.FILE);  // screenshot is taken 
		File src=NewSc.getScreenshotAs(OutputType.FILE);
		
		File trg=new File("C:\\Users\\Manik Kohale\\Desktop\\Screenshot\\New456.jpg");
		
		FileUtils.copyFile(src, trg);
	
		
		
		
	}

}
