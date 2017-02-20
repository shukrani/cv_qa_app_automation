package com.appium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.appium.config.UserBaseTest;
import com.appium.pages.AccountsPage;
import com.appium.pages.LoginPage;
import com.appium.pages.WelcomePage;

public class RegisterTest extends UserBaseTest {

	LoginPage loginPage;
	AccountsPage accountsPage;

	WelcomePage welcomePage;

	@Test(groups = "smoke")

	public void registerWithValidUser() throws InterruptedException {
		loginPage = new LoginPage(driver);

		loginPage.enterUserEmail("cl" + System.currentTimeMillis() + "@mailinator.com");
		loginPage.getStarted();
		welcomePage = new WelcomePage(driver);

		Assert.assertTrue(welcomePage.verifyUserIsLoggedIn());
	}

}
