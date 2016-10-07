package com.craftsvilla.mobileAppAutomation.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.craftsvilla.mobileAppAutomation.framework.DriverSelector;

import io.appium.java_client.android.AndroidDriver;

public class BaseTest {
	AndroidDriver<?> driver = null;

	@BeforeMethod
	public void beforeMethod() {
		driver = DriverSelector.getAndroidDriver();

	}

	@AfterMethod
	public void afterMethod() {

		DriverSelector.stopAppium();
	}

}
