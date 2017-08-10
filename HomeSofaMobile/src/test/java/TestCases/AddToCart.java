package TestCases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.Cart;
import PageObjects.HomePage;
import PageObjects.LeftNavigationMenu;
import UtilityMobile.BaseMobile;
import UtilityMobile.ExtentTestManager;
import UtilityMobile.utilMobile;

public class AddToCart extends BaseMobile {
	
  @Test (enabled=false)
  public void verifyAddToCart() {
	  
	  int cartCount = 0;
	  
	  cartCount = LeftNavigationMenu.changeInCartCount(LeftNavigationMenu.cartCountXpath,"addToCart");
	  
	  if(cartCount>0){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Cart showing increase in count after adding product to cart.");  
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Cart showing no change in count after adding product to cart.");
	  }
	  
  }
  
  @Test (enabled=false)
  public void verifyAddToCartWithLogin() {
	  
	  int cartCount = 0;
	  
	  utilMobile.clickevent(HomePage.menu);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on left navigation menu.");
	  
	  utilMobile.clickevent(LeftNavigationMenu.loginLink);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on login link.");
	  
	  LeftNavigationMenu.login(utilMobile.getTestData("loginEmail"), utilMobile.getTestData("loginPassword"));
	  
	  cartCount = LeftNavigationMenu.changeInCartCount(LeftNavigationMenu.cartCountXpath,"addToCart");
	  
	  if(cartCount>0){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Cart showing increase in count after adding product to cart.");  
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Cart showing no change in count after adding product to cart.");
	  }
	  
  }
  
  @Test (enabled=false)
  public void verifyRemoveFromCart() throws InterruptedException{
	  int cartCount = 0;
	  boolean cartEmpty = false;
	  
      cartCount = LeftNavigationMenu.changeInCartCount(LeftNavigationMenu.cartCountXpath,"removeFromCart");
      Thread.sleep(2000);
	  utilMobile.alertOperation("accept");
	  ExtentTestManager.getTest().log(LogStatus.PASS, "Removing from cart"); 
	  
      cartEmpty = utilMobile.elementPresentOrNot(Cart.emptyCartPartXpath);
      
      if(cartEmpty){
    	  ExtentTestManager.getTest().log(LogStatus.PASS, "Product successfully removed from cart.");  
      }else{
    	  ExtentTestManager.getTest().log(LogStatus.FAIL, "Product is not removed from cart.");
      }
      
	  if(cartCount>0){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Cart showing decrease in count after removing product from cart.");  
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Cart showing no change in count after removing product from cart.");
	  }
	  
  }
  
  @Test (enabled=false)
  public void verifyLoginFromCart(){
	  String actualVeryText =null;
	  String expectedText = "Lieferadresse ändern";
	  
	  Cart.loginFromCart();
	  
	  actualVeryText = utilMobile.getText(Cart.changeShippingAddressXpath);
	  
	  if(actualVeryText.equalsIgnoreCase(expectedText)){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "logged in successfully via cart page."); 
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Not able to login via cart page."); 
	  }
	  
  }
  
  @Test (enabled=true)
  public void verifyRegistrationFromCart(){
	  String actualVeryText =null;
	  String expectedText = "Lieferadresse ändern";
	  
	  Cart.registrationFromCart();
	  
      actualVeryText = utilMobile.getText(Cart.changeShippingAddressXpath);
	  
	  if(actualVeryText.equalsIgnoreCase(expectedText)){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Registered successfully via cart page."); 
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Not able to register via cart page."); 
	  }
  }
  
  @Test (enabled=false)
  public void verifyPriceOnCart(){
	  boolean priceCorrectOrNot = false;
	  
	  priceCorrectOrNot = Cart.verifyProductPriceOnCart();
	  
	  if(priceCorrectOrNot){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Price on cart page is same as on product detail page."); 
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Price on cart page is incorrect."); 
	  }
  }
}
