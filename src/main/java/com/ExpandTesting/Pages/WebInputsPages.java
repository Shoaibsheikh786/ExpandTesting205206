package com.ExpandTesting.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ExpandTesting.utils.EleInt;

public class WebInputsPages {
	
	public WebInputsPages(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// 1. WebElements 
	// 2. Methods 
	// 3. Constructor
	
	@FindBy(xpath="//a[text()='Web inputs']")
    private	WebElement webInputs;
	public void clickOnWebInputs()
	{   
		EleInt.click(webInputs,10);
	}
	
	
	//Display inputs 
	@FindBy(xpath="//button[text()='Display Inputs']")
	private WebElement displayInputs;
	public void clickOnDisplayInputs()
	{
		EleInt.click(displayInputs);
	}
	
	//
	@FindBy(xpath="//strong[@id='output-number']")
	private WebElement outputNum;
	public String displayOutputNumber()
	{
		return EleInt.getText(outputNum);		 
		
	}
	
	@FindBy(xpath="//input[@id='input-number']")
	private WebElement inputnum;
	public void inputNumber(String num)
	{
		EleInt.sendKeys(inputnum, num);
	}
	
	
	
	

}
