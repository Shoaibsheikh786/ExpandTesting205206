package com.expandtestig.tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ExpandTesing.base.Setup;
import com.ExpandTesting.Files.PageTitles;
import com.ExpandTesting.Pages.LoginPage;
import com.ExpandTesting.utils.Waits;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class LoginTest extends Setup {

	LoginPage lp;

	@BeforeTest
	public void setup() {
		initialization();
		lp = new LoginPage(driver);

	}

	@AfterTest
	public void tearDown() {
		if (driver != null)
			driver.close();
	}

	@Epic(value = "Login Page")
	@Feature("Login Feature")
	@Description("verify the login fuc. with invalid cred.")
	@Severity(SeverityLevel.CRITICAL)
	@Test(priority = 1)
	public void verifyLoginFunWithValidCred() {

		Waits.staticWait();
		lp.enterUsername("practice");
		lp.enterPassword("SuperSecretPassword!");
		lp.clickOnLogin();
		Waits.staticWait();
		String str = lp.getLoginMessage();

		System.out.println("Login message " + str);
		Assert.assertEquals(lp.getLoginMessage(), PageTitles.LoginMessage);
	}

	@Test(priority = 2, enabled = false)
	public void verifyLoginFunWithInValidCred() {
		lp.clickOnLoginPage();
		Waits.staticWait();
		lp.enterUsername("practice");
		lp.enterPassword("SuperSecretPassword!");
		lp.clickOnLogin();
		Waits.staticWait();
		String str = lp.getLoginMessage();

		System.out.println("Login message " + str);
		Assert.assertNotEquals(lp.getLoginMessage(), PageTitles.LoginMessage);
	}

}
