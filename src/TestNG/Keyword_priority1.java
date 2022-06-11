package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword_priority1 
{
	@Test(priority=2)
	public void TC1()            // test case/test method
	{
		Reporter.log("Running test case1",true);
	}
	
	@Test(priority=1)
	public void TC2()
	{
		Reporter.log("Running test case2",true);
	}
	

}
