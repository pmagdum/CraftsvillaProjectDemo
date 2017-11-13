package pomPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.Excel;

public class CheckoutPage {
	
	private WebDriver driver;

	@FindBy(xpath="//input[@id='address-email']")
	private WebElement enterEmail;
	
	@FindBy(xpath="//input[@id='address-first-name']")
	private WebElement enterFN;
	
	@FindBy(xpath="//input[@id='address-last-name']")
	private WebElement enterLN;
	
	@FindBy(xpath="")
	private WebElement enterState;
	
	@FindBy(xpath="//input[@id='address-pincode']")
	private WebElement enterPincode;
	
	@FindBy(xpath="//textarea[@id='address-textbox']")
	private WebElement enterAddress;
	
	@FindBy(xpath="//input[@id='address-mobileno']")
	private WebElement enterMobileNo;
	
	@FindBy(xpath="//button[@id='address-form-submit']")
	private WebElement clickDeliverToBtn;
	
	@FindBy(xpath="//div[@class='address-form address-details']/p/span")
	private List<WebElement>shipTo;
		
	@FindBy(xpath="//div[@class='payment-form cod-type']/button")
	private WebElement CODPlaceOrderBtn;
	
	public  CheckoutPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void EnterShippingDetails(String email,String fn, String ln, String pincode,String address,String mobileno)
	{
		Excel.waitt(4000);
		enterEmail.sendKeys(email);
		enterFN.sendKeys(fn);
		enterLN.sendKeys(ln);
		enterPincode.sendKeys(pincode);
		enterAddress.sendKeys(address);
		enterMobileNo.sendKeys(mobileno);
		
		clickDeliverToBtn.click();
		Excel.waitt(1000);
		System.out.println("Shipping Details: ");
		for(int i=0;i<shipTo.size();i++)
		{
			String adds = shipTo.get(i).getText();
			System.out.println(adds);
		}
		Excel.waitt(3000);
		CODPlaceOrderBtn.click();
		System.out.println();
		
	}
	
	
	
	
}
