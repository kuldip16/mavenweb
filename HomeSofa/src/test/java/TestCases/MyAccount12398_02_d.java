package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utility.Base;
import Utility.ExtentTestManager;
import Utility.util;


import applicationUtility.appFunctions;
import com.relevantcodes.extentreports.LogStatus;

public class MyAccount12398_02_d extends Base{
	
  @Test (groups = {"Sanity","Regression"})
  public void verifyAddToWishList() throws InterruptedException {
	  
	  String expectedHeartIconText = "Auf den Wunschzettel setzen";
	  String actualHeartIconText = null;
	  String cartRemoveAttribute = null;
	  String cardAddAttribute = null;
	  int beforCountOne;
	  String beforCountMeinKonto = null;
	  String afterCountMeinKonto = null;
	  int afterCountOne;
	  String removeCountMeinKonto = null;
	  int removeCount;
	  
	  appFunctions.navigateToProductDetailPage(util.getTestData("loginEmail"), util.getTestData("loginPassword"));
	  
	  util.mousehover(addtowishlist);
	  actualHeartIconText = util.getText(addtowishlist);
	  Assert.assertEquals(actualHeartIconText, expectedHeartIconText);
	  ExtentTestManager.getTest().log(LogStatus.PASS, "Heart icon exists on product page");
	  
	  beforCountMeinKonto = util.getText(wishlistcounter_e);
	  beforCountOne = Integer.parseInt(beforCountMeinKonto);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Before clicking add to wishlist, the count of wishlist is: "+beforCountOne);
	  
	  util.clickByXpath(addtowishlist);
	  try{
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on add to wishlist");
	  Thread.sleep(5000);
	  afterCountMeinKonto = util.getText(wishlistcounter_e);
	  afterCountOne = Integer.parseInt(afterCountMeinKonto);
	  
	  if(afterCountOne==(beforCountOne + 1)){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "After clicking add to wishlist, the count of wishlist incread by one and now total value is: "+afterCountOne); 
	  }else{
		  util.clickByXpath(removewishlist_e);  
		  Assert.fail("Count doesn't increase after clicking add to wishlist");
	  }
	  }
	  catch(Exception e){
		  util.clickByXpath(removewishlist_e);  
	  }
	  util.mousehover(removewishlist_e);
	  cartRemoveAttribute = util.getAttribute("onclick", removewishlist_e);
	  
	  if(cartRemoveAttribute.contains("remove")){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Heart changed color from white to Red");
		  
	  }else{
		  Assert.fail("Heart did not change color from white to Red");
	  }
	  
	  util.clickByXpath(removewishlist_e);
	  Thread.sleep(5000);
	  util.mousehover(addtowishlist);
	  cardAddAttribute = util.getAttribute("onclick", addtowishlist);
	  
	  if(cardAddAttribute.contains("add")){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Heart changed color from Red to White on clicking second time");
	  }else{
		  Assert.fail("Heart changed color from Red to White on clicking second time");
	  }
	  
	  removeCountMeinKonto = util.getText(wishlistcounter_e);
	  removeCount = Integer.parseInt(removeCountMeinKonto);
	  if(removeCount==beforCountOne){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Count decreased by one after removing product from wishlist");  
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Count is same even after removing product from wishlist");  
	  }
	  
  }
}
