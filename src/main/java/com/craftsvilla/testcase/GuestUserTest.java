package com.craftsvilla.testcase;

import org.junit.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.craftsvilla.framework.DriverActions;
import com.craftsvilla.framework.DriverSelector;
import com.craftsvilla.framework.FailedTestCases;
import com.craftsvilla.pageObjects.ObjectRepository;
import com.craftsvilla.pageObjects.TestData;

import io.appium.java_client.android.AndroidDriver;

public class GuestUserTest {

	AndroidDriver<?> driver = null;

	@Test
	public void guestUserOnboardingTest() {
		driver = DriverSelector.getAndroidDriver();

		DriverActions.sendKeys(driver, ObjectRepository.onboardingEmail, TestData.guestEmail);
		DriverActions.click(driver, ObjectRepository.getStarted);

		Assert.assertTrue(DriverActions.isElementDisplay(driver, ObjectRepository.searchTextView));

		DriverSelector.stopAppium();

	}

	@AfterMethod
	public void closeBrowser(ITestResult result) {
		if (result.getStatus() == 2) {
			FailedTestCases.actionAfterFailedTestcase(driver, result);
		}
		//driver.quit();

	}

}
