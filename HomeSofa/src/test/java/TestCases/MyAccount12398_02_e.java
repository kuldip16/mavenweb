package TestCases;

import org.testng.annotations.Test;

import Utility.Base;
import Utility.ExtentTestManager;
import Utility.util;

import applicationUtility.appFunctions;
import com.relevantcodes.extentreports.LogStatus;

public class MyAccount12398_02_e extends Base {
	
  @Test (groups = {"Sanity","Regression"})
  public void verifyWishList() throws InterruptedException {
	  int beforCountOne;
	  String beforCountMeinKonto = null;
	  String removeCountMeinKonto = null;
	  int removeCount;
	  String productName= null;
	  String productNameNew = null;
	  String topProductTitleVal = null;
	  boolean addToCartExists= false;
	  
	  appFunctions.navigateToProductDetailPage(util.getTestData("loginEmail"), util.getTestData("loginPassword"));
	  
	  util.clickByXpath(addtowishlist);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on add to wishlist");
	  
	  productName = util.getText(productname_e);
	  productNameNew =  productName.toLowerCase();
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Saved product name");
	  
	  util.mousehover(MeinKontoAfterLogin);
	  util.clickByXpath(wishlistcounter2_e);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Moved to wishlist page");
	  
	  topProductTitleVal = util.getAttribute("href", topProductTitle);
	  if(topProductTitleVal.contains(productNameNew)){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Product title is same."); 
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Product title is different"); 
	  }
	  
	  addToCartExists = util.elementPresentOrNot(topAddToCart);
	  if(addToCartExists){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "AddToCart is present on wishlist page.");   
	  }
	  else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "AddToCart not visible on wishlist page.");
	  }
	  
	  beforCountMeinKonto = util.getText(wishlistcounter_e);
	  beforCountOne = Integer.parseInt(beforCountMeinKonto);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Before removing product from wishlist, the count is: "+beforCountOne);
	  
	  util.clickByXpath(topRemove);
	  Thread.sleep(3000);
	 /* topProductTitleVal = util.getAttribute("href", topProductTitle);
	  if(topProductTitleVal.contains(productNameNew)){
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Product is still present after being removed"); 
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Product is removed successfully.");
	  }*/
	  
	  removeCountMeinKonto = util.getText(wishlistcounter_e);
	  removeCount = Integer.parseInt(removeCountMeinKonto);
	  if(removeCount==beforCountOne){
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Product is still present after being removed");
		   
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Product is removed successfully."); 
	  }
	  
	  
  }
}
