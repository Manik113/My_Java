package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TS_Disable12
{
	@Test
	public void TC4()
	{
		Reporter.log("Running test case TC4",true);
	}
	
	@Test
	public void TC5()
	{
		//Assert.fail();
		Reporter.log("Running test case TC5",true);
	}
	
	@Test
	public void TC6()
	{
		Reporter.log("Running test case TC6",true);
	}

}
