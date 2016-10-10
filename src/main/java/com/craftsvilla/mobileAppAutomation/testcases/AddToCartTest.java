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
import com.craftsvilla.mobileAppAutomation.pageObjects.MyCartActivity;
import com.craftsvilla.mobileAppAutomation.pageObjects.ObjectRepository;
import com.craftsvilla.mobileAppAutomation.pageObjects.OnboardingActivity;
import com.craftsvilla.mobileAppAutomation.pageObjects.ProductDetailsActivity;
import com.craftsvilla.mobileAppAutomation.pageObjects.SearchActivity;
import com.craftsvilla.mobileAppAutomation.pageObjects.SearchResultsActivity;
import com.craftsvilla.mobileAppAutomation.pageObjects.TestData;

import io.appium.java_client.android.AndroidDriver;

public class AddToCartTest extends BaseTest {

	@Test
	public void addToCartContentTest() {

		OnboardingActivity onboardingActivity = new OnboardingActivity();
		onboardingActivity.skip(driver);
		DriverActions.waitForElement(driver, ObjectRepository.searchTextView, 30);
		Assert.assertTrue(DriverActions.isElementDisplay(driver, ObjectRepository.searchTextView));
		HomeActivity homeActivity = new HomeActivity();
		homeActivity.navigateToSearch(driver);
		SearchActivity searchActivity = new SearchActivity();
		searchActivity.search(driver);
		SearchResultsActivity searchResultsActivity = new SearchResultsActivity();
		searchResultsActivity.goToDescription(driver);
		ProductDetailsActivity productDetailsActivity = new ProductDetailsActivity();
		productDetailsActivity.addToCart(driver);
		MyCartActivity myCartActivity = new MyCartActivity();
		Assert.assertTrue(DriverActions.isElementDisplay(driver, myCartActivity.getCheckoutBtn()));
		Assert.assertTrue(DriverActions.isElementDisplay(driver, myCartActivity.getTotalPrice()));

	}

	@Test
	public void addToCartGuestTest() {

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

	@Test
	public void addToCartLoginTest() {

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
