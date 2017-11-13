package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderSummaryPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//span[@id='order-no']")
	private WebElement orderNo;
	
	@FindBy(xpath="//span[@id='payment-mode']")
	private WebElement paymentMode;
	
	public OrderSummaryPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void getOrderDetails()
	{
		String orderNum = orderNo.getText();
		String PaymentType = paymentMode.getText();
		
		System.out.println("Order no : "+orderNum);
		System.out.println("Payment Mode : "+PaymentType);
	}
	

}
