package TestCases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.HomePage;
import PageObjects.LeftNavigationMenu;
import PageObjects.ProductDetail;
import UtilityMobile.BaseMobile;
import UtilityMobile.ExtentTestManager;
import UtilityMobile.utilMobile;

public class AddToWishlist extends BaseMobile{
	
  @Test (priority = 4,enabled =true)
  public void verifyAddToWishlistMenuWithoutLogin() throws InterruptedException {
	  int menuCountViaDetail =0;
	  int menuCountViaList = 0;
	  String productDetail = "productDetail";
	  String productList = "productList";
	  
	  menuCountViaDetail = LeftNavigationMenu.changeInMenuCount(HomePage.menuCountXpath ,productDetail );
	  
	  if(menuCountViaDetail > 0){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Menu showing increase in count after product added to wishlist via product detail page.");
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Menu showing no change in count after product added to wishlist via product detail page.");
	  }
	  
	  menuCountViaList = LeftNavigationMenu.changeInMenuCount(HomePage.menuCountXpath ,productList );
	  
	  if(menuCountViaList > 0){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Menu showing increase in count after product added to wishlist via product list page.");
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Menu showing no change in count after product added to wishlist via product list page.");
	  } 
	  
  }
  
  @Test (priority = 3 , enabled =true)
  public void verifyAddToWishlistOnWishlistIconWithoutLogin() {
	  int menuCountViaDetail =0;
	  int menuCountViaList = 0;
	  String productDetail = "productDetail";
	  String productList = "productList";
	  
	  
	  menuCountViaDetail = LeftNavigationMenu.changeInWishlistCount(LeftNavigationMenu.myWishlistCountXpath , productList );
	  
	  if(menuCountViaDetail > 0){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "WishList icon showing increase in count after product added to wishlist from product list page.");
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "WishList icon showing no change in count after product added to wishlist from product list page.");
	  }
	  

	  menuCountViaList = LeftNavigationMenu.changeInWishlistCount(LeftNavigationMenu.myWishlistCountXpath , productDetail );
	  
	  if(menuCountViaList > 0){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "WishList icon showing decrease in count after product removed from wishlist via product detail page.");
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "WishList icon showing no change in count after product removed from wishlist via product detail page.");
	  }
	  
  }
  
  
  @Test (priority = 1 , enabled =false)
  public void verifyAddToWishlistMenuWithLogin() throws InterruptedException {
	  int menuCountViaDetail =0;
	  int menuCountViaList = 0;
	  String productDetail = "productDetail";
	  String productList = "productList";
	  
	  utilMobile.clickevent(HomePage.menu);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on left navigation menu.");
	  
	  utilMobile.clickevent(LeftNavigationMenu.loginLink);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on login link.");
	  
	  LeftNavigationMenu.login(utilMobile.getTestData("loginEmail"), utilMobile.getTestData("loginPassword"));
	  
	  menuCountViaDetail = LeftNavigationMenu.changeInMenuCount(HomePage.menuCountXpath ,productDetail );
	  
	  if(menuCountViaDetail > 0){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Menu showing increase in count after product added to wishlist via product detail page.");
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Menu showing no change in count after product added to wishlist via product detail page.");
	  }
	  
	  menuCountViaList = LeftNavigationMenu.changeInMenuCount(HomePage.menuCountXpath ,productList );
	  
	  if(menuCountViaList > 0){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Menu showing decrease in count after product removed from wishlist via product list page.");
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Menu showing no change in count after product removed from wishlist via product list page.");
	  } 
	  
  }
  
  @Test (priority = 2, enabled =false)
  public void verifyAddToWishlistOnWishlistIconWithLogin() {
	  int menuCountViaDetail =0;
	  int menuCountViaList = 0;
	  String productDetail = "productDetail";
	  String productList = "productList";
	  
	  utilMobile.clickevent(HomePage.menu);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on left navigation menu.");
	  
	  utilMobile.clickevent(LeftNavigationMenu.loginLink);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on login link.");
	  
	  LeftNavigationMenu.login(utilMobile.getTestData("loginEmail"), utilMobile.getTestData("loginPassword"));
	  
	  menuCountViaDetail = LeftNavigationMenu.changeInWishlistCount(LeftNavigationMenu.myWishlistCountXpath , productList );
	  
	  if(menuCountViaDetail > 0){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "WishList icon showing increase in count after product added to wishlist from product detail page.");
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "WishList icon showing no change in count after product added to wishlist from product detail page.");
	  }
	  

	  menuCountViaList = LeftNavigationMenu.changeInWishlistCount(LeftNavigationMenu.myWishlistCountXpath , productDetail );
	  
	  if(menuCountViaList > 0){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "WishList icon showing increase in count after product added to wishlist from product list page.");
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "WishList icon showing no change in count after product added to wishlist from product list page.");
	  }
	  
  }
  
}
