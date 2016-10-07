package com.craftsvilla.mobileAppAutomation.testcases;

import org.junit.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.craftsvilla.mobileAppAutomation.framework.DriverActions;
import com.craftsvilla.mobileAppAutomation.framework.DriverSelector;
import com.craftsvilla.mobileAppAutomation.framework.FailedTestCases;
import com.craftsvilla.mobileAppAutomation.framework.Wait;
import com.craftsvilla.mobileAppAutomation.pageObjects.HomeActivity;
import com.craftsvilla.mobileAppAutomation.pageObjects.MyAccountActivity;
import com.craftsvilla.mobileAppAutomation.pageObjects.ObjectRepository;
import com.craftsvilla.mobileAppAutomation.pageObjects.OnboardingActivity;
import com.craftsvilla.mobileAppAutomation.pageObjects.TestData;

import io.appium.java_client.android.AndroidDriver;

public class MyAccountTest extends BaseTest {

	@Test
	public void myAccountContentTest() {

		OnboardingActivity onboardingActivity = new OnboardingActivity();
		onboardingActivity.login(driver);
		Assert.assertTrue(DriverActions.isElementDisplay(driver, ObjectRepository.searchTextView));
		HomeActivity homeActivity = new HomeActivity();
		homeActivity.navigateToMyAccount(driver);
		Assert.assertTrue(DriverActions.isElementDisplay(driver, ObjectRepository.myOrders));
		Assert.assertTrue(DriverActions.isElementDisplay(driver, ObjectRepository.manageAddresses));
		Assert.assertTrue(DriverActions.isElementDisplay(driver, ObjectRepository.bankDetails));
		Assert.assertTrue(DriverActions.isElementDisplay(driver, ObjectRepository.accountSettings));
		Assert.assertTrue(DriverActions.isElementDisplay(driver, ObjectRepository.chatWithUs));
		Assert.assertTrue(DriverActions.isElementDisplay(driver, ObjectRepository.helpNSupport));
		Assert.assertTrue(DriverActions.isElementDisplay(driver, ObjectRepository.rateApp));
		Assert.assertTrue(DriverActions.isElementDisplay(driver, ObjectRepository.policyInfo));

	}

	@Test
	public void logoutTest() {

		OnboardingActivity onboardingActivity = new OnboardingActivity();
		onboardingActivity.login(driver);
		DriverActions.waitForElement(driver, ObjectRepository.searchTextView, 30);
		Assert.assertTrue(DriverActions.isElementDisplay(driver, ObjectRepository.searchTextView));
		HomeActivity homeActivity = new HomeActivity();
		homeActivity.navigateToMyAccount(driver);
		Assert.assertTrue(DriverActions.isElementDisplay(driver, ObjectRepository.myOrders));
		MyAccountActivity myAccountActivity = new MyAccountActivity();
		myAccountActivity.logout(driver);
		DriverActions.waitForElement(driver, ObjectRepository.loginSignup, 30);
		Assert.assertTrue(DriverActions.isElementDisplay(driver, ObjectRepository.loginSignup));

	}

	@AfterMethod
	public void closeBrowser(ITestResult result) {
		if (result.getStatus() == 2) {
			FailedTestCases.actionAfterFailedTestcase(driver, result);
		}

	}

}
