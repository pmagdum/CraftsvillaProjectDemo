package scripts;

import org.testng.annotations.Test;

import pomPages.HomePage;
import pomPages.PDP;
import pomPages.PLP;

public class PDPTest extends BaseTest{
	
	@Test
	public void selectItem()
	{
		e.startTest("Product Details");
	HomePage hp = new HomePage(driver);
	hp.selectBanarasi();
	
	PLP plp = new PLP(driver);
	plp.selectSaree();
	
	PDP pdp = new PDP(driver);
	pdp.itemDetails();
	pdp.addToCart();
	}
	

}
