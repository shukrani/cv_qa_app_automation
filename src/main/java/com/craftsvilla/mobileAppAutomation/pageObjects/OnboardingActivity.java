package com.craftsvilla.mobileAppAutomation.pageObjects;

import com.craftsvilla.mobileAppAutomation.framework.DriverActions;

import io.appium.java_client.android.AndroidDriver;

public class OnboardingActivity {

	public OnboardingActivity login(AndroidDriver driver) {
		if (!DriverActions.isElementDisplay(driver, ObjectRepository.onboardingEmail)) {
			tryAgain(driver);
		}
		DriverActions.sendKeys(driver, ObjectRepository.onboardingEmail, TestData.loginEmail);
		DriverActions.click(driver, ObjectRepository.getStarted);
		DriverActions.sendKeys(driver, ObjectRepository.loginPassword, TestData.loginPass);
		if (!DriverActions.isElementDisplay(driver, ObjectRepository.loginBtn))
			DriverActions.hideKeyBoard(driver);
		DriverActions.click(driver, ObjectRepository.loginBtn);

		return this;
	}

	public void tryAgain(AndroidDriver driver) {

		if (DriverActions.isElementDisplay(driver, ObjectRepository.tryAgain)) {

			DriverActions.click(driver, ObjectRepository.tryAgain);
		}
	}

}
