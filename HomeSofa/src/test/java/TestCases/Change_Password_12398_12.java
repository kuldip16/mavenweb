package TestCases;

import junit.framework.Assert;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.ChangePassword_Signout_Module;
import Utility.Base;
import Utility.ExtentTestManager;
import Utility.util;

public class Change_Password_12398_12 extends Base{
	
	@Test 
	public void testmethod(){
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "Verifying the forgot password page is open or not");
		ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that on entering invalid email address page submits or not");
		boolean getstatus = ChangePassword_Signout_Module.forgotpasword_incorrectemail(util.getTestData("validemailchangepassword"),successemailvalidationmsg_e);
		Assert.assertTrue(getstatus);
	}

	@Test 
	public void test2ndmethod(){
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "Verifying the forgot password page is open or not");
		ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that on entering valid email address page submits or not");
		boolean getstatus = ChangePassword_Signout_Module.forgotpasword_incorrectemail(util.getTestData("invalidemailid"),wrongemailvalidationmsg_e);
		Assert.assertTrue(getstatus);
	}
	

}
