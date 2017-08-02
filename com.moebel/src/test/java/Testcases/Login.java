package Testcases;

import org.testng.annotations.Test;
import utilitypart1.baseclass;
import PageObjects.Homepage;
import PageObjects.login;
import utilitypart1.ExtentTestManager;
import utilitypart1.util;

import com.relevantcodes.extentreports.LogStatus;

public class Login extends baseclass  {

	@Test
	  public static void loginTest() {
		  
		  String actualTextLogin = null;
		  
	

		  util.clickevent(Homepage.meinprofile);
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on meinprofile.");
		  
		 try {
			Thread.sleep(5000);
		   } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    }
		  util.clickevent(Homepage.anmelden);
		  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on anmelden link.");
		  try {
				Thread.sleep(5000);
			   } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			    }
		  
		  login.enterLogin(util.gettestdata("loginEmail"), util.gettestdata("loginPassword"));
		  util.clickevent(Homepage.meinprofile);
		  actualTextLogin = util.getText(Homepage.userprofile);
		  System.out.println(actualTextLogin);
		  if(actualTextLogin.equalsIgnoreCase(util.gettestdata("loginVerify"))){
			  ExtentTestManager.getTest().log(LogStatus.PASS, "logged in successfully."); 
		  }else{
			  ExtentTestManager.getTest().log(LogStatus.FAIL, "Login failed.");
		  }
 
	}
}
