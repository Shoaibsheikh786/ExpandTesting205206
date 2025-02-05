package com.ExpandTesting.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ExpandTesting.utils.EleInt;

public class LoginPage {
	//
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//LOGIN PAGE Element
	@FindBy(xpath="//a[normalize-space()='Test Login Page']")
	private WebElement LoginPage;
    public void clickOnLoginPage()
    {
    	EleInt.click(LoginPage);
    }
	
	//USERNAME
	@FindBy(xpath="//input[@id='username']")
	private WebElement username;
	public void enterUsername(String user)
	{
		EleInt.sendKeys(username, user);
	}
	
	//Password
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	public void enterPassword(String pass)
	{
		EleInt.sendKeys(password, pass);
	}
	
	//login
	@FindBy(xpath="//button[@type='submit']")
	private WebElement login;
	public void clickOnLogin()
	{
		EleInt.click(login);
	}
	
	@FindBy(xpath="//div[@id='flash']/b")
	private WebElement loginMessage;
	public String getLoginMessage()
	{
		return loginMessage.getText();
	}

}
