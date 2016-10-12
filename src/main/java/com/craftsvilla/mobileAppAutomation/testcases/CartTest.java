package com.craftsvilla.mobileAppAutomation.testcases;

import org.junit.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.craftsvilla.mobileAppAutomation.framework.DriverActions;
import com.craftsvilla.mobileAppAutomation.framework.FailedTestCases;
import com.craftsvilla.mobileAppAutomation.pageObjects.HomeActivity;
import com.craftsvilla.mobileAppAutomation.pageObjects.MyCartActivity;
import com.craftsvilla.mobileAppAutomation.pageObjects.ObjectRepository;
import com.craftsvilla.mobileAppAutomation.pageObjects.OnboardingActivity;
import com.craftsvilla.mobileAppAutomation.pageObjects.ProductDetailsActivity;
import com.craftsvilla.mobileAppAutomation.pageObjects.SearchResultsActivity;

public class CartTest extends BaseTest {

	@Test
	public void addToCartContentTest() {

		OnboardingActivity onboardingActivity = new OnboardingActivity();
		onboardingActivity.skip(driver);
		DriverActions.waitForElement(driver, ObjectRepository.searchTextView, 30);
		Assert.assertTrue(DriverActions.isElementDisplay(driver, ObjectRepository.searchTextView));
		HomeActivity homeActivity = new HomeActivity();
		homeActivity.navigateToCategory(driver);
		SearchResultsActivity searchResultsActivity = new SearchResultsActivity();
		searchResultsActivity.goToDescription(driver);
		ProductDetailsActivity productDetailsActivity = new ProductDetailsActivity();
		// productDetailsActivity.addToCart(driver);
		// MyCartActivity myCartActivity = new MyCartActivity();
		Assert.assertTrue(DriverActions.isElementDisplay(driver, productDetailsActivity.getAddToCartBtn()));
		Assert.assertTrue(DriverActions.isElementDisplay(driver, productDetailsActivity.getBuyNowBtn()));

	}

	@Test
	public void addToCartGuestTest() {

		OnboardingActivity onboardingActivity = new OnboardingActivity();
		onboardingActivity.skip(driver);
		DriverActions.waitForElement(driver, ObjectRepository.searchTextView, 30);
		Assert.assertTrue(DriverActions.isElementDisplay(driver, ObjectRepository.searchTextView));
		HomeActivity homeActivity = new HomeActivity();
		homeActivity.navigateToCategory(driver);
		SearchResultsActivity searchResultsActivity = new SearchResultsActivity();
		searchResultsActivity.goToDescription(driver);
		ProductDetailsActivity productDetailsActivity = new ProductDetailsActivity();
		productDetailsActivity.addToCart(driver);
		// MyCartActivity myCartActivity = new MyCartActivity();
		Assert.assertTrue(DriverActions.isElementDisplay(driver, productDetailsActivity.getGoToCartBtn()));
		Assert.assertTrue(DriverActions.isElementDisplay(driver, productDetailsActivity.getBuyNowBtn()));
	}

	@Test
	public void addToCartLoginTest() {

		OnboardingActivity onboardingActivity = new OnboardingActivity();
		onboardingActivity.login(driver);
		DriverActions.waitForElement(driver, ObjectRepository.searchTextView, 30);
		Assert.assertTrue(DriverActions.isElementDisplay(driver, ObjectRepository.searchTextView));
		HomeActivity homeActivity = new HomeActivity();
		homeActivity.navigateToCategory(driver);
		SearchResultsActivity searchResultsActivity = new SearchResultsActivity();
		searchResultsActivity.goToDescription(driver);
		ProductDetailsActivity productDetailsActivity = new ProductDetailsActivity();
		productDetailsActivity.addToCart(driver);
		// MyCartActivity myCartActivity = new MyCartActivity();
		Assert.assertTrue(DriverActions.isElementDisplay(driver, productDetailsActivity.getGoToCartBtn()));
		Assert.assertTrue(DriverActions.isElementDisplay(driver, productDetailsActivity.getBuyNowBtn()));
	}

	@Test
	public void buyNowGuestTest() {

		OnboardingActivity onboardingActivity = new OnboardingActivity();
		onboardingActivity.skip(driver);
		DriverActions.waitForElement(driver, ObjectRepository.searchTextView, 30);
		Assert.assertTrue(DriverActions.isElementDisplay(driver, ObjectRepository.searchTextView));
		HomeActivity homeActivity = new HomeActivity();
		homeActivity.navigateToCategory(driver);
		SearchResultsActivity searchResultsActivity = new SearchResultsActivity();
		searchResultsActivity.goToDescription(driver);
		ProductDetailsActivity productDetailsActivity = new ProductDetailsActivity();
		productDetailsActivity.buyNow(driver);
		MyCartActivity myCartActivity = new MyCartActivity();
		Assert.assertTrue(DriverActions.isElementDisplay(driver, myCartActivity.getCheckoutBtn()));
		Assert.assertTrue(DriverActions.isElementDisplay(driver, myCartActivity.getTotalPrice()));
	}

	@Test
	public void buyNowLoginTest() {

		OnboardingActivity onboardingActivity = new OnboardingActivity();
		onboardingActivity.login(driver);
		DriverActions.waitForElement(driver, ObjectRepository.searchTextView, 60);
		Assert.assertTrue(DriverActions.isElementDisplay(driver, ObjectRepository.searchTextView));
		HomeActivity homeActivity = new HomeActivity();
		homeActivity.navigateToCategory(driver);
		SearchResultsActivity searchResultsActivity = new SearchResultsActivity();
		searchResultsActivity.goToDescription(driver);
		ProductDetailsActivity productDetailsActivity = new ProductDetailsActivity();
		productDetailsActivity.buyNow(driver);
		MyCartActivity myCartActivity = new MyCartActivity();
		DriverActions.waitForElement(driver, myCartActivity.getCheckoutBtn(), 30);
		// Assert.assertTrue(DriverActions.isElementDisplay(driver,
		// myCartActivity.getCheckoutBtn()));
		Assert.assertTrue(DriverActions.isElementDisplay(driver, myCartActivity.getTotalPrice()));

	}

	@AfterMethod
	public void closeBrowser(ITestResult result) {
		if (result.getStatus() == 2) {
			FailedTestCases.actionAfterFailedTestcase(driver, result);
		}

	}

}
