package TestCases;

import org.testng.annotations.Test;
import org.testng.Assert;
//import org.testng.AssertJUnit;
import java.awt.AWTException;
import java.io.IOException;
import java.text.ParseException;

import org.apache.http.client.ClientProtocolException;
//import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

//import PageObjects.CallBack_Module;
//import PageObjects.CartPageModule;
import PageObjects.Homepage_Testcase;
import Utility.Base;
import Utility.ExtentTestManager;

public class Homepage_12398_1 extends Base{

	@Test (enabled = true)
	public void Homepage() throws InterruptedException, ParseException, AWTException, ClientProtocolException, IOException{
		ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that cart page functionality is working properly or not");
		boolean getstatus = Homepage_Testcase.TestHomepage();
		Assert.assertTrue(getstatus);
	}	
}
