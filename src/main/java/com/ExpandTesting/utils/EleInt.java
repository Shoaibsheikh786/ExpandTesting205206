package com.ExpandTesting.utils;

import org.openqa.selenium.WebElement;

public class EleInt {

	public static void click(WebElement ele)
	{
		if (Waits.isElementClickable(ele)) {
			ele.click();
		}

	}
	public static void click(WebElement ele,int sec)
	{
		if (Waits.isElementClickable(ele,sec)) {
			ele.click();
		}

	}
	
	
	//send keys 
	public static void sendKeys(WebElement ele, String data)
	{
		ele.sendKeys(data);
	}
   
   //getText
	
	public static String getText(WebElement ele)
	{
		return ele.getText();
	}
}
