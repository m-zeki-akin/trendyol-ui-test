package com.trendyol.test.page.categories;

import org.openqa.selenium.By;

import com.trendyol.test.PageRecorder;
import com.trendyol.test.page.BoutiquePage;

public class ElectronicPage extends BoutiquePage {
	
	final By electronic_tab_active = By.xpath("//a[@href='/butik/liste/elektronik']/parent::li[@class='tab-link active']");
	
	public ElectronicPage() {
		
		assertPage(electronic_tab_active);
		
		PageRecorder.setCurrentPage(this);
		
		pageLoaded("electronic page");
		
	}
	
}
