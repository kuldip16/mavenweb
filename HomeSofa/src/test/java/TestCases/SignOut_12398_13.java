package TestCases;

import java.awt.AWTException;

import junit.framework.Assert;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.ChangePassword_Signout_Module;
import Utility.Base;
import Utility.ExtentTestManager;

public class SignOut_12398_13 extends Base {

	@Test (enabled = true)
	public void test3rdMethod() throws InterruptedException, AWTException{
		ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that user is successfully login and logout successfully or not");
		boolean getstatus = ChangePassword_Signout_Module.signout();
		Assert.assertTrue(getstatus);
	}
}
