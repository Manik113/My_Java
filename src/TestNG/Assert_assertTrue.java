package TestNG;

import org.testng.annotations.Test;

import graphql.Assert;

public class Assert_assertTrue 
{
	@Test
	public void TC1()
	{
		boolean Result=true;
		
		Assert.assertTrue(Result);
	}
	
	@Test
	public void TC2()
	{
		boolean Result=false;
		
		Assert.assertTrue(Result);
	}

}
