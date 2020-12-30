package com.trendyol.test.page;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.trendyol.test.PageBase;
import com.trendyol.test.PageRecorder;
import com.trendyol.test.framework.verification.image.ImageVerification;
import com.trendyol.test.framework.wait.Wait;

public class BoutiquePage extends PageBase {
	
	static final By boutiques_component = By.xpath("//article[@class=\"component-item\"]//img");
	static final By boutiques_banner = By.xpath("//div[@id=\"banners-wrapper\"]//img");
	
	public BoutiquePage() {
		
		assertPage(boutiques_component);
		
		assertPage(boutiques_banner);
		
		PageRecorder.setCurrentPage(this);
		
		pageLoaded("boutique page");
		
	}
	
	public Object getCurrentPage() {
		
		return this;
		
	}
	
	public void verifyBoutiqueImages() {
		
		Wait.forSeconds(3);
		
		for(WebElement e: driver.findElements(boutiques_component)) {
			
			ImageVerification.isImageSuccessfullyLoaded(e);
			
		}
		
		for(WebElement e: driver.findElements(boutiques_banner)) {
			
			ImageVerification.isImageSuccessfullyLoaded(e);
			
		}
		
	}
	
	public void clickGreaterBoutiqueBySelection(int which) {
		
		List<WebElement> boutiques = new ArrayList<>();
		
		boutiques.addAll(driver.findElements(boutiques_component));
		
		boutiques.get(which-1).click();
		
	}
	
	public void clickLesserBoutiqueBySelection(int which) {
		
		List<WebElement> boutiques = new ArrayList<>();
		
		boutiques.addAll(driver.findElements(boutiques_banner));
		
		boutiques.get(which-1).click();
		
	}
	
	public void clickRandomBoutique() {
		
		List<WebElement> boutiques = new ArrayList<>();
		
		boutiques.addAll(driver.findElements(boutiques_component));
		
		Random rand = new Random();
		
		int randNum = rand.nextInt(boutiques.size());
		
		boutiques.get(randNum).click();
		
	}
	
}
