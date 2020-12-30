package com.trendyol.test.steps;

import com.trendyol.test.StepsBase;
import com.trendyol.test.page.BoutiquePage;
import com.trendyol.test.page.HomePage;
import com.trendyol.test.page.MyCartPage;
import com.trendyol.test.page.ProductDetailPage;
import com.trendyol.test.page.ProductsPage;
import com.trendyol.test.page.SignInPage;
import com.trendyol.test.page.categories.CosmeticPage;
import com.trendyol.test.page.categories.ElectronicPage;
import com.trendyol.test.page.categories.HomeAndLifePage;
import com.trendyol.test.page.categories.KidsPage;
import com.trendyol.test.page.categories.MenPage;
import com.trendyol.test.page.categories.ShoesAndPursePage;
import com.trendyol.test.page.categories.SupermarketPage;
import com.trendyol.test.page.categories.WatchAndAccessoryPage;
import com.trendyol.test.page.categories.WomenPage;
import com.trendyol.test.page.common.Common;

public class NavigationSteps extends StepsBase {
	
	// home navigation
	public static HomePage goToHomePage() {
		
		Common.clickLogo();
		
		stepExecuted("go to home page");
		
		return new HomePage();
		
	}
	
	// sign in navigation
	public static SignInPage goToSignInPage() {
		
		Common.clickSignInButton();
		
		stepExecuted("go to sign in page");
		
		return new SignInPage();
		
	}
	
	// category navigation
	public static WomenPage goToWomenPage() {
		
		Common.clickWomenTab();

		stepExecuted("go to home page");
		
		return new WomenPage();
		
	}
	
	public static MenPage goToMenPage() {
		
		Common.clickMenTab();
		
		stepExecuted("go to men page");
		
		return new MenPage();

	}
	
	public static KidsPage goToKidsPage() {
		
		Common.clickKidsTab();
		
		stepExecuted("go to kids page");
			
		return new KidsPage();

	}
	
	public static HomeAndLifePage goToHomeAndLifePage() {
		
		Common.clickHomeAndLifeTab();
		
		stepExecuted("go to home and life page");
		
		return new HomeAndLifePage();

	}
	
	public static SupermarketPage goToSupermarketPage() {
		
		Common.clickSupermarketTab();
		
		stepExecuted("go to supermarket page");
		
		return new SupermarketPage();
		
	}
	
	public static CosmeticPage goToCosmeticPage() {
		
		Common.clickCosmeticTab();
		
		stepExecuted("go to cosmetic page");
		
		return new CosmeticPage();

	}
	
	public static ShoesAndPursePage goToShoesAndPursePage() {
		
		Common.clickShoesAndPurseTab();
		
		stepExecuted("go to shoes and purse page");
		
		return new ShoesAndPursePage();

	}
	
	public static WatchAndAccessoryPage goToWatchAndAccessoryPage() {
		
		Common.clickWatchAndAccessoryTab();
		
		stepExecuted("go to watch and accessory page");
		
		return new WatchAndAccessoryPage();

	}
	
	public static ElectronicPage goToElectronicPage() {
		
		Common.clickElectronicsTab();
		
		stepExecuted("go to electronic page");
		
		return new ElectronicPage();

	}
	
	
	// boutique navigation
	public static ProductsPage goToGreaterBoutique(int which) {
		
		new BoutiquePage().clickLesserBoutiqueBySelection(which);
		
		stepExecuted("go to products page");
		
		return new ProductsPage();

	}
	
	public static ProductsPage goToLesserBoutique(int which) {
		
		new BoutiquePage().clickLesserBoutiqueBySelection(which);
		
		stepExecuted("go to lesser boutique page");
		
		return new ProductsPage();

	}
	
	public static ProductsPage goToRandomBoutique() {
		
		new BoutiquePage().clickRandomBoutique();
		
		stepExecuted("go to random boutique page");
		
		return new ProductsPage();

	}
	
	// product navigation
	public static ProductDetailPage goToProduct(int which) {
		
		new ProductsPage().clickProductBySelection(which);
		
		stepExecuted("go to product detail page");
		
		return new ProductDetailPage();

	}
	
	// my cart navigation
	public static MyCartPage goToMyCartPage() {
		
		Common.clickMyCartIcon();
		
		stepExecuted("go to my cart page");
		
		return new MyCartPage();

	}
	
}
