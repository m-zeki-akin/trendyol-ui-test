package com.trendyol.test.page;

import org.openqa.selenium.By;

import com.trendyol.test.PageBase;
import com.trendyol.test.PageRecorder;

public class ProductDetailPage extends PageBase{
	
	final By product_detail_page = By.xpath("//div[@id='product-detail-app']");
	
	public ProductDetailPage() {
		
		assertPage(product_detail_page);
		
		PageRecorder.setCurrentPage(this);
		
		pageLoaded("product detail page");
		
	}
	
	final By product_name = By.xpath("//*[@class='pr-new-br']");
	final By add_to_cart = By.xpath("//div[@class='add-to-bs-tx']");
	
	public String getAddedItemName() {
		
		return driver.findElement(product_name).getText();
		
	}
	
	public void clickAddToCart() {
		
		driver.findElement(add_to_cart).click();
		
	}
	
}
