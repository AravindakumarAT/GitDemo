package test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 
{
	
	@Test
	public void TestArchiect()
	{
		System.out.println("GitY Code will be updated"); //Updated by Y and in Develop Branch
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Day3 before executing all the methods in the class");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("Day3 after executing all the methods in the class");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Day3 Before Method");
	}
	@Parameters({"url","APIKey/username"})
	@Test
	public void WebLoginCarLoan(String url,String key)
	{
		System.out.println(url+"    "+key);
		System.out.println("Day3 WebLoginCarLoan");
	}
	@Test(groups={"smoke"})
	public void MobileLoginCarLoan()
	{
		System.out.println("Day3 MobileLoginCarLoan");
	}
	@Test(dependsOnMethods= {"WebLoginCarLoan"})
	public void APILoginCarLoan()
	{
		System.out.println("Day3 APILoginCarLoan");
	}
	@Test(enabled=false)
	public void MobileSignIn()
	{
		System.out.println("Day3 MobileSignIn");
	}
	@Test(dataProvider="getData")
	public void MobileSignOut(String user,String password)
	{
		System.out.println("UserName "+user+"Password "+password);
		System.out.println("Day3 MobileSignOut");
	}
	@BeforeSuite
	public void beforeSuit()
	{	
		System.out.println("Day3 Line No 1");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("Day3 I am the Last No 1");
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] obj=new Object[3][2];
		//Row is the no.of combinations should be passed for each test case
		//Column  is the no.of input values for each combination
		obj[0][0]="user1";
		obj[0][1]="Pass1";
		obj[1][0]="user2";
		obj[1][1]="Pass2";
		obj[2][0]="user3";
		obj[2][1]="Pass3";
		return obj;
		
	}
}
