package Mock_NewProgramm;

import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Encode {

	public static void main(String[] args)
	{
		String password="Manik@123";
		
		String encodedpassword=new String(Base64.getEncoder().encode(password.getBytes())); 
		
		System.out.println(encodedpassword);
		
	/*	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		// enter email or mobile no or Username
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("Virat");
		
		// Enter password
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys(getDecoder);
		
		
		public static String getDecodePassword()
		{
			return new String(Base64.getDecoder().decode(encodedPassword.getBytes));
		}*/
		
		
	}

}
