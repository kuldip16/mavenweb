package TestCases;

import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utility.Base;
import Utility.ExtentTestManager;
import Utility.util;
import applicationUtility.appFunctions;

import com.relevantcodes.extentreports.LogStatus;

public class CheckOut12398_07 extends Base {
	
  @Test (groups = {"Regression"})
  public void verifyCheckOutwithLogin_ShippingPage() throws InterruptedException {
	  
	  String deliveryAddressHeading = util.getTestData("deliveryAddressHeading");
	  String billingAddressHeading = util.getTestData("billingAddressHeading");
	  String delivery = util.getTestData("delivery");
	  
      List<WebElement> addressHeadings = new ArrayList<WebElement>();
      
	  appFunctions.completeShippingProcess(util.getTestData("loginEmailCheckout"),util.getTestData("loginPasswordCheckout"));
	  
	  util.clickByXpath(weiterCart);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on continue on step 1 of checkout process on cart page.");
	  
	  addressHeadings = util.getElements(step3AddressHeadings);
	  ExtentTestManager.getTest().log(LogStatus.PASS,"For logged in user , checkout from step 1 directly takes him to step 3.");
	  
	  for(WebElement actualHeadings: addressHeadings ){
		  String verifyText =  actualHeadings.getText();
		  if(verifyText.equalsIgnoreCase(deliveryAddressHeading) || verifyText.equalsIgnoreCase(billingAddressHeading) || verifyText.equalsIgnoreCase(delivery)){
			  ExtentTestManager.getTest().log(LogStatus.PASS, "Step 3 of checkout process is divided into: "+verifyText);  
			  
			  
		  }else{
			  ExtentTestManager.getTest().log(LogStatus.FAIL,"Step 3 of product checkout has a section missing");
		  }
	  }
	  
	  
	  
  }
}
