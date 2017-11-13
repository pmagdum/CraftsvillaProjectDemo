package scripts;

import org.testng.annotations.Test;

import pomPages.CheckoutPage;

public class CheckoutPageTest extends BaseTest {
	
	@Test
	public void checkout()
	{
		CheckoutPage cp = new CheckoutPage(driver);
		cp.EnterShippingDetails("abcd@gmail.com","xyz","abc","560056","banglore karnataka", "9890909090");
	}

}
