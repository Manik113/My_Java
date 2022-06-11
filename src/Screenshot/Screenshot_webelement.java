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
import org.openqa.selenium.io.FileHandler;

public class Screenshot_webelement {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement logo=driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		
		File src=logo.getScreenshotAs(OutputType.FILE);  //screenshot
		
		File trg=new File("C:\\Users\\Manik Kohale\\Desktop\\Screenshot\\fblogo3.jpg");
		
		FileHandler.copy(src, trg);
		//FileUtils.copyDirectory(src, trg);

	}

}
