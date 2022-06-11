package Keyboard_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Enter_Escape_Space_BackSpace {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		WebElement Textinput=driver.findElement(By.xpath("//input[@id='target']"));
		
		Actions act=new Actions(driver);
		
		act.click(Textinput).sendKeys(Keys.ENTER).perform();
		
		
		Thread.sleep(2000);
		
		act.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ESCAPE);
		Thread.sleep(2000);
		
		act.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
	}

}
