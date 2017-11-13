package pomPages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.Excel;

public class PLP {
	private WebDriver driver;
	
	@FindBy(xpath="//span[text()='Only COD Products']")
	private WebElement COD;
	
	@FindBy(xpath="//span[text()='1000-2000']")
	private WebElement range1;
	
	@FindBy(xpath="//span[text()='2000-5000']")
	private WebElement range2;
	
	@FindBy(xpath="//input[@placeholder='Search By Saree Color']")
	private WebElement searchColor;
	
	@FindBy(xpath="//label[@title='Black']")
	private WebElement BlackColor;
	
	@FindBy(xpath="//label[@title='Blue']")
	private WebElement BlueColor;
	
	@FindBy(xpath="//span[text()='Discount']")
	private WebElement DiscountFilter;
	
	@FindBy(xpath="//label[@for='10']")
	private WebElement discount;
	
	@FindBy(xpath="//span[@id='priceSort_ASC']")
	private WebElement SortByLowToHigh;
	
	@FindBy(xpath="//span[@class='product-offer-price']")
	private List<WebElement> offerPrices;
	
	@FindBy(xpath="//div[@data-id='5890851']")
	private WebElement itemSaree;
	
	@FindBy(xpath="//div[@data-id='5948472']")
	private WebElement itemSaree1;
	
	public PLP (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void selectCOD()
	{
		try
		{
		COD.click();
		System.out.println("COD is selected.");
		}
		catch(Exception e)
		{
			System.out.println("COD option is not available");
		}
	}
	
	public void selectRange()
	{
		range1.click();
		System.out.println("1000-2000 range is selected");
		range2.click();
		System.out.println("2000-5000 range is selected");

	}
	public void selectColor()
	{
		searchColor.sendKeys("black");
		searchColor.sendKeys(Keys.ENTER);
		BlackColor.click();
		System.out.println("BLACK color is selected.");
		//BlueColor.click();
		//System.out.println("BLUE color is selected.");

	}
	public void selectDiscount()
	{
		try
		{
			DiscountFilter.click();
		discount.click();
		System.out.println("More than 10% discount is selected.");
		}
		catch(Exception e)
		{
			System.out.println("Discount option is not available");
		}
	}
	
	public void sortBy()
	{
		SortByLowToHigh.click();
		System.out.println("selected Sort by Low To High Price.");
		Excel.waitt(2000);
	}
	
	public void verifySortBy()
	{
		//boolean flag = true;
		int size = offerPrices.size();
		System.out.println("size of list is "+ size);
		String prices []=new String[size];
		List<String> al = new ArrayList<String>();
		List<String> a2 = new ArrayList<String>();
		
		for(int i=0;i<size;i++)
		{
			prices[i] = offerPrices.get(i).getText();
			System.out.println(prices[i]);
		}
		System.out.println("=====================");
		for(int i=0;i<size;i++)
		{
			
			//prices[i]=prices[i].substring(2);
			prices[i]=prices[i].replaceAll("\\D", "");
			System.out.println(prices[i]);
		}
		
		for(int i=0;i<size;i++)
		{
			al.add(prices[i]);
			a2.add(prices[i]);
		}
		//Collections.sort(al);
		System.out.println("sorted list:" + al);
		
		System.out.println("original List: "+ a2);
		System.out.println("=================");
		
		
			if(al.equals(a2))
			{
				System.out.println("Sort by verified. Its sorted.");
			}
			else
			{
				System.out.println("Sort by verified. Its not sorted.");
			}
	}
	
	public void selectSaree()
	{
		itemSaree1.click();
		Excel.waitt(1000);
	}
}
