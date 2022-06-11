package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword_priority2 
{
	@Test(priority=2)
	public void TC1()
	{
		Reporter.log("Test case1 Running",true);
	}
	
	@Test(priority=1)
	public void TC2()
	{
		Reporter.log("Test case2 Running",true);
	}
	
	@Test                   // By default priority=0
	public void TC3()
	{
		Reporter.log("Test case3 Running",true);
	}

}
