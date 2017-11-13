package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.Excel;

public class CartPage {
	WebDriver driver;
	
	@FindBy(xpath="//div[@data-product-id='5948472']/div[1]/div/div[1]/p")
	private WebElement itemName;
	
	@FindBy(xpath="//div[@data-product-id='5948472']/div[2]//span[2]")
	private WebElement itemQty;
	
	@FindBy(xpath="//div[@data-product-id='5948472']/div[2]//span[3]")
	private WebElement increaseItemQty;
	
	@FindBy(xpath="//div[@data-product-id='5948472']/div[2]//span[1]")
	private WebElement decreaseItemQty;
	
	@FindBy(xpath="//div[@class='cart-product-price js-cart-item-price ']/span")
	private WebElement itemPrice;
	
	@FindBy(xpath="//span[@id='total-payable-amt2']")
	private WebElement totalPayable;
	
	@FindBy(xpath="//strong[text()='PLACE ORDER']")
	private WebElement placeOrder;
	
	@FindBy(xpath="//button[@id='remove-item-btn']")
	private WebElement confirmRemove;
	
	@FindBy(xpath="//div[@data-product-id='5948472']/div[1]/div/div[3]/span")
	private WebElement removeFromCart;
	
	public CartPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void cartOps()
	{
		//try
		//{
			String itemNm=itemName.getText();
			System.out.println("Product Name: "+itemNm);
			increaseItemQty.click();
			Excel.waitt(2000);
			increaseItemQty.click();
			Excel.waitt(2000);
			increaseItemQty.click();
			Excel.waitt(2000);
			decreaseItemQty.click();
			Excel.waitt(2000);
			String qty=itemQty.getText();
			System.out.println("Qty: "+qty);
			String amount = totalPayable.getText();
			System.out.println("Total amount:"+amount);
			placeOrder.click();
			System.out.println("Place order is clicked.");
			Excel.waitt(2000);
					
		//}
//		catch(Exception e)
//		{
//			System.out.println("No products in cart.");
//		}
	}
	
	
	
	
	
	
}
