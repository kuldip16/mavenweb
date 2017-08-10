package TestCases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utility.Base;
import Utility.ExtentTestManager;
import Utility.util;
import applicationUtility.appFunctions;

import com.relevantcodes.extentreports.LogStatus;

public class CheckOut12398_07_e extends Base {
	
  @Test
  public void verifyPaymentPage() throws InterruptedException {
	  boolean status =false;
	  boolean status2 =true;
	  
	  List<WebElement> paymentMethods = new ArrayList<WebElement>();
	  
      appFunctions.completeShippingProcess(util.getTestData("loginEmailCheckout"),util.getTestData("loginPasswordCheckout"));
	  
	  util.clickByXpath(weiterCart);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on continue on step 1 of checkout process on cart page.");
	  
	  util.clickByXpath(checkBoxTerms);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on terms and conditions checkbox.");
	  
	  util.clickByXpath(finalSubmit);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on final submit button at step 3.");
	  
	  Thread.sleep(3000);
	 // util.scrollTo();
	  util.switchToIframe(kalrnaIframe);
	  Thread.sleep(4000); 
	  paymentMethods = util.getElements(paymentModes);
	  
	  for(WebElement we:paymentMethods){
		  String singlePaymentName = we.getText();
		  if(singlePaymentName.equalsIgnoreCase(util.getTestData("mode1"))
				  || singlePaymentName.equalsIgnoreCase(util.getTestData("mode2"))
				  || singlePaymentName.equalsIgnoreCase(util.getTestData("mode3"))
				  || singlePaymentName.equalsIgnoreCase(util.getTestData("mode4"))
				  || singlePaymentName.equalsIgnoreCase(util.getTestData("mode5"))
				  || singlePaymentName.equalsIgnoreCase(util.getTestData("mode6"))
				  || singlePaymentName.equalsIgnoreCase(util.getTestData("mode7"))){
			  
			  status = true;
			  ExtentTestManager.getTest().log(LogStatus.INFO, "Payment method: "+singlePaymentName+" is present.");
		  }else{
			  status2=false;
			  ExtentTestManager.getTest().log(LogStatus.ERROR, "Payment method: "+singlePaymentName+" is missing."); 
		  }
	  }
	  
	  if(status){
		  if(status2)
		  {ExtentTestManager.getTest().log(LogStatus.PASS, "All Payment methods are present.");  
		  }else{
		   ExtentTestManager.getTest().log(LogStatus.PASS, "Rest of the Payment methods are present.");
		  }
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Some Payment methods are missing.");
	  }
	  
  }
}
