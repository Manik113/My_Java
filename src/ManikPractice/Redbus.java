package ManikPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/");
		
		// select Katraj,Pune
		driver.findElement(By.id("src")).sendKeys("Pune");
		
		
		// find dynamic path
		List<WebElement> CityList=driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]//li"));
		
		// katraj, Pune //ul[@class='autoFill homeSearch']/li[8]
		System.out.println("Total Boardings points:" +CityList.size());  // 20 points
		Thread.sleep(3000);
		
		// i want to select Katraj,Pune 
		
		for(int i=0; i<CityList.size(); i++)
		{
			System.out.println(CityList.get(i).getText());
			if(CityList.get(i).getText().equals("Katraj, Pune"))
			{                                    
				CityList.get(i).click();
				break;
			}
		}
		
		
		

	}

}
