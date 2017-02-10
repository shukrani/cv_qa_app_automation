package com.appium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.appium.config.UserBaseTest;
import com.appium.config.UserCredentials;
import com.appium.pages.AccountsPage;
import com.appium.pages.CategoryPage;
import com.appium.pages.LoginPage;
import com.appium.pages.MyCartPage;
import com.appium.pages.ProductPage;
import com.appium.pages.WelcomePage;

public class ProductPageTest extends UserBaseTest {

	LoginPage loginPage;
	AccountsPage accountsPage;
	UserCredentials credentials;
	WelcomePage welcomePage;
	CategoryPage categoryPage;
	ProductPage productPage;
	MyCartPage cartPage;

	@Test(groups = "smoke")

	public void codAvailableWithLogin() throws InterruptedException {

		loginPage = new LoginPage(driver);
		credentials = new UserCredentials("chhaganlal.mathuriya@craftsvilla.com", "B9d3Dk");
		loginPage.enterUserEmail(credentials.getUserName());
		loginPage.getStarted();
		loginPage.enterPassword(credentials.getPassWord());
		loginPage.login();
		welcomePage = new WelcomePage(driver);
		Assert.assertTrue(welcomePage.verifyUserIsLoggedIn());
		categoryPage = welcomePage.moveToCategory();
		categoryPage.moveToSubCategoryPage();
		productPage = categoryPage.moveToProductPage();

		Assert.assertTrue(productPage.isCODAvailable());

	}

	@Test(groups = "smoke")
	public void codAvailableWithoutLogin() throws InterruptedException {
		loginPage = new LoginPage(driver);
		loginPage.skip();
		welcomePage = new WelcomePage(driver);
		Assert.assertTrue(welcomePage.verifyUserIsLoggedIn());
		categoryPage = welcomePage.moveToCategory();
		categoryPage.moveToSubCategoryPage();
		productPage = categoryPage.moveToProductPage();
		Assert.assertTrue(productPage.isCODAvailable());

	}

}
