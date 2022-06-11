package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword_priority4 
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
	
	@Test                  // By default priority=0  // default priority 0 check test name alphabetical order 
	public void TC4()
	{
		Reporter.log("Test case4 Running",true);
	}

	@Test
	public void AB()
	{
		Reporter.log("Test case5 Running",true);
	}
	@Test(priority=-1)
	public void TC6()
	{
		Reporter.log("Test case6 Running",true);
	}
	@Test(priority=-2)
	public void TC7()
	{
		Reporter.log("Test case7 Running",true);
	}
	
	
	

}
