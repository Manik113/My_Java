package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_assertNotEquals
{
	@Test
	public void TC1()
	{
		String Actual="Hi";
		String Expected="Hi";
		
		Assert.assertNotEquals(Actual, Expected,"Failed: Actual & Expected Results are same");
		
	}
	
	@Test
	public void TC2()
	{
		String ActualRes="HI";
		String ExpectedRes="Hello";
		
		Assert.assertNotEquals(ActualRes, ExpectedRes);
	}

}
