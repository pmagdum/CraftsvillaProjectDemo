package pomPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PDP {
	private WebDriver driver;
	
	@FindBy(xpath="//h1[@itemprop='name']")
	private WebElement prodTitle;
	
	@FindBy(xpath="//span[@class='pdp-offer-price']")
	private WebElement prodPrice;
	
	@FindBy(xpath="//input[@id='pincode_value']")
	private WebElement prodPincodeAval;
	
	@FindBy(xpath="//button[@id='submitpincode']")
	private WebElement checkPincode;
	
	@FindBy(xpath="//span[@class='pdp-pin-change-check']")
	private List<WebElement> pinAvailMsg;
	
	@FindBy(xpath="//i[@class='icon cv-icon-change']")
	private WebElement changePincodeBtn;
	
	@FindBy(xpath="//button[@id='addtocart']")
	private WebElement AddToCart;
	
	@FindBy(xpath="//button[@id='buynow']")
	private WebElement BuyNow;
	
	public PDP (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void itemDetails()
	{
		String title=prodTitle.getText();
		System.out.println("Product Title: "+title);
		String price = prodPrice.getText();
		System.out.println("Product price: "+price);
		String pin="560040";
		prodPincodeAval.sendKeys(pin);
		System.out.println("Entered pincode: "+pin);
		checkPincode.click();
		if(pinAvailMsg.size()!=0)
		{
			System.out.println("Available at specified pincode");
		}
		else
		{
			System.out.println("Invalid pincode OR product not availabe at specified pincode");
		}
		changePincodeBtn.click();
	}
	
	public void addToCart()
	{
		AddToCart.click();
		System.out.println("Product added to cart.");
	}
	public void BuyNow()
	{
		BuyNow.click();
	}
	

}
