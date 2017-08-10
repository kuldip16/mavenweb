package TestCases;

import org.testng.annotations.Test;

import Utility.Base;
import Utility.ExtentTestManager;
import Utility.util;
import applicationUtility.appFunctions;

import com.relevantcodes.extentreports.LogStatus;

public class MyAccount12398_02_f extends Base {
	
  @Test (groups = {"Regression"})
  public void verifyPersonalInformation() {
	  
	  String actualNachname = null;
	  String actualVorname = null;
	  String actualEmail = null;
	  String expectedProfileHeading = "Ihre persönlichen Daten & Adresse";
	  String actualProfileHeading = null;
	  String actualErrorMsg = null;
	  String expectedErrorMsg = "Ungültiges Geburtsdatum.";
	  boolean updateStatus = false;
	  
	  util.clickByXpath(Mein_konto_e);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on mein konto on home page header");
	  
	  appFunctions.login(util.getTestData("loginEmail"), util.getTestData("loginPassword"));
	  ExtentTestManager.getTest().log(LogStatus.INFO, "logged in");
	  
	  util.clickByXpath(personDaten);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Navigated to profile page");
	  
	  actualProfileHeading = util.getText(profilePageHeading);
	  
	  if(actualProfileHeading.contains(expectedProfileHeading)){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "User has landed on profile page"); 
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "User has landed on some other page instead of profile page");
	  }
	  
	  actualVorname = util.getAttribute("value", profileVorname);
	  actualNachname = util.getAttribute("value", profileNachname);
	  actualEmail = util.getAttribute("value", profileEmail);
	  if(actualVorname.equalsIgnoreCase(util.getTestData("loginName"))&& actualNachname.equalsIgnoreCase(util.getTestData("loginLastName")) && actualEmail.equalsIgnoreCase(util.getTestData("loginEmail"))){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Profile details are correct."); 
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Incorrect profile details.");
	  }
	  
	  appFunctions.enterProfileDetails();
	  
	  actualErrorMsg = util.getText(profileErrorMsg);
	  if(actualErrorMsg.equalsIgnoreCase(expectedErrorMsg)){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Mandatory fields check is working fine"); 
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Mandatory fields check is not working.");
	  }
	  

  	 util.selectdropdownvalue(DOB_day_e, util.getTestData("day"));
  	 util.selectdropdownvalue(DOB_month_e, util.getTestData("month"));
  	 util.selectdropdownvalue(DOB_year_e, util.getTestData("year"));
	
  	 util.enterText(util.getTestData("telefon"), derzeitigesPasswort);
	 ExtentTestManager.getTest().log(LogStatus.INFO, "Entered current password.");
	  
	 util.clickByXpath(profileSubmit);
	 ExtentTestManager.getTest().log(LogStatus.INFO, "clicked on submit");  
	  
	 updateStatus = util.elementPresentOrNot(PersonalInfoUpdateMsg_e);
	 
	 if(updateStatus){
		 ExtentTestManager.getTest().log(LogStatus.PASS, "Profile updated successfully."); 
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Profile is not getting updated.");
	  }
  }
}
