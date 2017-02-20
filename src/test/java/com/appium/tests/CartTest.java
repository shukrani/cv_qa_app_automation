package com.appium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.appium.config.UserBaseTest;
import com.appium.config.UserCredentials;
import com.appium.pages.AccountsPage;
import com.appium.pages.CategoryPage;
import com.appium.pages.LoginPage;
import com.appium.pages.ProductPage;
import com.appium.pages.WelcomePage;

public class CartTest extends UserBaseTest {

	LoginPage loginPage;
	AccountsPage accountsPage;
	UserCredentials credentials;
	WelcomePage welcomePage;
	CategoryPage categoryPage;
	ProductPage productPage;

	@Test(groups = "smoke", alwaysRun = true)

	public void addToCartWithLogin() throws InterruptedException {

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
		int previousCount = productPage.getCartCount();
		productPage.addToCart();
		int afterCount = productPage.getCartCount();
		Assert.assertTrue(afterCount == previousCount + 1);

	}

	@Test(groups = "smoke", alwaysRun = true)
	public void addToCartWithoutLogin() throws InterruptedException {
		loginPage = new LoginPage(driver);
		loginPage.skip();
		welcomePage = new WelcomePage(driver);
		Assert.assertTrue(welcomePage.verifyUserIsLoggedIn());
		categoryPage = welcomePage.moveToCategory();
		categoryPage.moveToSubCategoryPage();
		productPage = categoryPage.moveToProductPage();
		int previousCount = productPage.getCartCount();
		productPage.addToCart();
		int afterCount = productPage.getCartCount();
		Assert.assertTrue(afterCount == previousCount + 1);

	}

}
