package com.expandtestig.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ExpandTesing.base.Setup;
import com.ExpandTesting.Files.PageTitles;
import com.ExpandTesting.Pages.WebInputsPages;
import com.ExpandTesting.utils.Waits;



public class WebInputsTest extends Setup {
	WebInputsPages wi;
	Logger lg;

	@BeforeTest
	public void setup() {
		initialization();
		wi=new WebInputsPages(driver);
		lg=LogManager.getLogger(WebInputsTest.class);

	}

	@Test
	public void verifyWebInputPageIsPresent() {
		lg.info("VerifyWebInputPage test started");
		wi.clickOnWebInputs();
       Assert.assertEquals(driver.getTitle(),PageTitles.WebInpTitle);
	}
	
	
	@AfterTest
	public void tearDown()
	{
		if(driver!=null)
			driver.close();
	}
	
	@Test
	public void verifyDisplyInputs()
	{   
		 Waits.staticWait();
	   	wi.clickOnWebInputs();
		 Waits.staticWait();
		wi.inputNumber("123");
		Waits.staticWait();
		wi.clickOnDisplayInputs();
		String str=wi.displayOutputNumber();
		Assert.assertEquals(str, "123");
		
	}
	
	//write more testCases 
	

	

}
