package Mock_NewProgramm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {

	public static void main(String[] args) 
	{
		// Tooltip -->value given to attribute-->when mouse move on webelement it shows text 
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//html[@lang='en']")));  // iframe by WebElement
		
		WebElement Tooltip=driver.findElement(By.xpath("//a[text()='Tooltips']"));
		
		
		Tooltip.getAttribute("title");
		
		System.out.println(Tooltip.getAttribute("title"));
		
		
		
		
		
		
		

	}

}
