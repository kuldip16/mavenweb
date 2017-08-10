package TestCases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import UtilityMobile.BaseMobile;
import UtilityMobile.ExtentTestManager;

public class testClass extends BaseMobile {
	
  @Test
  public void WAPLaunch() {
	  System.out.println("Wap automation on the go.");
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Mobile browser launched.");
	  
	  ExtentTestManager.getTest().log(LogStatus.PASS, "Mobile browser test passed");
	  
	 
  }
}
