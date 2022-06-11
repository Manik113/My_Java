package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Emailable_Report 
{
	@Test public void m1()  // Test method/ test case
	{
		Reporter.log("Method m1 Running", true);
	}
	
	@Test public void m2()
	{
		Reporter.log("Method m2 Running",true);
	}
	

	@Test public void m3()
	{
		Reporter.log("Method m3 Running",false);
	}
	

	@Test public void m4()
	{
		Reporter.log("Method m4 Running",true);
	}
	

	@Test public void m5()
	{
		Reporter.log("Method m5 Running",true);
	}

}
