package com.trendyol.test.tests;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.trendyol.test.TestBase;
import com.trendyol.test.steps.ActionSteps;
import com.trendyol.test.steps.NavigationSteps;
import com.trendyol.test.steps.VerificationSteps;

public class MyTest extends TestBase {
	
	@BeforeTest
	public void beforeTest() {
		
		driver.get("https://www.trendyol.com/");
		
		ActionSteps.handleEntryPopups();
		
		ActionSteps.SignInWithCredentials("trendyoltest0000@gmail.com", "trendyol1");
		
		NavigationSteps.goToMyCartPage();
		
		ActionSteps.cleanMyCart();
		
	}
	
	@AfterTest
	public void afterTest() {
		
		ActionSteps.logout();
		
	}
	
	@Test
	public void myTest() {
		
		VerificationSteps.verifyBoutiqueImagesOnEveryCategory();
		
		NavigationSteps.goToRandomBoutique();
		
		VerificationSteps.verifyBoutiqueImagesOnProductsPage();
		
		NavigationSteps.goToProduct(1);
		
		ActionSteps.addProductToCart();
		
		VerificationSteps.verifyAddedItemIncreasedTheCountOfItemsInMyCart(1);
		
	}
}
