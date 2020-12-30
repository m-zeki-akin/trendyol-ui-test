package com.trendyol.test.steps;

import com.trendyol.test.PageRecorder;
import com.trendyol.test.StepsBase;
import com.trendyol.test.framework.caching.Cacher;
import com.trendyol.test.page.MyCartPage;
import com.trendyol.test.page.ProductDetailPage;

public class CacheSteps extends StepsBase {
	
	public static void cacheCurrentPage(String key) {
		
		Object currentPage = PageRecorder.getCurrentPage();
		
		Cacher.cache(key, currentPage);
		
		stepExecuted("cache current page");
		
	}

	public static void cacheItemNameInProductDetailPage() {
		
		ProductDetailPage productDetailPage = new ProductDetailPage();
		
		Cacher.cache("item name in product detail page", productDetailPage.getAddedItemName());
		
		stepExecuted("cache item name in product detail page");
		
	}
	
	public static void cacheItemNameInMyCartPage() {
		
		MyCartPage myCartPage = new MyCartPage();
		
		Cacher.cache("item name in my cart page", myCartPage.getAddedItemName());
		
		stepExecuted("cacge item name in my cart page");
		
	}
}
