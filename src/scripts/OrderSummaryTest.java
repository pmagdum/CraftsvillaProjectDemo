package scripts;

import org.testng.annotations.Test;

import pomPages.CartPage;
import pomPages.CheckoutPage;
import pomPages.HomePage;
import pomPages.OrderSummaryPage;
import pomPages.PDP;
import pomPages.PLP;

public class OrderSummaryTest extends BaseTest
{

	@Test
	public void oredrSummary()
	{
		e.startTest("Place Order Successfully");
		
		HomePage hp = new HomePage(driver);
		hp.selectBanarasi();
		
		PLP plp = new PLP(driver);
		plp.selectSaree();
		
		PDP pdp = new PDP(driver);
		pdp.itemDetails();
		pdp.addToCart();
		
		CartPage cp = new CartPage(driver);
		cp.cartOps();
		
		CheckoutPage ckp = new CheckoutPage(driver);
		ckp.EnterShippingDetails("abcd@gmail.com","xyz","abc","560056","banglore karnataka", "9890909090");
		
		OrderSummaryPage osp = new OrderSummaryPage(driver);
		osp.getOrderDetails();
		
		
	}
}
