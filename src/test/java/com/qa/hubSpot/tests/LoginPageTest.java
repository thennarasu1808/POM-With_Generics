package com.qa.hubSpot.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.hubSpot.Pages.LoginPage;

public class LoginPageTest extends BaseTest {
	
	@Test(priority = 1)
	public void verifyLoginPageTite() {
		String title = page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println("Login page Title is: "+title);
		Assert.assertEquals(title, "HubSpot Login");
		
	}
	@Test(priority = 2)
	public void loginTest() {
		page.getInstance(LoginPage.class).doLogin("thennarasu1808@gmail.com", "Rainie@1808");
		
		
	}
	

}
