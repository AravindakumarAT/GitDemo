package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1
{

	@Test(groups={"smoke"})
	public void Test1()
	{
		System.out.println("Hello Day1 Test1");
	}
	@Test
	public void Test2()
	{
		System.out.println("Hello Day1 Test2");
		Assert.assertTrue(false);
	}
	@BeforeTest
	public void preRequistie()
	{
		System.out.println("Day1 Prerequistie");
	}
	@AfterTest
	public void lastExecution()
	{
		System.out.println("Day1 Last Execution");
	}
}
