package com.craftsvilla.testcase;

import org.junit.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.craftsvilla.framework.DriverActions;
import com.craftsvilla.framework.DriverSelector;
import com.craftsvilla.framework.FailedTestCases;
import com.craftsvilla.pageObjects.ObjectRepository;
import com.craftsvilla.pageObjects.TestData;

import io.appium.java_client.android.AndroidDriver;

public class LoginTest {

	AndroidDriver<?> driver = null;

	@Test
	public void loginContentTest() {
		// System.setProperty("PATH",
		//		"/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games:/usr/local/games:$ANDROID_HOME/tools:$ANDROID_HOME/platform-tools:/home/chhagan/node-v4.5.0-linux-x64/bin:/home/chhagan/apache-maven-3.3.9/apache-maven/src/bin:/home/chhagan/android-sdk-linux/tools:/home/chhagan/android-sdk-linux/platform-tools");
		driver = DriverSelector.getAndroidDriver();

		Assert.assertTrue(DriverActions.isElementDisplay(driver, ObjectRepository.onboardingEmail));
		Assert.assertTrue(DriverActions.isElementDisplay(driver, ObjectRepository.getStarted));
		driver.quit();

	}

	@Test
	public void loginTest() {
//		System.setProperty("PATH",
//				"/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games:/usr/local/games:$ANDROID_HOME/tools:$ANDROID_HOME/platform-tools:/home/chhagan/node-v4.5.0-linux-x64/bin:/home/chhagan/apache-maven-3.3.9/apache-maven/src/bin:/home/chhagan/android-sdk-linux/tools:/home/chhagan/android-sdk-linux/platform-tools");
		driver = DriverSelector.getAndroidDriver();

		DriverActions.sendKeys(driver, ObjectRepository.onboardingEmail, TestData.loginEmail);
		DriverActions.click(driver, ObjectRepository.getStarted);
		DriverActions.sendKeys(driver, ObjectRepository.loginPassword, TestData.loginPass);
		if (!DriverActions.isElementDisplay(driver, ObjectRepository.loginBtn))
			DriverActions.hideKeyBoard(driver);
		DriverActions.click(driver, ObjectRepository.loginBtn);

		Assert.assertTrue(DriverActions.isElementDisplay(driver, ObjectRepository.searchTextView));
		driver.quit();

	}

	@AfterMethod

	public void closeBrowser(ITestResult result) {
		if (result.getStatus() == 2) {
			FailedTestCases.actionAfterFailedTestcase(driver, result);
		}
		// driver.quit();
		DriverSelector.stopAppium();

	}

}
