package com.trendyol.test.page.categories;

import org.openqa.selenium.By;

import com.trendyol.test.PageRecorder;
import com.trendyol.test.page.BoutiquePage;

public class CosmeticPage extends BoutiquePage {
	
	final By cosmetic_tab_active = By.xpath("//a[@href='/butik/liste/kozmetik']/parent::li[@class='tab-link active']");
	
	public CosmeticPage() {
		
		assertPage(cosmetic_tab_active);
		
		PageRecorder.setCurrentPage(this);
		
		pageLoaded("cosmetic page");
		
	}
	
}
