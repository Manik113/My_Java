package Mock_NewProgramm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		
		//to perform Scroll on application using Selenium
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		
		WebElement A=driver.findElement(By.xpath("//h5[text()='Elements']"));
		
		A.getText();
		System.out.println(A.getText());
		A.click();
		
		
		
		WebElement B=driver.findElement(By.xpath("//div[@class='main-header']"));
		B.getText();
		System.out.println(B.getText());
	}

}
