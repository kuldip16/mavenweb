package TestCases;

import java.awt.AWTException;

import junit.framework.Assert;

import org.testng.annotations.Test;

import PageObjects.ChangePassword_Signout_Module;
import PageObjects.Fabric_Module;
import Utility.Base;
import Utility.ExtentTestManager;

import com.relevantcodes.extentreports.LogStatus;

public class FabricSampleFunction extends Base {

	@Test (enabled = true)
	public void FabricSampleFunction() throws InterruptedException, AWTException{
		ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that fabric window is working properly or not");
		boolean getstatus = Fabric_Module.fabricmodule();
		Assert.assertTrue(getstatus);
	}
	
}
