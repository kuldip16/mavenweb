package TestCases;

import junit.framework.Assert;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.ChangePassword_Signout_Module;
import Utility.Base;
import Utility.ExtentTestManager;

public class ChangePassword_12398_11 extends Base{
	
	@Test (enabled = true)
	public void change_password_validation() throws InterruptedException{
		ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that on entering different New Password and Confirm Password then it validation is proper or not");
				boolean getstatus = ChangePassword_Signout_Module.changepassword("validpasswrd", "changepassword", newpasswordnotmatch_e);
		Assert.assertTrue(getstatus);
	}
	
	@Test (enabled = true)
	public void change_password_update() throws InterruptedException{
		ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that on entering same New Password and Confirm Password then password is updating or not");
		boolean getstatus = ChangePassword_Signout_Module.changepassword("validpasswrd", "validpasswrd", PersonalInfoUpdateMsg_e);
		Assert.assertTrue(getstatus);
	}
	
}
