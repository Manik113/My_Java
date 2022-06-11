package Open_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Method6
{

	public static void main(String[] args) 
	{
	   //  Step-I: Set path of chromedriver.exe file
	    // Parameter-I: Name of the browser
	    // Parameter-II: Path of chromedriver.exe file
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Manik Kohale\\Desktop\\Selenium Files\\chromedriver.exe\\");
		
		//create object of chromedriver with reference to the webdriver interface
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.youtube.com/");  // to enter the url on the browser 
		
		String Title1= driver.getTitle();  // to get title of webpage . getTitle() method is called
		       // for store the output we use Title1 variable & also data type written infront of variable
		System.out.println("The Title of Enterd URL is:" + Title1);

	}

}
