package com.qa.hubSpot.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.hubSpot.Pages.Page;

public class BaseTest {
	public WebDriver driver;
	public WebDriverWait wait;
	public Page page;

	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Chrome Driver_83\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 15);
		driver.manage().window().maximize();
		driver.get("https://app.hubspot.com/login");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Create Object of Page Class : Instantiate Page Class

		page = new Page(driver, wait);

	}

	@AfterMethod

	public void tearDown() {
		driver.quit();
	}

}
