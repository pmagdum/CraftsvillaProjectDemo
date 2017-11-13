package generics;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Utility {
	
	public static void action(WebDriver driver,WebElement e)
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(e).build().perform();
		
	}
	
	public static String getDateTime()
	{
		DateFormat dformat = new SimpleDateFormat("YYYY-dd-MM hh:m:ss:");
		Calendar c = Calendar.getInstance();
		String currentDate = dformat.format(c.getTime());
		System.out.println(currentDate);
		currentDate=currentDate.replace("-","_").replace(" ","_").replace(":","_");
		return currentDate;
	}

}
