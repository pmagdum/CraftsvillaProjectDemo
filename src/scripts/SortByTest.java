package scripts;

import org.testng.annotations.Test;

import generics.Excel;
import pomPages.HomePage;
import pomPages.PLP;

public class SortByTest extends BaseTest {
	@Test
	public void PriceSortByTest()
	{
		HomePage hp = new HomePage(driver);
		hp.searchItem("sarees");
		Excel.waitt(3000);
		
		PLP plp = new PLP(driver);
		plp.sortBy();
		plp.verifySortBy();
				
	}

}
