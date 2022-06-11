package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TS_Sample2
{
	@Test
	public void TC3()
	{
		Reporter.log("Running test case3",true);
	}
	
	@Test
	public void TC4()
	{
		Reporter.log("Running test case4",true);
	}


}
