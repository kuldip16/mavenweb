package TestCases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import applicationUtility.appFunctions;

import com.relevantcodes.extentreports.LogStatus;

import Utility.Base;
import Utility.ExtentTestManager;
import Utility.util;

public class Categories12398_05_f  extends Base{
  @Test
  public void verifySubCategoryTopSellerProducts() throws InterruptedException {
	  boolean statusHeading = false; 
	  List<WebElement> topProducts = new ArrayList<WebElement>();
	  
	  appFunctions.navigateToSubCategoryPage(Ecksofas_Wohnlandschaften_e, wohnlandschaft_sc_e);
	  
	  statusHeading = util.elementPresentOrNot(topProductsHeading);
	  topProducts = util.getElements(topSellerProducts);
	  
	  if(statusHeading){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Top products heading is visible.");
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.INFO, "Top products heading is not visible.");
	  }
	  
	  if(topProducts.size()==3){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Top seller products are visible.");
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.INFO, "Top seller products are missing.");
	  }
	  
  }
}
