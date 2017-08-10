package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.CategoriesPage;
import PageObjects.OrderProcess;
import UtilityMobile.BaseMobile;
import UtilityMobile.ExtentTestManager;

public class VerifyOrderProcess extends BaseMobile {

	
@Test (enabled = true)
	
	public void OrderVerify() throws InterruptedException{
	
    Thread.sleep(3000);
	 OrderProcess.creatingorder();
	//Assert.assertTrue(getstatus);
	ExtentTestManager.getTest().log(LogStatus.INFO, "Page is successfully opened");
	}


	
}
