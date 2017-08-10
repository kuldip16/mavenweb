package TestCases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import applicationUtility.appFunctions;

import Utility.Base;
import Utility.ExtentTestManager;
import Utility.util;

public class Categories12398_05_d extends Base{
	
  @Test (enabled=false)
  public void verifyPriceSortingHightoLow() throws InterruptedException {
      boolean status =false;
	  
	  appFunctions.navigateToSubCategoryPage(Ecksofas_Wohnlandschaften_e, wohnlandschaft_sc_e);
	  
	  util.mousehover(sorting);
	  util.clickByXpath(priceHightoLow);
	  Thread.sleep(3000);
	  
	  
	  status = appFunctions.priceSortingHomePage(priceOnProductCard, "HighToLow");
	  
	  if(status){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Prices are sorted in high to low case"); 
	  }
  }
  
  
  @Test (enabled=true)
  public void verifyPriceSortingLowtoHigh() throws InterruptedException{
	  
      boolean status =false;
	  
	  appFunctions.navigateToSubCategoryPage(Ecksofas_Wohnlandschaften_e, wohnlandschaft_sc_e);
	  
	  util.mousehover(sorting);
	  util.clickByXpath(priceLowtoHigh);
	  Thread.sleep(3000);
	    
	  status = appFunctions.priceSortingHomePage(priceOnProductCard, "LowToHigh");
	  
	  if(status){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Prices are sorted in low to high case."); 
	  }
	  
  }
}
