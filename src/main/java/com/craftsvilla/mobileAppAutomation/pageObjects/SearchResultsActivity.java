package com.craftsvilla.mobileAppAutomation.pageObjects;

import com.craftsvilla.mobileAppAutomation.framework.DriverActions;

import io.appium.java_client.android.AndroidDriver;

public class SearchResultsActivity {

	String firstProduct = "SearchResults_firstProduct";

	public SearchResultsActivity goToDescription(AndroidDriver driver) {
		DriverActions.waitForElement(driver, firstProduct, 30);
		DriverActions.click(driver, firstProduct);
		return this;
	}

}
