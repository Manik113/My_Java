package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping_TC 
{
	@Test(groups="Login")
	public void TC1()
	{
		Reporter.log("TC1 is Running",true);
	}
	@Test(groups="Login")
	public void TC2()
	{
		Reporter.log("TC2 is Running",true);
	}
	
	@Test(groups="Profile")
	public void TC3()
	{
		Reporter.log("TC3 is Running",true);
	}
	@Test(groups="Profile")
	public void TC4()
	{
		Reporter.log("TC4is Running",true);
	}
	
	@Test(groups="Fund")
	public void TC5()
	{
		Reporter.log("TC5 is Running",true);
	}
	@Test(groups="Fund")
	public void TC6()
	{
		Reporter.log("TC6 is Running",true);
	}

}
