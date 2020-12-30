package com.trendyol.test.steps;

import org.testng.Assert;

import com.trendyol.test.StepsBase;
//import com.trendyol.test.framework.caching.Cacher;
import com.trendyol.test.page.MyCartPage;
import com.trendyol.test.page.ProductsPage;
import com.trendyol.test.page.categories.CosmeticPage;
import com.trendyol.test.page.categories.ElectronicPage;
import com.trendyol.test.page.categories.HomeAndLifePage;
import com.trendyol.test.page.categories.KidsPage;
import com.trendyol.test.page.categories.MenPage;
import com.trendyol.test.page.categories.ShoesAndPursePage;
import com.trendyol.test.page.categories.SupermarketPage;
import com.trendyol.test.page.categories.WatchAndAccessoryPage;
import com.trendyol.test.page.categories.WomenPage;

public class VerificationSteps extends StepsBase {
	
	
	// boutique image verifications 
	public static void verifyBoutiqueImagesOnWomenPage() {
		
		WomenPage womenPage = NavigationSteps.goToWomenPage();
		
		womenPage.verifyBoutiqueImages();
		
		stepExecuted("verify boutique images on women page");
		
	}
	
	public static void verifyBoutiqueImagesOnMenPage() {
		
		MenPage menPage = NavigationSteps.goToMenPage();
		
		menPage.verifyBoutiqueImages();
		
		stepExecuted("verify boutique images on men page");
		
	}
	
	public static void verifyBoutiqueImagesOnKidsPage() {
		
		KidsPage kidsPage = NavigationSteps.goToKidsPage();
		
		kidsPage.verifyBoutiqueImages();
		
		stepExecuted("verify boutique images on kids page");
		
	}
	
	public static void verifyBoutiqueImagesOnHomeAndLifePage() {
		
		HomeAndLifePage homeAndLifePage = NavigationSteps.goToHomeAndLifePage();
		
		homeAndLifePage.verifyBoutiqueImages();
		
		stepExecuted("verify boutique images on home and life page");
		
	}
	
	public static void verifyBoutiqueImagesOnSupermarketPage() {
		
		SupermarketPage supermarketPage = NavigationSteps.goToSupermarketPage();
		
		supermarketPage.verifyBoutiqueImages();
		
		stepExecuted("verify boutique images on supermarket page");
		
	}
	
	public static void verifyBoutiqueImagesOnCosmeticPage() {
		
		CosmeticPage cosmeticPage = NavigationSteps.goToCosmeticPage();
		
		cosmeticPage.verifyBoutiqueImages();
		
		stepExecuted("verify boutique images on cosmetic page");
		
	}
	
	public static void verifyBoutiqueImagesOnShoesAndPursePage() {
		
		ShoesAndPursePage shoesAndPursePage = NavigationSteps.goToShoesAndPursePage();
		
		shoesAndPursePage.verifyBoutiqueImages();
		
		stepExecuted("verify boutique images on shoes and purse page");
		
	}
	
	public static void verifyBoutiqueImagesOnWatchAndAccessoryPage() {
		
		WatchAndAccessoryPage watchAndAccessoryPage = NavigationSteps.goToWatchAndAccessoryPage();
		
		watchAndAccessoryPage.verifyBoutiqueImages();
		
		stepExecuted("verify boutique images on accessory page");
		
	}
	
	public static void verifyBoutiqueImagesOnElectronicPage() {
		
		ElectronicPage electronicPage = NavigationSteps.goToElectronicPage();
		
		electronicPage.verifyBoutiqueImages();
		
		stepExecuted("verify boutique images on electronic page");
		
	}
	
	public static void verifyBoutiqueImagesOnEveryCategory() {
		
		verifyBoutiqueImagesOnWomenPage();
		verifyBoutiqueImagesOnMenPage();
		verifyBoutiqueImagesOnKidsPage();
		verifyBoutiqueImagesOnHomeAndLifePage();
		verifyBoutiqueImagesOnSupermarketPage();
		verifyBoutiqueImagesOnCosmeticPage();
		verifyBoutiqueImagesOnShoesAndPursePage();
		verifyBoutiqueImagesOnWatchAndAccessoryPage();
		verifyBoutiqueImagesOnElectronicPage();
		
		stepExecuted("verify boutique images on every category");
		
	}
	
	//add to cart verifications
	
	public static void verifyAddedItemIncreasedTheCountOfItemsInMyCart(int itemCount) {
		
//		Assert.assertEquals(Cacher.getCache("item name in product detail page")
//						  , Cacher.getCache("item name in my cart page"));
		
		MyCartPage myCartPage = NavigationSteps.goToMyCartPage();
		
		Assert.assertEquals(myCartPage.getItemCount(), itemCount);
		
		stepExecuted("verify added item increased the count of items in my cart");
		
	}
	
	//products verifications
	
	public static void verifyBoutiqueImagesOnProductsPage() {
		
		new ProductsPage().verifyProductsImages();
		
		stepExecuted("verify boutique images on products page");
		
	}
	
}
