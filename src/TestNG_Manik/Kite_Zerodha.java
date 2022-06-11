package TestNG_Manik;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Kite_Zerodha 
{
	WebDriver driver;
	
	@FindBy(xpath="//span[text()='GP8097']") private WebElement HomepageUserID;
	@FindBy(xpath="//a[text()=' Logout']") private WebElement Logout;
	
	/*public Kite_Zerodha(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}*/
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	@Test
	public void LaunchKite()
	{
		driver.get("https://kite.zerodha.com/");
	}
	
	@Test
	public void LoginTest()
	{
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("GP8097");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Swami@0110");
		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("449192");
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
	}
	
	@Test
	public void CurrentURL()
	{
		String URL=driver.getCurrentUrl();
		/*String ExpectedURL="//kite.zerodha.com/";
		Assert.assertEquals(URL, ExpectedURL);*/
	}
	
	@Test
	public void TitleTest()
	{
		String Title=driver.getTitle();
	}
	
	@Test
	public void Logout() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[text()='GP8097']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=' Logout']")).click();
	}

}
