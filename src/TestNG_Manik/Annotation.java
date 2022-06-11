package TestNG_Manik;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation 
{
	@org.testng.annotations.BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("Starting TestNG");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("Stopping testNG");
	}
	
	@BeforeTest
	public void Beforetest()
	{
		System.out.println("Start execution");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Initialize selenium for class2");
	}
	
	@Test
	public void test3()
	{
		System.out.println("Inside test 3");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("Destroy selenium for class2");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("Stop test Execution");
	}

}
