package TestCases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Utility.Base;
import Utility.ExtentTestManager;
import Utility.util;

public class Categories12398_05_a extends Base {
	
  @Test
  public void verifyMouseHoverTopCategories() {
	  boolean subcategoryOne = false;
	  boolean subcategoryOneImage = false;
	  boolean subcategoryTwo = false;
	  boolean subcategoryTwoImage = false;
	  boolean topcategory = false;
	  
	  boolean status = false;
	  String expectedSubCategoryOne = util.getTestData("wohnlandschaft");
	  String expectedSubCategoryTwo = util.getTestData("ecksofa");
	  String actualSubCategory = null;
	  List<WebElement> subCatProd = new ArrayList<WebElement>();
	  
	  util.mousehover(Ecksofas_Wohnlandschaften_e);
	  subcategoryOne = util.elementPresentOrNot(wohnlandschaft_sc_e);
	  subcategoryOneImage = util.elementPresentOrNot(wohnlandschaft_sc_eImage);
	  
	  subcategoryTwo = util.elementPresentOrNot(ecksofa_sc_e);
	  subcategoryTwoImage = util.elementPresentOrNot(ecksofa_sc_eImage);
	  
	  topcategory = util.elementPresentOrNot(EcksofasWohnlandschaftenTopCategories);
	  
	  if(subcategoryOne){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Subcategory is present.");
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Subcategory is not present.");
	  }
	  
	  if(subcategoryOneImage){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Subcategory image is present.");
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Subcategory image is not present.");
	  }
	  
	  if(subcategoryTwo){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Subcategory is present.");
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Subcategory is not present.");
	  }
	  
	  if(subcategoryTwoImage){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Subcategory image is present.");
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Subcategory image is not present.");
	  }
	  
	  if(topcategory){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Top category link is present.");
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Top category link is not present.");
	  }
	  
	  
	  util.clickByXpath(Ecksofas_Wohnlandschaften_e);
	  
      subCatProd = util.getElements(subCategoryProducts);
	  
	  for(WebElement subProd: subCatProd){
		 actualSubCategory =   subProd.getAttribute("title");
	    if(actualSubCategory.contains(expectedSubCategoryOne) || actualSubCategory.contains(expectedSubCategoryTwo)){
	    	status = true;
	      }else{
	    	status = false; 
	    	break;
	      }
	   }
	  
	  if(status){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "All the products listed belong to selected category.");
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Products from other categories are listed under selected category.");
		  Assert.fail();
	  }
	  
  }
}
