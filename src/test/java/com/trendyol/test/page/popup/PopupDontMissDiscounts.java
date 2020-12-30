package com.trendyol.test.page.popup;

import org.openqa.selenium.By;

import com.trendyol.test.PageBase;
import com.trendyol.test.PageRecorder;

public class PopupDontMissDiscounts extends PageBase {
	
	final By popup_dont_miss_discounts = By.xpath("//div[@class=\"notification-popup-container\"]");
	
	public PopupDontMissDiscounts() {
		
		assertPage(popup_dont_miss_discounts);
		
		PageRecorder.setCurrentPage(this);
		
	}
	
	final By popup_close_button = By.xpath("//div[@title=\"Kapat\"]");
	
	// methods
	public void clickCloseButton() {
		
		driver.findElement(popup_close_button).click();
		
		pageLoaded("don't miss discounts popup");
		
	}
	
}
