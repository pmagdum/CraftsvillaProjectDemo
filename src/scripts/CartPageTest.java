package scripts;


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generics.Excel;
import generics.SampleListener;
import pomPages.CartPage;
import pomPages.HomePage;
import pomPages.PDP;
import pomPages.PLP;


public class CartPageTest extends BaseTest{
	@Test
	public void cart()
	{
		
		HomePage hp = new HomePage(driver);
		Excel.waitt(2000);
		hp.selectBanarasi();
		
		//PLP plp = new PLP(driver);
		//plp.selectSaree();
		
		//PDP pdp = new PDP(driver);
	//	pdp.itemDetails();
		//Excel.waitt(2000);
		//pdp.addToCart();
		
		
		//CartPage cp = new CartPage(driver);
		//cp.cartOps();
		
		
		
		
	}
	

}
