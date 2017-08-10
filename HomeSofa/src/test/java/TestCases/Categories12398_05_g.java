package TestCases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import applicationUtility.appFunctions;

import Utility.Base;
import Utility.ExtentTestManager;
import Utility.util;

public class Categories12398_05_g extends Base {
	
  
@Test
  
public void verifyProductDetailPage() throws InterruptedException {
	
  
	  
String productIndex = "1";
	  

List<WebElement> fabricCheck = new ArrayList<WebElement>();
	
  
List<WebElement> attributeList = new ArrayList<WebElement>();
	
  
	  
	  
appFunctions.navigateToSubCategoryPage(Ecksofas_Wohnlandschaften_e, wohnlandschaft_sc_e);
	
  
	 
 util.clickByXpath(appFunctions.Topsellerwishlistproductimg_e(productIndex));
	 

 ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on first product on category and moved to its detail page.");
	
  
	 
 fabricCheck = util.getElements(colorProductDetail);
	  

	 
 if(fabricCheck.size()>0){
		  
ExtentTestManager.getTest().log(LogStatus.PASS, "Different fabrics of product exists."); 

	  
}
else{

		  
ExtentTestManager.getTest().log(LogStatus.FAIL, "Fabrics of product doesn't exist.");

	 
 }
	  
	  
attributeList = util.getElements(attributes);
	 

 for(WebElement attr : attributeList)
{
		  
String attrVal = attr.getAttribute("id");
	
	  
		
  if(attrVal.contains(util.getTestData("directions"))){
	

		  ExtentTestManager.getTest().log(LogStatus.INFO, "Direction section of product exists.");

                  List<WebElement> directionsList = new ArrayList<WebElement>();


	          directionsList = util.getElements(directions);
	
		 
 if(directionsList.size() > 0){
	
			 
 ExtentTestManager.getTest().log(LogStatus.PASS, "Directions exists under direction section."); 

		
	  }
else{
			
	
  ExtentTestManager.getTest().log(LogStatus.FAIL, "Directions doesn't exist under direction section.");
	
		
  }
		 
 }
		  
		 
 if(attrVal.contains(util.getTestData("functions")))

{
			 
 ExtentTestManager.getTest().log(LogStatus.INFO, "Functions section of product exists."); 

			  
		
 List<WebElement> functionList = new ArrayList<WebElement>();
	
		
  functionList = util.getElements(functions);
	
		
  if(functionList.size() > 0){
	
			
  ExtentTestManager.getTest().log(LogStatus.PASS, "Different functions exists under function section."); 
		
	  }
else{
			
	  ExtentTestManager.getTest().log(LogStatus.FAIL, "functions doesn't exist under function section.");

		
	  }
		
  }
	  
}
	 
 
  }

}

