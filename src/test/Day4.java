package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 
{
	@Parameters({"url"})
	@Test
	public void WebLoginHomeLoan(String url)
	{
		System.out.println(url);
		System.out.println("Day4 WebLoginHomeLoan");
	}
	@Test
	public void MobileLoginHomeLoan()
	{
		System.out.println("Day4 MobileLoginHomeLoan");
	}
	@Test(groups={"smoke"})
	public void RESTAPILoginHomeLoan()
	{
		System.out.println("Day4 RESTAPILoginHomeLoan");
	}

}
