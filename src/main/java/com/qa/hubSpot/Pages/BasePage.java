package com.qa.hubSpot.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends Page {

	public BasePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);

	}

	// generic Util Wrappers:

	public void doClick(By locator) {
		driver.findElement(locator).click();
	}

	public void doSendKeys(By locator, String text) {
		driver.findElement(locator).sendKeys(text);
	}

	public void doGetText(By locator) {
		driver.findElement(locator).getText();
	}

}
