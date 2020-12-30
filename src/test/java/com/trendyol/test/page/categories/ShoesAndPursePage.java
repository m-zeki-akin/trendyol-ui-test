package com.trendyol.test.page.categories;

import org.openqa.selenium.By;

import com.trendyol.test.PageRecorder;
import com.trendyol.test.page.BoutiquePage;

public class ShoesAndPursePage extends BoutiquePage {
	
	final By shoes_and_purse_tab_active = By.xpath("//a[@href='/butik/liste/ayakkabi--canta']/parent::li[@class='tab-link active']");
	
	public ShoesAndPursePage() {
		
		assertPage(shoes_and_purse_tab_active);
		
		PageRecorder.setCurrentPage(this);
		
		pageLoaded("shoes and purse page");
		
	}
	
}
