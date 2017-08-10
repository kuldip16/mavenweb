package TestCases;

import org.testng.annotations.Test;

import applicationUtility.appFunctions;

import com.relevantcodes.extentreports.LogStatus;

import Utility.Base;
import Utility.ExtentTestManager;
import Utility.util;

public class CheckOut12398_07_c extends Base{
	
  @Test
  public void verifyProductPriceForMultipleCount() throws InterruptedException {
	
	  String productPriceVal = null;
	  appFunctions.navigateToProductDetailPage(util.getTestData("loginEmailCheckout"),util.getTestData("loginPasswordCheckout"));
	  productPriceVal = util.getText(price_adp_e);
	  util.clickByXpath(addtocart_e);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on add to cart.");
	  
	  Thread.sleep(4000);
	  
	  appFunctions.verifyShippingCost(priceText,productPriceVal);
        
  }
}
