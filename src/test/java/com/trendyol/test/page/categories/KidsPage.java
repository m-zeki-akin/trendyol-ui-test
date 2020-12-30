package com.trendyol.test.page.categories;

import org.openqa.selenium.By;

import com.trendyol.test.PageRecorder;
import com.trendyol.test.page.BoutiquePage;

public class KidsPage extends BoutiquePage {
	
	final By kids_tab_active = By.xpath("//a[@href='/butik/liste/cocuk']/parent::li[@class='tab-link active']");
	
	public KidsPage() {
		
		assertPage(kids_tab_active);
		
		PageRecorder.setCurrentPage(this);
		
		pageLoaded("kids page");
		
	}
	
}
