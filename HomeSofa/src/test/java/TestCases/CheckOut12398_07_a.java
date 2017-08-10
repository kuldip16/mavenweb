package TestCases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import applicationUtility.appFunctions;

import Utility.Base;
import Utility.ExtentTestManager;
import Utility.util;

public class CheckOut12398_07_a extends Base{
	
  @Test   (groups = {"Regression"})
  public void verifyCheckoutArrowsFunctions() throws InterruptedException {
	  String stepStatus = null;
	  String stepStatusAnother = null;
	  String red = "current";
	  String grey = "todo";
	  String green = "done";
	  
	  
	  appFunctions.navigateToProductDetailPage(util.getTestData("loginEmailCheckout"),util.getTestData("loginPasswordCheckout")); 
	 
	  util.clickByXpath(addtocart_e);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on add to cart.");
	  
	  Thread.sleep(4000);
	  
	  util.clickByXpath(closeCheckout);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Closed chekout alert window");
	  
	  Thread.sleep(3000);
	  util.clickByXpath(Warenkorb_e);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Moved to cart page");
	  
	  stepStatus = util.getAttribute("class", step1Cart);
	  if(stepStatus.contains(red))
	  {
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Current step color is red.");  
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Current step color is not red.");
	  }
	  
	  stepStatus = util.getAttribute("class", step2Cart);
	  stepStatusAnother = util.getAttribute("class", step3Cart);
	  if(stepStatus.contains(grey) && stepStatusAnother.contains(grey))
	  {
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Following steps color is grey.");  
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Following steps color is not grey.");
	  }
	  
	  util.clickByXpath(weiterCart);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on continue on step 1 of checkout process on cart page.");
	  
	  stepStatus = util.getAttribute("class", step2Cart);
	  stepStatusAnother = util.getAttribute("class", step3Cart);
	  if(stepStatus.contains(green) && stepStatusAnother.contains(red))
	  {
		  ExtentTestManager.getTest().log(LogStatus.PASS, "previous steps turned to green and now step 3 is red.");  
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "On Moving forward from step 1 , color coding of steps is incorrect.");
	  }
	  
  }
}
