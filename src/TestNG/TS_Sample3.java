package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TS_Sample3 

{
	
	@Test
	public void TC5()
	{
		Reporter.log("Running test case5",true);
	}
	
	@Test
	public void TC6()
	{
		Reporter.log("Running test case6",true);
	}


}
