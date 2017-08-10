package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import applicationUtility.HomePage;
import applicationUtility.RegistrationLogin;

import com.relevantcodes.extentreports.LogStatus;

import Utility.Base;
import Utility.ExtentTestManager;
import Utility.util;

public class MyAccount12398_02 extends Base{

	
  @Test (groups = {"Sanity","Regression"} , enabled=true)
  public void CreateAccount() {
	  
	  String actualIhrKundenbereich =null;
	  String expectedIhrKundenbereich = "Ihr Kundenbereich";
	  String actualUserName = null;
	  boolean usernameCheck = false;
	  String emailId = util.getTestData("email")+util.getRandomNumberInRange(11, 99999)+"@mailinator.com";
	  System.out.println(emailId);
	  
	  util.clickByXpath(Mein_konto_e);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on mein konto on home page header");
	  
	  RegistrationLogin.enterVorname(util.getTestData("firstName"));
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Entered vorname");
	  
	  RegistrationLogin.enterNachname(util.getTestData("lastName"));
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Entered nachname");
	  
	  RegistrationLogin.enterEmailAdresse(emailId);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Entered email Adresse");
	  
	  RegistrationLogin.enterIhrPasswort(util.getTestData("password"));
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Entered ihr Passwort");
	  
	  RegistrationLogin.clickWeiter();
	  ExtentTestManager.getTest().log(LogStatus.INFO, "clicked weiter");
	  
	  actualIhrKundenbereich = RegistrationLogin.getTextIhrKundenbereich();
	  Assert.assertEquals(actualIhrKundenbereich, expectedIhrKundenbereich);
	  ExtentTestManager.getTest().log(LogStatus.PASS, "After registration user landed on Profile page");
	  
	  actualUserName = HomePage.getUsername();
	  if(actualUserName.contains(util.getTestData("firstName"))){
		  usernameCheck = true;
		  Assert.assertTrue(usernameCheck);
	  }else{
		  Assert.fail("Username is either incorrect or not showing after registration");
	  }
	  
  }
  
  
  @Test (groups = {"Regression"})
  public void Registration_MandatoryFieldsCheck(){
	  
	  String actualIhrKundenbereich =null;
	  String expectedIhrKundenbereich = "Anmeldung";
	  
	  
	  HomePage.clickMeinKonto();
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on mein konto on home page header");
	 
	  RegistrationLogin.enterVorname(util.getTestData("firstName"));
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Entered vorname");
	  
	  RegistrationLogin.enterNachname(util.getTestData("lastName"));
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Entered nachname");
	  
	  RegistrationLogin.enterEmailAdresse(util.getTestData("email"));
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Entered email Adresse");
	  
	  RegistrationLogin.clickWeiter();
	  ExtentTestManager.getTest().log(LogStatus.INFO, "clicked weiter");
	  
	  actualIhrKundenbereich = RegistrationLogin.getTextIhrKundenbereich();
	  Assert.assertEquals(actualIhrKundenbereich, expectedIhrKundenbereich);
	  ExtentTestManager.getTest().log(LogStatus.PASS, "Password is mandorty");
	  /********************password test completed*****************************/
	  
	  RegistrationLogin.clearEmail();
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Email removed");
	  
	  RegistrationLogin.enterIhrPasswort(util.getTestData("password"));
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Entered ihr Passwort");
	  
	  RegistrationLogin.clickWeiter();
	  ExtentTestManager.getTest().log(LogStatus.INFO, "clicked weiter");
	  
	  actualIhrKundenbereich = RegistrationLogin.getTextIhrKundenbereich();
	  Assert.assertEquals(actualIhrKundenbereich, expectedIhrKundenbereich);
	  ExtentTestManager.getTest().log(LogStatus.PASS, "Email is mandorty");
	  
	  /********************Email test completed*****************************/
	  
	  RegistrationLogin.clearVorname();
	  ExtentTestManager.getTest().log(LogStatus.INFO, "FirstName removed");
	  
	  RegistrationLogin.enterEmailAdresse(util.getTestData("email"));
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Entered email Adresse");
	  
	  RegistrationLogin.clickWeiter();
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked weiter");
	  
	  actualIhrKundenbereich = RegistrationLogin.getTextIhrKundenbereich();
	  Assert.assertEquals(actualIhrKundenbereich, expectedIhrKundenbereich);
	  ExtentTestManager.getTest().log(LogStatus.PASS, "FirstName is mandorty");
	  
	  /********************FirstName test completed*****************************/
	  
	  RegistrationLogin.clearNachname();
	  ExtentTestManager.getTest().log(LogStatus.INFO, "LastName removed");
	  
	  RegistrationLogin.enterVorname(util.getTestData("firstName"));
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Entered vorname");
	  
	  RegistrationLogin.clickWeiter();
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked weiter");
	  
	  actualIhrKundenbereich = RegistrationLogin.getTextIhrKundenbereich();
	  Assert.assertEquals(actualIhrKundenbereich, expectedIhrKundenbereich);
	  ExtentTestManager.getTest().log(LogStatus.PASS, "LastName is mandorty");
	  
	  /********************LastName test completed*****************************/
	  
	  
  }
  
}
