package TestCases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Utility.Base;
import Utility.ExtentTestManager;
import Utility.util;

public class Categories12398_05_e extends Base {
  @Test
  public void verifyTopSubCategoriesNavigation() {
	  boolean status1 = false;
	  boolean status2 = false;
	  boolean status3 = false;
	  boolean status4 = false;
	  boolean status5 = false;
	  boolean status6 = false;
	  
	  status1 = util.elementPresentOrNot(subCatEcksofa);
	  status2 = util.elementPresentOrNot(subCatSchlafsofa);
	  status3 = util.elementPresentOrNot(subCatBigsofa);
	  status4 = util.elementPresentOrNot(subCatWohnlandschaft);
	  status5 = util.elementPresentOrNot(subCat3Sitzer);
	  status6 = util.elementPresentOrNot(subCatOhrensessel);
	  
	  if(status1 && status2 && status3 && status4 && status5 && status6 ){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "All top sub-categories links are present.");
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Top sub-categories links are missing");
	  }
  }
}
