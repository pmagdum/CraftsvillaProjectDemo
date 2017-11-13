package scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import generics.Excel;
import pomPages.HomePage;

public class LoginTest extends BaseTest {
	
	@Test
	public void loginTest()
	{
		HomePage hp = new HomePage(driver);
		hp.Login("pmagdum@gmail.com","fXJSBk");
		hp.searchItem("saree");
		Excel.waitt(3000);
	}

}
