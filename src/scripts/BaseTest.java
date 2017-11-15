package scripts;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import generics.Excel;
import generics.SampleListener;

@Listeners(SampleListener.class)
public class BaseTest 
{

 public static	WebDriver driver; // make driver as static so that only one copy of that driver will be sent to all places.
	ExtentReports e;
	ExtentTest t;
	LocalDateTime s;

	
	@BeforeSuite
	public void configSuite()
	{
		e= new ExtentReports(System.getProperty("user.dir") +"/test-output/MyExtentReport.html", true);
		e.loadConfig(new File ("./test-output/extent-config.xml"));
			
	}
	
	
	
	@BeforeTest
	public void preCondition()
	{
		System.setProperty("webdriver.gecko.driver","D:/PRI/exe files/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","D:/PRI/exe files/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser is opened..");
		driver.get("http://www.craftsvilla.com/");
		System.out.println("Application is launched..");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		e.startTest("Add Product to cart");
	}
	
	/*
	@AfterMethod(alwaysRun = true)
	public void getTestresult(ITestResult result)
	{
		if(result.getStatus() == ITestResult.FAILURE){
			t.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
			t.log(LogStatus.FAIL, "Test Case Failed is "+result.getThrowable());
			
			
			EventFiringWebDriver e = new EventFiringWebDriver(driver);
			File scrFile = e.getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(scrFile,new File("/home/tyss/Desktop/screenshots/" + s + "fail1.png"));
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
		}
				else
					if(result.getStatus() == ITestResult.SUCCESS)
					{
						t.log(LogStatus.PASS,"Test case is passed. "+result.getName());
					}
	}
	*/
	
	@AfterMethod
	public void endReport()
	{
		e.endTest(t);
		Excel.waitt(2000);
		e.flush();
		
	}
	
	@AfterTest
	public void afterTest()
	{
		e.close();
	}
	
	@AfterSuite
	public void postCondition()
	{		
		driver.close();
	    System.out.println("Browser is closed.");
	}
}
