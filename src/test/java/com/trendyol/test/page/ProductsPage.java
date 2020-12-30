package com.trendyol.test.page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.trendyol.test.PageBase;
import com.trendyol.test.PageRecorder;
import com.trendyol.test.framework.verification.image.ImageVerification;

public class ProductsPage extends PageBase{

	final By products_page = By.xpath("//div[@id='boutique-detail-app']");
	
	public ProductsPage() {
		
		assertPage(products_page);
		
		PageRecorder.setCurrentPage(this);
		
		pageLoaded("products page");
		
	}
	
	final By product = By.xpath("//img[contains(@class,'p-card-img')]");
	
	public void verifyProductsImages() {
		
		for(WebElement e: driver.findElements(product)) {
			
			ImageVerification.isImageSuccessfullyLoaded(e);
			
		}
		
	}
	
	public void clickProductBySelection(int index) {
			
		List<WebElement> products = new ArrayList<>();
		
		products.addAll(driver.findElements(product));
		
		products.get(index-1).click();
			
	}
	
}
