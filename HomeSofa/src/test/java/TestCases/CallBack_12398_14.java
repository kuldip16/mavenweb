package TestCases;

import java.awt.AWTException;
import java.text.ParseException;

import junit.framework.Assert;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.CallBack_Module;

import Utility.Base;
import Utility.ExtentTestManager;

public class CallBack_12398_14 extends Base{
	
	@Test (enabled = true)
	public void CallBack_Function() throws InterruptedException, ParseException, AWTException{
		ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that cart window is working properly or not");
		boolean getstatus = CallBack_Module.callback();
		Assert.assertTrue(getstatus);
	}

}
