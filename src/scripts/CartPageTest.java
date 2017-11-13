package scripts;


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generics.SampleListener;
import pomPages.CartPage;
import pomPages.HomePage;
import pomPages.PDP;
import pomPages.PLP;

//@Listeners(SampleListener.class)
public class CartPageTest extends BaseTest{
	@Test
	public void cart()
	{
		e.startTest("Add Product to cart");
		HomePage hp = new HomePage(driver);
		hp.selectBanarasi();
		
		PLP plp = new PLP(driver);
		plp.selectSaree();
		
		PDP pdp = new PDP(driver);
		pdp.itemDetails();
		pdp.addToCart();
		
		
		//CartPage cp = new CartPage(driver);
		//cp.cartOps();
		
		
		Assert.fail();
		
	}
	

}
