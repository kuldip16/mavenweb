package TestCases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import applicationUtility.appFunctions;

import Utility.Base;
import Utility.ExtentTestManager;
import Utility.util;

public class Categories12398_05_b extends Base {
	
  @Test
  public void verifySubCategories() throws InterruptedException {
	  boolean status = false;
	  String expectedSubCategory = util.getTestData("wohnlandschaft");
	  String actualSubCategory = null;
	  List<WebElement> subCatProd = new ArrayList<WebElement>();
	  
	  appFunctions.navigateToSubCategoryPage(Ecksofas_Wohnlandschaften_e, wohnlandschaft_sc_e);
	  
	  subCatProd = util.getElements(subCategoryProducts);
	  
	  for(WebElement subProd: subCatProd){
		 actualSubCategory =   subProd.getAttribute("title");
	    if(actualSubCategory.contains(expectedSubCategory)){
	    	status = true;
	      }else{
	    	status = false; 
	    	break;
	      }
	   }
	  
	  if(status){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "All the products listed belong to selected sub-category.");
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Products from other categories are listed under selected category.");
		  Assert.fail();
	  }
	  
  }
}
