package TestCases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import UtilityMobile.BaseMobile;
import UtilityMobile.ExtentTestManager;
import UtilityMobile.appUtilMobile;
import UtilityMobile.utilMobile;

public class articleDetailPage extends BaseMobile {
	
  @Test
  public void verifyArticleImage() {
	  boolean matchExists = false;
	  
	  appUtilMobile.navigateToProductDetailPage();
	  
	  matchExists = utilMobile.patternMatching(utilMobile.getTestData("articleImage"));
	  
	  if(matchExists){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Article image exists."); 
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Article image either not matching or doesn't exist."); 
	  }
  }
}
