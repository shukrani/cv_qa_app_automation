package com.craftsvilla.testcase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import com.craftsvilla.framework.DriverActions;
import com.craftsvilla.framework.DriverSelector;
import com.craftsvilla.framework.FailedTestCases;
import com.craftsvilla.framework.ObjectRepository_HomePage;

public class HomePageTest {
	WebDriver driver;

	@org.testng.annotations.Test
	public void testContactUsPage() {
		driver = DriverSelector.getDriver();
		DriverActions.click(driver, ObjectRepository_HomePage.contactUsLink);
		Assert.assertTrue(DriverActions.isElementDisplay(driver, ObjectRepository_HomePage.contactUsEmail));
		Assert.assertTrue(DriverActions.isElementDisplay(driver, ObjectRepository_HomePage.contactUsPhone));

	}
	
	@org.testng.annotations.Test
	public void testDownloadAppLink() {
		driver = DriverSelector.getDriver();
		DriverActions.click(driver, ObjectRepository_HomePage.downloadAppLink);
		Assert.assertTrue(DriverActions.isElementDisplay(driver, ObjectRepository_HomePage.contactUsEmail));
		Assert.assertTrue(DriverActions.isElementDisplay(driver, ObjectRepository_HomePage.contactUsPhone));

	}
	
	

	@AfterMethod
	public void closeBrowser(ITestResult result) {
		if (result.getStatus() == 2) {
			FailedTestCases.actionAfterFailedTestcase(driver, result);
		}
		driver.quit();

	}

}
