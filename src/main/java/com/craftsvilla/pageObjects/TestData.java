package com.craftsvilla.pageObjects;

import com.craftsvilla.framework.GetTestData;

public class TestData {

	static public GetTestData testData = new GetTestData();

	static public String loginEmail = testData.getTestData("loginEmail");
	static public String loginPass = testData.getTestData("loginPass");
	static public String guestEmail = System.currentTimeMillis() + testData.getTestData("guestEmail");

}
