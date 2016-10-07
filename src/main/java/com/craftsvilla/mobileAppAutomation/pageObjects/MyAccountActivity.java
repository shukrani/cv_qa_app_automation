package com.craftsvilla.mobileAppAutomation.pageObjects;

import com.craftsvilla.mobileAppAutomation.framework.DriverActions;

import io.appium.java_client.android.AndroidDriver;

public class MyAccountActivity {

	public MyAccountActivity logout(AndroidDriver driver) {
		if (!DriverActions.isElementDisplay(driver, ObjectRepository.logoutButton)) {

			DriverActions.swipe(driver, ObjectRepository.others, ObjectRepository.accountInfo);
		}
		DriverActions.click(driver, ObjectRepository.logoutButton);

		return this;
	}

}
