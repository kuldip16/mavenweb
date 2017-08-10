package TestCases;

import java.awt.AWTException;

import junit.framework.Assert;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.Fabric_Module;
import PageObjects.ModalCartWindow_Module;
import Utility.Base;
import Utility.ExtentTestManager;

public class ModalCartWindow_12398_03 extends Base {
	
	@Test (enabled = true)
	public void CartModalFunction() throws InterruptedException, AWTException{
		ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that cart window is working properly or not");
		boolean getstatus = ModalCartWindow_Module.cartwindow();
		Assert.assertTrue(getstatus);
	}

}
