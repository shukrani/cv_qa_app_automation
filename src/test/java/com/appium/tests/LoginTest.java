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

	// @Test(groups = "smoke")

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

	// @Test
	public void loginWithInValidUser() throws InterruptedException {
		loginPage = new LoginPage(driver);
		credentials = new UserCredentials("vodqa123@gmail.com", "Hello12342225678");
		loginPage.enterValidCredentails(credentials.getUserName(), credentials.getPassWord());
		String userNameLoggedIn = loginPage.validateErrorMessage();
		Assert.assertEquals(userNameLoggedIn, "The username or password you entered is incorrect");
	}

	// @Test
	public void logOutTest() throws InterruptedException {
		loginPage = new LoginPage(driver);
		accountsPage = new AccountsPage(driver);
		credentials = new UserCredentials("vodqa@gmail.com", "Hello12345678");
		Boolean validateUserIsLoggedOut = loginPage
				.enterValidCredentails(credentials.getUserName(), credentials.getPassWord()).waitForWelcomePage()
				.moveToDisconnect().logOut().validateUserNameFieldIsDisplayed();
		Assert.assertTrue(validateUserIsLoggedOut, "Failed to log out users");
	}

}
