package pomPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.Excel;
import generics.Utility;

public class HomePage 
{
	private WebDriver driver;
	
	@FindBy(xpath="//span[text()='Sign In']")
	private WebElement SignIn;
	
	@FindBy(xpath="//input[@id='searchval']")
	private WebElement searchBox;
	
	@FindBy(xpath="//input[@id='emailId']")
	private WebElement email;
	
	@FindBy(xpath="//div[@id='continueBtn']")
	private WebElement continueBtn;
	
	@FindBy(xpath="//input[@id='userPassword']")
	private WebElement pwd;
	
	@FindBy(xpath="//div[@id='loginCheck']")
	private WebElement login;
	
	@FindBy(xpath="//a[@href='/womens-clothing/sarees/?MID=megamenu_sarees_seeall']")
	private WebElement Sarees;
	
	@FindBy(xpath="//a[text()='Banarasi']")
	private WebElement BanarasiSaree;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Login(String un,String pw)
	{
		SignIn.click();
		email.sendKeys(un);
		continueBtn.click();
		pwd.sendKeys(pw);
		login.click();
		Excel.waitt(2000);			
		
	}
	
	public void searchItem(String item)
	{
		searchBox.sendKeys(item);
		searchBox.sendKeys(Keys.ENTER);
		System.out.println("searched for saree.");
		Excel.waitt(3000);
	}
	
	public void clickOnSaree()
	{
		Sarees.click();
	}
	
	public void selectBanarasi()
	{
		Utility.action(driver,Sarees);
		Excel.waitt(3000);
		BanarasiSaree.click();
		Excel.waitt(1000);
		System.out.println("selected banarasi saree..");
	}
	
}
