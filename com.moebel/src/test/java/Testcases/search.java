package Testcases;

import org.testng.annotations.Test;

import utilitypart1.baseclass;
import utilitypart1.util;
import PageObjects.Headersearch;
import utilitypart1.ExtentTestManager;
import com.relevantcodes.extentreports.LogStatus;

public class search extends baseclass{
	
	
	@Test
	  public static void searchheader() {
		
		String searchresult = null;
		//------------------------------------Foto Search---------------------------------------------------------------------------
		Headersearch.search(Headersearch.fotosearch, Headersearch.searchfield, util.gettestdata("fotosearch"));
		ExtentTestManager.getTest().log(LogStatus.INFO, "lending to foto search result page");
		util.wait(5000);
		
		searchresult = util.getText(Headersearch.fotoresultpage);
		  System.out.println(searchresult);
		  if(searchresult.equalsIgnoreCase(util.gettestdata("fotosearch"))){
			  ExtentTestManager.getTest().log(LogStatus.PASS, "search done successfully."); 
		  }else{
			  ExtentTestManager.getTest().log(LogStatus.FAIL, "search failed.");
		  }
		  
		  driver.navigate().to("https://www.moebel.de/");
		  
		  util.wait(5000);
		//------------------------------------Experten Search---------------------------------------------------------------------------
		  Headersearch.search(Headersearch.expertensearch, Headersearch.searchfield, util.gettestdata("Expertensearch"));
			ExtentTestManager.getTest().log(LogStatus.INFO, "lending to experten search result page");
			util.wait(3000);
			
			searchresult = util.getText(Headersearch.experteresult);
			  System.out.println(searchresult);
			  if(searchresult.equalsIgnoreCase(util.gettestdata("Expertensearch"))){
				  ExtentTestManager.getTest().log(LogStatus.PASS, "search done successfully."); 
			  }else{
				  ExtentTestManager.getTest().log(LogStatus.FAIL, "search failed.");
			  }
			  
			  driver.navigate().to("https://www.moebel.de/");
			  
			  util.wait(5000);
			//------------------------------------Magazin Search---------------------------------------------------------------------------
			  Headersearch.search(Headersearch.magazinsearch, Headersearch.searchfield, util.gettestdata("magazinsearch"));
				ExtentTestManager.getTest().log(LogStatus.INFO, "lending to magazin search result page");
				util.wait(3000);
				
				searchresult = util.getText(Headersearch.magazinresult);
				  System.out.println(searchresult);
				  if(searchresult.equalsIgnoreCase(util.gettestdata("magazinsearch"))){
					  ExtentTestManager.getTest().log(LogStatus.PASS, "search done successfully."); 
				  }else{
					  ExtentTestManager.getTest().log(LogStatus.FAIL, "search failed.");
				  }
				  
				  driver.navigate().to("https://www.moebel.de/");
				  
				  
				  util.wait(5000);
				//------------------------------------Product Search---------------------------------------------------------------------------
				    util.enterText(util.gettestdata("productsearch"), Headersearch.searchfield);
					ExtentTestManager.getTest().log(LogStatus.INFO, "lending to product search result page");
					util.wait(3000);
					
				  	searchresult = util.getText(Headersearch.productresult);
					  System.out.println(searchresult);
					  if(searchresult.contains(util.gettestdata("productsearch"))){
							 
						  ExtentTestManager.getTest().log(LogStatus.PASS, "search done successfully."); 
					  }else{
						  ExtentTestManager.getTest().log(LogStatus.FAIL, "search failed.");
					  }
					  
					  driver.navigate().to("https://www.moebel.de/");
			  
		  
		 

}
}
