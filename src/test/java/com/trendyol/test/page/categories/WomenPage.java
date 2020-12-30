package com.trendyol.test.page.categories;

import org.openqa.selenium.By;

import com.trendyol.test.PageRecorder;
import com.trendyol.test.page.BoutiquePage;

public class WomenPage extends BoutiquePage {
	
	final By women_tab_active = By.xpath("//a[@href='/butik/liste/kadin']/parent::li[@class='tab-link active']");
	
	public WomenPage() {
		
		assertPage(women_tab_active);
		
		PageRecorder.setCurrentPage(this);
		
		pageLoaded("women page");
		
	}
	
}
