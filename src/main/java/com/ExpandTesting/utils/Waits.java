package com.ExpandTesting.utils;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ExpandTesing.base.Setup;
import com.ExpandTesting.timeunits.TimeUnits;

public class Waits extends Setup{
	
public static	WebDriverWait wb;
/**@Description: this element will return false if the 
 * element is not clickable else it will return true */
	public static boolean isElementClickable(WebElement ele)
	{ 
		wb=new WebDriverWait(driver,Duration.ofSeconds(TimeUnits.ELE_TIME));
		try
		{
			wb.until(ExpectedConditions.elementToBeClickable(ele));
		    return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Element is not Clickable");
			return false;
		}
		
	}
	
	/**@Description: this element will return false if the 
	 * element is not clickable else it will return true */
	
	public static boolean isElementClickable(WebElement ele,int sec)
	{ 
		
		wb=new WebDriverWait(driver,Duration.ofSeconds(sec));
		wb=new WebDriverWait(driver,Duration.ofSeconds(TimeUnits.ELE_TIME));
		try
		{
			wb.until(ExpectedConditions.elementToBeClickable(ele));
		    return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Element is not Clickable");
			return false;
		}
	}
	
	//Static wait for 5 Seconds
	public static void staticWait()
	{  
		try
		{
		  Thread.sleep(5000);	
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}
}
