
package TestCases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import applicationUtility.appFunctions;

import Utility.Base;
import Utility.ExtentTestManager;
import Utility.util;

public class CheckOut12398_07_b extends Base {
	
  @Test
  public void verifyEditDeliveryBillingAddress() throws InterruptedException {
	  String actualPlaceHouse = null;
	  String actualCity = null; 
	  
	  appFunctions.completeShippingProcess(util.getTestData("loginEmailCheckout"),util.getTestData("loginPasswordCheckout"));
	  
	  util.clickByXpath(weiterCart);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on continue on step 1 of checkout process on cart page.");
	  
	  util.clickByXpath(changeDeliveryAddress);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on change delivery address.");
	  
	  appFunctions.updateAddress();
	  
	  actualPlaceHouse = util.getText(deliveryPlaceHouse);
	  actualCity = util.getText(deliveryCity);
	  
	  if(actualPlaceHouse.contains(util.getTestData("newStrafze")) && actualPlaceHouse.contains(util.getTestData("newHouse"))
		  && actualCity.contains(util.getTestData("newPlz")) && actualCity.contains(util.getTestData("newArea")) ){
		  
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Delivery address successfully updated.");
		  
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Delivery address didn't update.");
	  }
	  
	  util.clickByXpath(changeBillingAddress);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on change billing address.");
	  
	  appFunctions.updateAddress();
	  
	  actualPlaceHouse = util.getText(billingPlaceHouse);
	  actualCity = util.getText(billingCity);
	  
	  if(actualPlaceHouse.contains(util.getTestData("newStrafze")) && actualPlaceHouse.contains(util.getTestData("newHouse"))
			  && actualCity.contains(util.getTestData("newPlz")) && actualCity.contains(util.getTestData("newArea")) ){
			  
			  ExtentTestManager.getTest().log(LogStatus.PASS, "Billing address successfully updated.");
			  
		  }else{
			  ExtentTestManager.getTest().log(LogStatus.FAIL, "Billing address didn't update.");
		  }
	  
	  
  }
}
