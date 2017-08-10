package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import applicationUtility.HomePage;
import applicationUtility.RegistrationLogin;

import com.relevantcodes.extentreports.LogStatus;

import Utility.Base;
import Utility.ExtentTestManager;
import Utility.util;

public class MyAccount12398_02_a extends Base {
	
  @Test (groups = {"Sanity","Regression"})
  public void loginTest() {
	  
	  String actualUserName = null;
	  boolean usernameCheck = false;
	  
	  HomePage.clickMeinKonto();
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on mein konto on home page header");
	  
	  RegistrationLogin.enterLoginEmail(util.getTestData("loginEmail"));
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Entered login email");
	  
	  RegistrationLogin.enterLoginPassword(util.getTestData("loginPassword"));
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Entered login password");
	  
	  RegistrationLogin.loginSubmit();
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on submit"); 
	  
	  actualUserName = util.getText(MeinKontoAfterLogin);
	  if(actualUserName.contains(util.getTestData("loginName"))){
		  usernameCheck = true;
		  Assert.assertTrue(usernameCheck);
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Login successful.");
	  }else{
		  Assert.fail("Username not showing after login");
	  }
	  
	  
  }
   
  
  @Test (groups = {"Sanity","Regression"})
  public void loginBlockercheck(){
	  String expectedIhrKundenbereich = "Anmeldung";
	  String actualIhrKundenbereich = null;
	  boolean loginCheck = false;
	  
	  HomePage.clickMeinKonto();
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on mein konto on home page header");
	  
	  RegistrationLogin.enterLoginEmail(util.getTestData("loginEmail"));
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Entered login email");
	  
	  RegistrationLogin.loginSubmit();
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on submit");
	  
	  actualIhrKundenbereich = RegistrationLogin.getTextIhrKundenbereich();
	  
	  if(actualIhrKundenbereich.equalsIgnoreCase(expectedIhrKundenbereich)){
		  loginCheck = true;
		  Assert.assertTrue(loginCheck);
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Cannot login without password");
	  }else{
		  Assert.fail("Able to login without password");
	  }
	  
	  
  }
}
