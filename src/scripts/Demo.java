package scripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
	
	@BeforeMethod()
	public void beforeMethod()
	{
		System.out.println("In before test method");
	}
	
	@Test(groups = {},invocationCount=1, dependsOnMethods="")
	public void test()
	{
		System.out.println("In test method..");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("In after method..");
	}

}
