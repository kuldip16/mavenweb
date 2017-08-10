package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import applicationUtility.appFunctions;

import Utility.Base;
import Utility.ExtentTestManager;
import Utility.util;

public class Categories12398_05_c extends Base {
	
  @Test (enabled=false)
  public void verifyCategoryFilter() {
	  boolean status=false;
     try{
	  appFunctions.navigateToSubCategoryPage(Ecksofas_Wohnlandschaften_e, wohnlandschaft_sc_e);
	  
	  status = appFunctions.colorFilterTest(util.getTestData("black"));
	  
	  if(status){
		  ExtentTestManager.getTest().log(LogStatus.PASS,"Color filter is working fine.");
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL,"Color filter is not working.");
		  Assert.fail();
	  }
     }catch(Exception e){
    	 ExtentTestManager.getTest().log(LogStatus.ERROR,e.getMessage());
     }
	  
  }
  
  @Test
  public void verifyPriceFilter() {
	  
	  boolean status=false;
     try{
	  appFunctions.navigateToSubCategoryPage(Ecksofas_Wohnlandschaften_e, wohnlandschaft_sc_e);
	  
	  status = appFunctions.priceFilterTest();
	  
	  if(status){
		  ExtentTestManager.getTest().log(LogStatus.PASS,"Price filter working fine"); 
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL,"Price filter not working");
	  }
	  
	  	  
     }catch(Exception e){
    	 ExtentTestManager.getTest().log(LogStatus.ERROR,e.getMessage()); 
     }
  }
}
