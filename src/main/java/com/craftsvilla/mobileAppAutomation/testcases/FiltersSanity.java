package com.craftsvilla.mobileAppAutomation.testcases;

import org.testng.annotations.Test;

import com.craftsvilla.mobileAppAutomation.framework.DriverActions;
import com.craftsvilla.mobileAppAutomation.framework.DriverSelector;
import com.craftsvilla.mobileAppAutomation.framework.ObjectRepository_HomePage;
import com.craftsvilla.mobileAppAutomation.framework.Wait;

import io.appium.java_client.android.AndroidDriver;

public class FiltersSanity {
	AndroidDriver<?> driver = null;

	@Test
	public void gotocategorypageTest() {
		driver = DriverSelector.getAndroidDriver();
		Wait.defaultMediumWait(driver);
		// DriverActions.findElement(driver,
		// ObjectRepository_HomePage.button_skip);
		DriverActions.click(driver, ObjectRepository_HomePage.button_skip);
		DriverActions.click(driver, ObjectRepository_HomePage.button_category);

		DriverActions.click(driver, ObjectRepository_HomePage.button_firstcategory);
		Wait.defaultsmallWait(driver);
		DriverActions.click(driver, ObjectRepository_HomePage.button_alllehanga);
		Wait.defaultsmallWait(driver);
		DriverActions.click(driver, ObjectRepository_HomePage.button_subcategory);
		Wait.defaultsmallWait(driver);
		DriverActions.click(driver, ObjectRepository_HomePage.button_filter);
		Wait.defaultsmallWait(driver);
		DriverActions.click(driver, ObjectRepository_HomePage.button_pricefilter);

		// at last step to stop appium server
		DriverSelector.stopAppium();
	}

	@Test
	public void gotosearchpageTest() {
		driver = DriverSelector.getAndroidDriver();
		Wait.defaultMediumWait(driver);
		// DriverActions.findElement(driver,
		// ObjectRepository_HomePage.button_skip);
		DriverActions.click(driver, ObjectRepository_HomePage.button_skip);
		DriverActions.click(driver, ObjectRepository_HomePage.button_category);

		DriverActions.click(driver, ObjectRepository_HomePage.button_firstcategory);
		Wait.defaultsmallWait(driver);
		DriverActions.click(driver, ObjectRepository_HomePage.button_alllehanga);
		Wait.defaultsmallWait(driver);
		DriverActions.click(driver, ObjectRepository_HomePage.button_subcategory);
		Wait.defaultsmallWait(driver);
		DriverActions.click(driver, ObjectRepository_HomePage.button_filter);
		Wait.defaultsmallWait(driver);
		DriverActions.click(driver, ObjectRepository_HomePage.button_pricefilter);

		// at last step to stop appium server
		DriverSelector.stopAppium();

	}

}