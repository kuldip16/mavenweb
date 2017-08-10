package TestCases;

import junit.framework.Assert;

import org.testng.annotations.Test;

import PageObjects.Fabric_Module;
import PageObjects.Search_Module;
import Utility.Base;
import Utility.ExtentTestManager;

import com.relevantcodes.extentreports.LogStatus;

public class SearchFunctionality_12398_06_07 extends Base{

	@Test (enabled = true)
	public void SearchFunction() throws InterruptedException{
		ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that jolie search window is opening or not");
		ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that in jolie search window the results are correct or not");
		boolean getstatus = Search_Module.joliesearch(searchternheader_e , joliesearchproductlist_e );
		Assert.assertTrue(getstatus);
	}
	
	@Test (enabled = true)
	public void SearchpageFunction() throws InterruptedException{
		ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that jolie search window is opening or not");
		ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that in jolie search window the results are correct or not");
		boolean getstatus = Search_Module.joliesearch(searchheadline_e , productnamelist );
		Assert.assertTrue(getstatus);
	}
	
	
}
