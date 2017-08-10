package TestCases;

import org.testng.annotations.Test;

import Utility.Base;
import Utility.ExtentTestManager;
import Utility.util;

import applicationUtility.appFunctions;

import com.relevantcodes.extentreports.LogStatus;

public class MyAccount12398_02_g extends Base {
	
  @Test (groups = {"Regression"})
  public void verifyBestellungen() {
	  
	  String actualText = null;
	  String expectedText = "Sie haben noch keine Bestellung aufgegeben";
	  
	  util.clickByXpath(Mein_konto_e);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on mein konto on home page header");
	  
	  appFunctions.login(util.getTestData("loginEmail"), util.getTestData("loginPassword"));
	  ExtentTestManager.getTest().log(LogStatus.INFO, "logged in");
	  
	  util.mousehover(MeinKontoAfterLogin);
	  util.clickByXpath(order_e);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on mein konto on home page header");
	  
	  actualText = util.getText(emptyOrderParagraph);
	  
	  if(actualText.equalsIgnoreCase(expectedText)){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Orders list is empty and showing correct message.");
		  
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Orders list is showing incorrect message.");
	  }
	  
	  
	  
	  
  }
}
