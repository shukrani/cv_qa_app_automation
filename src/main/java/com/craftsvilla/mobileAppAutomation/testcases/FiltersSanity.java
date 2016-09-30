package com.craftsvilla.mobileAppAutomation.testcases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.craftsvilla.mobileAppAutomation.framework.DriverActions;
import com.craftsvilla.mobileAppAutomation.framework.DriverSelector;
import com.craftsvilla.mobileAppAutomation.framework.ObjectRepository_HomePage;
import com.craftsvilla.mobileAppAutomation.framework.Wait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class FiltersSanity {
	AndroidDriver<MobileElement> driver = null;

	@Test
	public void gotocategorypageTest() {
		driver = DriverSelector.getAndriodDriver();
		Wait.defaultMediumWait(driver);
		//DriverActions.findElement(driver, ObjectRepository_HomePage.button_skip);
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

	}

	@Test
	public void autoSuggestionsdisplayTest() {
		try {
			driver = DriverSelector.getAndriodDriver();
			Wait.defaultMediumWait(driver);
			//DriverActions.findElement(driver, ObjectRepository_HomePage.button_skip);
			DriverActions.click(driver, ObjectRepository_HomePage.button_skip);
			DriverActions.click(driver, ObjectRepository_HomePage.textbox_searchbox);

			DriverActions.click(driver, ObjectRepository_HomePage.textbox_editSearch);
			Wait.defaultsmallWait(driver);
			//DriverActions.sendKeys(driver, ObjectRepository_HomePage.textbox_editSearch, "saarees");

			WebElement search = DriverActions.findElement(driver, ObjectRepository_HomePage.span_recentSearch);
			Assert.assertTrue(search.isDisplayed());
			//search.sendKeys(Keys.ENTER);
			//DriverActions.sendKeys(driver, ObjectRepository_HomePage.textbox_editSearch, Keys.ENTER);
			Wait.defaultsmallWait(driver);
			/*DriverActions.click(driver, ObjectRepos1itory_HomePage.button_subcategory);
			Wait.defaultsmallWait(driver);
			DriverActions.click(driver, ObjectRepository_HomePage.button_filter);
			Wait.defaultsmallWait(driver);
			DriverActions.click(driver, ObjectRepository_HomePage.button_pricefilter);*/
		} catch (Exception e) {
			Assert.assertTrue(false);
		}

	}

	@Test
	public void gotoSearchPageTest() {
		try {
			driver = DriverSelector.getAndriodDriver();
			Wait.defaultMediumWait(driver);
			//DriverActions.findElement(driver, ObjectRepository_HomePage.button_skip);
			DriverActions.click(driver, ObjectRepository_HomePage.button_skip);
			DriverActions.click(driver, ObjectRepository_HomePage.textbox_searchbox);

			DriverActions.click(driver, ObjectRepository_HomePage.textbox_editSearch);
			Wait.defaultsmallWait(driver);
			DriverActions.sendKeys(driver, ObjectRepository_HomePage.textbox_editSearch, "saarees");

			WebElement search = DriverActions.findElement(driver, ObjectRepository_HomePage.span_recentSearch);
			search.click();
			//Assert.assertTrue(search.isDisplayed());
			//search.sendKeys(Keys.ENTER);
			//DriverActions.sendKeys(driver, ObjectRepository_HomePage.textbox_editSearch, Keys.ENTER);
			Wait.defaultsmallWait(driver);
			/*DriverActions.click(driver, ObjectRepos1itory_HomePage.button_subcategory);
			Wait.defaultsmallWait(driver);
			DriverActions.click(driver, ObjectRepository_HomePage.button_filter);
			Wait.defaultsmallWait(driver);
			DriverActions.click(driver, ObjectRepository_HomePage.button_pricefilter);*/
		} catch (Exception e) {
			Assert.assertTrue(false);
		}

	}

}
