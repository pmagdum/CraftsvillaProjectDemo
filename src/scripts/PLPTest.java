package scripts;

import org.testng.annotations.Test;

import generics.Excel;
import pomPages.HomePage;
import pomPages.PLP;

public class PLPTest extends BaseTest {
	
	@Test
	public void filterOptions()
	{
		
		HomePage hp = new HomePage(driver);
		hp.clickOnSaree();
		Excel.waitt(3000);
		
		PLP plp = new PLP(driver);
		plp.selectCOD();
		Excel.waitt(2000);
		plp.selectRange();
		Excel.waitt(2000);
		plp.selectColor();
		//Excel.waitt(2000);
		plp.selectDiscount();
		//Excel.waitt(2000);
	}

}
