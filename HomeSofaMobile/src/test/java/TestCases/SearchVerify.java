package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.SearchPage;
import UtilityMobile.BaseMobile;
import UtilityMobile.ExtentTestManager;

import com.relevantcodes.extentreports.LogStatus;

public class SearchVerify extends BaseMobile {
	
@Test (enabled = true)
	
	public void SearchFunctionalityVerify() throws InterruptedException{
	
    Thread.sleep(3000);
	boolean getstatus =	SearchPage.searchfunc();
	Assert.assertTrue(getstatus);
	ExtentTestManager.getTest().log(LogStatus.INFO, "Page is successfully opened");
	}

@Test (enabled = true)

public void SearchFunctionalityVerify1() throws InterruptedException{

Thread.sleep(3000);
boolean getstatus =	SearchPage.searchbar();
Assert.assertTrue(getstatus);
ExtentTestManager.getTest().log(LogStatus.INFO, "Page is successfully opened");
}


}
