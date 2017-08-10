package TestCases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Utility.Base;
import Utility.ExtentTestManager;
import Utility.util;
import applicationUtility.appFunctions;

public class Categories12398_05_h extends Base{
	
  @Test
  public void verifyCategorySeitePage() throws InterruptedException {
	  String expectedAttributeValue = "active current";
	  String actualValue = null;

	  appFunctions.navigateToSubCategoryPage(Ecksofas_Wohnlandschaften_e, wohnlandschaft_sc_e);
	  
	  util.mousehover(paginationDropDown);
	  util.clickByXpath(pagination2ndValue);
	  Thread.sleep(3000);
	  
	  actualValue = util.getAttribute("class", bottomPagination2ndValue);
	  
	  if(expectedAttributeValue.equalsIgnoreCase(actualValue)){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "User switched to expected page after selecting value from Seite drop down."); 
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Seite drop down is not navigating user to expected page."); 
	  }
  }
}
