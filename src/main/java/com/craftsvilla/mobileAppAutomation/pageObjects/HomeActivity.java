package com.craftsvilla.mobileAppAutomation.pageObjects;

import com.craftsvilla.mobileAppAutomation.framework.DriverActions;

import io.appium.java_client.android.AndroidDriver;

public class HomeActivity {
	

	public HomeActivity navigateToMyAccount(AndroidDriver driver) {
		DriverActions.click(driver, ObjectRepository.myaccountButton);

		return this;
	}

	public HomeActivity navigateToSearch(AndroidDriver driver) {
		DriverActions.click(driver, ObjectRepository.searchTextView);

		return this;
	}

}
