package com.trendyol.test.page.popup;

import org.openqa.selenium.By;

import com.trendyol.test.PageBase;
import com.trendyol.test.PageRecorder;

public class PopupSuccess extends PageBase{
	
	final By popup_success = By.xpath("//*[@class=\"popup-success-title\"]");
	
	public PopupSuccess() {
		
		assertPage(popup_success);
		
		PageRecorder.setCurrentPage(this);
		
	}
	
	final By popup_success_close = By.xpath("//*[@class=\"popup-success-agree-button\"]");
	
	public void clickCloseButton() {
		
		driver.findElement(popup_success_close).click();
		
		pageLoaded("success popup");
		
	}
	
}
