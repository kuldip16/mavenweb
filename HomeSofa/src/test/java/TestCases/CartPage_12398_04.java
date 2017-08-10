package TestCases;

import java.awt.AWTException;
import java.text.ParseException;

import junit.framework.Assert;

import org.testng.annotations.Test;

import PageObjects.CallBack_Module;
import PageObjects.CartPageModule;
import Utility.Base;
import Utility.ExtentTestManager;

import com.relevantcodes.extentreports.LogStatus;

public class CartPage_12398_04 extends Base{

	@Test (enabled = true)
	public void Cart_Page_Function() throws InterruptedException, ParseException, AWTException{
		ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that cart page functionality is working properly or not");
		boolean getstatus = CartPageModule.cartpage();
		Assert.assertTrue(getstatus);
	}

	
}
