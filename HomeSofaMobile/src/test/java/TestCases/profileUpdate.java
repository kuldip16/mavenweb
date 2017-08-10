package TestCases;

import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LeftNavigationMenu;
import PageObjects.MeinKonto;
import UtilityMobile.BaseMobile;
import UtilityMobile.ExtentTestManager;
import UtilityMobile.utilMobile;
import com.relevantcodes.extentreports.LogStatus;

public class profileUpdate extends BaseMobile {
	
  @Test
  public void updateProfile() {
	  String actualMessage =null;
	  String actualUpdatedPhoneVal = null;
	  String expectedPhoneVal = utilMobile.getText("telefon");
	  String actualUpdatedCityVal = null;
	  String expectedCityVal = utilMobile.getText("updatedAddressVal");
	  String actualFirstNameVal = null;
	  String actualLastNameVal = null;
	  String expectedFirstName = utilMobile.getText("profileUpdateFName");
	  String expectedLastName = utilMobile.getText("profileUpdateLName");
	  boolean updateMessage=false;
	  boolean updatePhone = false;
	  boolean updateCity= false;
	  boolean nameUpdate=false;
	  
	  utilMobile.clickevent(HomePage.menu);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on left navigation menu.");
	  
	  utilMobile.clickevent(LeftNavigationMenu.loginLink);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on login link.");
	  
	  LeftNavigationMenu.login(utilMobile.getTestData("profileUpdateLogin"), utilMobile.getTestData("profileUpdateCurrentPassword"));
	  
	  utilMobile.clickevent(MeinKonto.personalInfoXpath);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on personal information link.");
	  
	  MeinKonto.enterProfileDetails();
	  
	  actualMessage = utilMobile.getText(MeinKonto.successOnUpdateProfileXpath);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Extracted success message.");
	  
	  if(utilMobile.getTestData("expectedTextOnUpdateProfile").equalsIgnoreCase(actualMessage)){
		  updateMessage=true;
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.ERROR, "Success message either incorrect or not displaying.");
	  }
	  
	  utilMobile.clickevent(MeinKonto.backToProfileOverviewXpath);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Navigated back profile overvie page(Mein konto).");
	  
	  utilMobile.clickevent(MeinKonto.personalInfoXpath);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on personal information link.");
	  
	  actualUpdatedPhoneVal = utilMobile.getText(MeinKonto.phoneXpath);
	  
	  if(expectedPhoneVal.equalsIgnoreCase(actualUpdatedPhoneVal)){
		  updatePhone=true;
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.ERROR, "Phone number didn't update.");
	  }
	  
	  actualUpdatedCityVal = utilMobile.getText(MeinKonto.cityXpath);
	  
	  if(expectedCityVal.equalsIgnoreCase(actualUpdatedCityVal)){
		  updateCity=true;
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.ERROR, "Phone number didn't update.");
	  }
	  
	  
	  actualFirstNameVal = utilMobile.getText(MeinKonto.firstNameXpath);
	  actualLastNameVal = utilMobile.getText(MeinKonto.lastNameXpath);
	  
	  if( (expectedFirstName.equalsIgnoreCase(actualFirstNameVal)) && ( expectedLastName.equalsIgnoreCase(actualLastNameVal) )){
		  nameUpdate = true;
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.ERROR, "firstName and lastName didn't update.");
	  }
	  
	  
	  if(updateMessage && updatePhone && updateCity && nameUpdate){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Details like Name,phone and address successfully updated.");
	  }
  }
  
  
  @Test (dependsOnMethods = {"updateProfile"})
  public void updateProfileBlockerCheck(){
	  String loginCheck  = null;
	  utilMobile.clickevent(HomePage.menu);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on left navigation menu.");
	  
	  utilMobile.clickevent(LeftNavigationMenu.loginLink);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on login link.");
	  
	  LeftNavigationMenu.login(utilMobile.getTestData("profileUpdateEmail"), utilMobile.getTestData("profileUpdateNewPassword"));
	  
	  loginCheck = utilMobile.getText(MeinKonto.meinKonto);
	  
	  if(loginCheck.equalsIgnoreCase(utilMobile.getTestData("loginVerify"))){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Email and password updated successfully."); 
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Email or password didn't update.");
	  }
	    
  }
  
}
