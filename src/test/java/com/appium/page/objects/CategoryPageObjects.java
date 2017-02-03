package com.appium.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CategoryPageObjects {

	@AndroidFindBy(id = "com.craftsvilla.app:id/categoryItemLayoutGridView")
	public MobileElement PRODUCT_LIST;
	@AndroidFindBy(id = "com.craftsvilla.app:id/defaultSlider")
	public MobileElement SUB_CATEGORY_GEORGETTE;
}
