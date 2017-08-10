package PageObjects;

import com.relevantcodes.extentreports.LogStatus;

import UtilityMobile.ExtentTestManager;
import UtilityMobile.BaseMobile;
import UtilityMobile.utilMobile;

public class MeinKonto extends BaseMobile {
	
	public static String meinKonto = "//*[@id='info-heading']";
	public static String logOut = "//*[@id='singoffcustomer']";
	public static String personalInfoXpath = "//span[text()='Ihre persönlichen Daten']";
	
	/*******************Profile update*************************************************/
	 public static String herrXpath = "//label[text()='Herr']";
	 public static String firstNameXpath = ".//*[@id='firstname']";
	 public static String lastNameXpath = ".//*[@id='lastname']";
	 public static String dobDateXpath = "//*[@id='days']";
	 public static String dobMonthXpath = "//*[@id='months']";
	 public static String dobYearXpath = "//*[@id='years']";
	 public static String strafzeXpath = "//*[@id='address1']";
	 public static String strafzeValXpath = "//div[@class='pac-item'][1]";
	 public static String phoneXpath = "//*[@id='phone']";
	 public static String cityXpath = "//*[@id='city']";
	 public static String oldPasswordXpath = "//*[@id='old_passwd']";
	 public static String confirmPasswordXpath = "//*[@id='confirmation']";
	 public static String submitAddressXpath = "//*[@id='submitAddress']";
	 public static String successOnUpdateProfileXpath = "//p[@class='alert alert-success']";
	 public static String backToProfileOverviewXpath = "//a[text()='Zurück zur Account Übersicht']";
	 
	 
	 
	 
	 public static void enterProfileDetails(){
		 
		 try{
   	      utilMobile.clickByXpath(herrXpath);
   		  ExtentTestManager.getTest().log(LogStatus.INFO, "Selected Herr.");
   		  
   		  utilMobile.clearText(firstNameXpath);
		  utilMobile.enterText(utilMobile.getTestData("profileUpdateFName"), firstNameXpath);
		  ExtentTestManager.getTest().log(LogStatus.INFO, "Entered FirstName.");
		  
		  utilMobile.clearText(lastNameXpath);
		  utilMobile.enterText(utilMobile.getTestData("profileUpdateFName"), lastNameXpath);
		  ExtentTestManager.getTest().log(LogStatus.INFO, "Entered LastName.");
   		  
   		  utilMobile.clearText(LeftNavigationMenu.email);
  		  utilMobile.enterText(utilMobile.getTestData("profileUpdateEmail"), LeftNavigationMenu.email);
  		  ExtentTestManager.getTest().log(LogStatus.INFO, "Entered email.");
   		  
  		  
   		  utilMobile.selectDropDownValue(utilMobile.getTestData("day"), dobDateXpath);
   		  ExtentTestManager.getTest().log(LogStatus.INFO, "Entered date.");
   		  
   		  utilMobile.selectDropDownValue(utilMobile.getTestData("month"), dobMonthXpath);
 		  ExtentTestManager.getTest().log(LogStatus.INFO, "Entered month.");
 		  
 		  utilMobile.selectDropDownValue(utilMobile.getTestData("year"), dobYearXpath);
		  ExtentTestManager.getTest().log(LogStatus.INFO, "Entered year.");
 		  
   		  utilMobile.clearText(strafzeXpath);
   		  Thread.sleep(3000);
   		  utilMobile.enterText(utilMobile.getTestData("strafze"), strafzeXpath);
   		  Thread.sleep(4000);
   		  utilMobile.clickByXpath(strafzeValXpath);
   		  ExtentTestManager.getTest().log(LogStatus.INFO, "Entered strafze.");
   		  
   		  utilMobile.clearText(phoneXpath);
   		  utilMobile.enterText(utilMobile.getTestData("telefon"), phoneXpath);
   		  ExtentTestManager.getTest().log(LogStatus.INFO, "Entered telefon.");
   		  
   		  utilMobile.enterText(utilMobile.getTestData("profileUpdateCurrentPassword"), oldPasswordXpath);
   		  ExtentTestManager.getTest().log(LogStatus.INFO, "Entered current password.");
   		  
   		  utilMobile.enterText(utilMobile.getTestData("profileUpdateNewPassword"), LeftNavigationMenu.password);
 		  ExtentTestManager.getTest().log(LogStatus.INFO, "Entered new password.");
 		  
 		  utilMobile.enterText(utilMobile.getTestData("profileUpdateNewPassword"), confirmPasswordXpath);
  		  ExtentTestManager.getTest().log(LogStatus.INFO, "Entered confirmation password value.");
   		  
   		  utilMobile.clickByXpath(submitAddressXpath);
   		  ExtentTestManager.getTest().log(LogStatus.INFO, "clicked on submit");
   	   }catch(Exception e){
   		   
   	   }
	 }

}
