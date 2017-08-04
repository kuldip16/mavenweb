package Testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


import PageObjects.Homepage;
import PageObjects.login;
import UtilityMobile.BaseMobile;
import UtilityMobile.ExtentTestManager;
import UtilityMobile.utilMobile;

import com.relevantcodes.extentreports.LogStatus;

public class Login extends BaseMobile  {

	@Test
	  public static void loginTest() {
		  
		  String actualTextLogin = null;
		  utilMobile.wait(1000);
		  //utilMobile.clickevent(Homepage.popup);
		  utilMobile.clickIDevent("test");
		  ExtentTestManager.getTest().log(LogStatus.INFO, "Popup closed");
		  driver.navigate().refresh();
		  utilMobile.wait(1000);
		 
         utilMobile.clickevent(Homepage.meinprofile);
		  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on meinprofile.");
		  
		   utilMobile.wait(3000);
		  utilMobile.clickevent(Homepage.anmelden);
		  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on anmelden link.");
		  utilMobile.wait(3000);
		  login.login(utilMobile.getTestData("loginEmail"), utilMobile.getTestData("loginPassword"));
		  utilMobile.clickevent(Homepage.meinprofile);
		  actualTextLogin = utilMobile.getText(Homepage.userprofile);
		 System.out.println(actualTextLogin);
		
		  if(actualTextLogin.equalsIgnoreCase(utilMobile.getTestData("loginVerify"))){
			  ExtentTestManager.getTest().log(LogStatus.PASS, "logged in successfully."); 
		  }else{
			  ExtentTestManager.getTest().log(LogStatus.FAIL, "Login failed.");
		  }  
		  
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
