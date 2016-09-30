package com.craftsvilla.mobileAppAutomation.testcases;

import org.junit.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.craftsvilla.mobileAppAutomation.framework.DriverActions;
import com.craftsvilla.mobileAppAutomation.framework.DriverSelector;
import com.craftsvilla.mobileAppAutomation.framework.FailedTestCases;
import com.craftsvilla.mobileAppAutomation.pageObjects.ObjectRepository;
import com.craftsvilla.mobileAppAutomation.pageObjects.TestData;

import io.appium.java_client.android.AndroidDriver;

public class LoginTest {

	AndroidDriver<?> driver = null;

	@Test
	public void loginContentTest() {
		driver = DriverSelector.getAndroidDriver();

		Assert.assertTrue(DriverActions.isElementDisplay(driver, ObjectRepository.onboardingEmail));
		Assert.assertTrue(DriverActions.isElementDisplay(driver, ObjectRepository.getStarted));

		DriverSelector.stopAppium();

	}

	@Test
	public void loginTest() {
		driver = DriverSelector.getAndroidDriver();

		DriverActions.sendKeys(driver, ObjectRepository.onboardingEmail, TestData.loginEmail);
		DriverActions.click(driver, ObjectRepository.getStarted);
		DriverActions.sendKeys(driver, ObjectRepository.loginPassword, TestData.loginPass);
		if (!DriverActions.isElementDisplay(driver, ObjectRepository.loginBtn))
			DriverActions.hideKeyBoard(driver);
		DriverActions.click(driver, ObjectRepository.loginBtn);

		Assert.assertTrue(DriverActions.isElementDisplay(driver, ObjectRepository.searchTextView));

		DriverSelector.stopAppium();

	}

	@AfterMethod
	public void closeBrowser(ITestResult result) {
		if (result.getStatus() == 2) {
			FailedTestCases.actionAfterFailedTestcase(driver, result);
		}
		// driver.quit();

	}

}
