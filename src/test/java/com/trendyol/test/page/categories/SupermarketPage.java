package com.trendyol.test.page.categories;

import org.openqa.selenium.By;

import com.trendyol.test.PageRecorder;
import com.trendyol.test.page.BoutiquePage;

public class SupermarketPage extends BoutiquePage {
	
	final By supermarket_tab_active = By.xpath("//a[@href='/butik/liste/supermarket']/parent::li[@class='tab-link active']");
	
	public SupermarketPage() {
		
		assertPage(supermarket_tab_active);
		
		PageRecorder.setCurrentPage(this);
		
		pageLoaded("supermarket page");
		
	}
	
}
