package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.CategoriesPage;
import PageObjects.SearchPage;
import UtilityMobile.BaseMobile;
import UtilityMobile.ExtentTestManager;

import com.relevantcodes.extentreports.LogStatus;

public class VerifyCategory extends BaseMobile {
	
@Test (enabled = true)
	
	public void CategoryFunctionalityVerify() throws InterruptedException{
	
    Thread.sleep(3000);
	boolean getstatus = CategoriesPage.clickingdropdown();
	Assert.assertTrue(getstatus);
	ExtentTestManager.getTest().log(LogStatus.INFO, "Page is successfully opened");
	}


}
