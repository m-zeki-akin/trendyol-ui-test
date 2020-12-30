package com.trendyol.test.steps;
import org.openqa.selenium.NoSuchElementException;

import com.trendyol.test.StepsBase;
import com.trendyol.test.page.MyCartPage;
import com.trendyol.test.page.ProductDetailPage;
import com.trendyol.test.page.SignInPage;
import com.trendyol.test.page.common.Common;
import com.trendyol.test.page.popup.PopupDontMissDiscounts;
import com.trendyol.test.page.popup.PopupEntry;
import com.trendyol.test.page.popup.PopupMyCartRemoveItem;

public class ActionSteps extends StepsBase {
	
	public static void SignInWithCredentials(String email, String password) {
		
		SignInPage signInPage = NavigationSteps.goToSignInPage();
		
		signInPage.enterCredentials(email, password);
		
		try {
			
			new PopupDontMissDiscounts().clickCloseButton();
			
		}catch (NoSuchElementException e) {
			
			NavigationSteps.goToHomePage();
			
			new PopupDontMissDiscounts().clickCloseButton();
			
		}
		
		stepExecuted("sign in with credentials");
		
	}
	
	public static void handleEntryPopups() {
		
		new PopupEntry().clickCloseButton();
		
		stepExecuted("handle entry popups");
		
	}
	
	public static void addProductToCart() {
		
		new ProductDetailPage().clickAddToCart();
		
		stepExecuted("add product to cart");
		
	}
	
	public static void cleanMyCart() {
		
		int itemCount = new MyCartPage().getItemCount();
		
		for (int i = 0; i < itemCount; i++) {
			
			new MyCartPage().clickTrashButton();
			
			new PopupMyCartRemoveItem().clickRemoveButton();
			
		}
		
		stepExecuted("clean my cart");
		
	}
	
	public static void logout() {
		
		Common.hoverAndClickLogoutButton();
		
		stepExecuted("logout");
		
	}
	
}
