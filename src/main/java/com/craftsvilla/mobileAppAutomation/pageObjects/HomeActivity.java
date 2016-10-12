package com.craftsvilla.mobileAppAutomation.pageObjects;

import com.craftsvilla.mobileAppAutomation.framework.DriverActions;

import io.appium.java_client.android.AndroidDriver;

public class HomeActivity {

	String categoryButton = "Home_categoryButton";
	String category1 = "Category_sarees";
	String allInCategory = "Category_allSarees";

	public HomeActivity navigateToMyAccount(AndroidDriver driver) {
		DriverActions.click(driver, ObjectRepository.myaccountButton);

		return this;
	}

	public HomeActivity navigateToSearch(AndroidDriver driver) {
		DriverActions.click(driver, ObjectRepository.searchTextView);

		return this;
	}

	public HomeActivity navigateToCategory(AndroidDriver driver) {
		DriverActions.click(driver, categoryButton);
		DriverActions.waitForElement(driver, category1, 30);
		DriverActions.click(driver, category1);
		DriverActions.click(driver, allInCategory);

		return this;
	}

}
