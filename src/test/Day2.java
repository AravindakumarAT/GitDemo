package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 
{
	@Test
	public void Test3()
	{
		System.out.println("Day2 Hello Test3");
		System.out.println("GitX Code will be updated"); //Updated by X
		
	}
	@BeforeTest
	public void preRequistie()
	{
		System.out.println("Day2 PreRequistie");
	}
	@Test
	public void TestArchiect()
	{
		System.out.println("GitY Code will be updated"); //Updated by Y and in Develop Branch
	}
	@Test
	public void TestArchiectAmerican()
	{
		System.out.println("GitX Code will be updated"); //Updated by X and in Develop Branch
	}
	

}
