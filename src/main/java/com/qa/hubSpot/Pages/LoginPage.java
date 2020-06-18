package com.qa.hubSpot.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);

	}

	By userName = By.id("username");
	By pword = By.id("password");
	By loginButton = By.id("loginBtn");
	
	//Page Actions
	
	public String getLoginPageTitle() {
		
		return driver.getTitle();
	}
	
	public void doLogin(String username, String password) {
		doSendKeys(userName, username);
		doSendKeys(pword, password);
		doClick(loginButton);
	}
	
	
	
}
