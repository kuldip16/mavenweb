package TestCases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import applicationUtility.appFunctions;

import com.relevantcodes.extentreports.LogStatus;

import Utility.Base;
import Utility.ExtentTestManager;
import Utility.util;

public class CheckOut12398_07_d extends Base {
	
  @Test
  public void verifySummary() throws InterruptedException {
	  String emailUrl = "https://www.mailinator.com/";
	  List<WebElement> ls = new ArrayList<WebElement>();
	  int initialCount;
	  int afterCount;
	  String finalValue = null;
	  String finalValueEmail = null;
	  
	  driver.navigate().to(emailUrl);
	  util.enterText(util.getTestData("loginEmailCheckout"), emailField);
	  util.clickByXpath(submitMailinator);
	  
	  ls = util.getElements(emails);
	  initialCount = ls.size();
	  
	  driver.navigate().to(util.getConfigValue("appUrl"));
      appFunctions.completeShippingProcess(util.getTestData("loginEmailCheckout"),util.getTestData("loginPasswordCheckout"));
	  
	  util.clickByXpath(weiterCart);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on continue on step 1 of checkout process on cart page.");
	  
	  util.clickByXpath(checkBoxTerms);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on terms and conditions checkbox.");
	  
	  util.clickByXpath(finalSubmit);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on final submit button at step 3.");
	  
	  Thread.sleep(6000);
	  util.switchToIframe(kalrnaIframe);
	  Thread.sleep(5000);
	  
	  util.clickByXpath(paymentByNachname);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Selected paymenmt by Cash.");
	  
	  finalValue = util.getText(finalAmount);
	  finalValue = util.replaceChar(finalValue,".", " ");
	  
	  util.clickByXpath(buyButton);
	  driver.switchTo().defaultContent();
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on buy button.");
	  Thread.sleep(4000); 
	  
	  driver.navigate().to(emailUrl);
	  util.enterText(util.getTestData("loginEmailCheckout"), emailField);
	  util.clickByXpath(submitMailinator);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "logged into email.");
	  Thread.sleep(5000); 
	  
	  ls = util.getElements(emails);
	  afterCount = ls.size();
	  
	  if(afterCount==(initialCount + 1)){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Recieved email for order summary."); 
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Didn't recieve email for order summary.");
	  }
	  
	  util.clickByXpath(inboxEmail);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on summary email");
	  
	  util.switchToIframe(inboxFrame);
	  
	  finalValueEmail = util.getText(pricaValueEmail);
	  
	  if(finalValue.equalsIgnoreCase(finalValueEmail)){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Price value shown in email is correct.");
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Price value shown in email is different then what it was displayed on buy page.");
	  }
	  
	  
  }
}
