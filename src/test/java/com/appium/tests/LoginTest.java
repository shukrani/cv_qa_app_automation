package com.appium.tests;

import com.annotation.values.Author;
import com.appium.config.UserBaseTest;
import com.appium.config.UserCredentials;
import com.appium.pages.AccountsPage;
import com.appium.pages.LoginPage;
import com.appium.pages.WelcomePage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends UserBaseTest {

	LoginPage loginPage;
	AccountsPage accountsPage;
	UserCredentials credentials;
	WelcomePage welcomePage;

	//@Test(groups = "smoke")

	public void loginWithValidUser() throws InterruptedException {
		loginPage = new LoginPage(driver);
		credentials = new UserCredentials("chhaganlal.mathuriya@craftsvilla.com", "B9d3Dk");
		loginPage.enterUserEmail(credentials.getUserName());
		loginPage.getStarted();
		loginPage.enterPassword(credentials.getPassWord());
		loginPage.login();
		welcomePage = new WelcomePage(driver);

		Assert.assertTrue(welcomePage.verifyUserIsLoggedIn());
	}

}
