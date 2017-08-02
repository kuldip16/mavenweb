package Testcases;

import org.testng.annotations.Test;

import PageObjects.Headersearch;
import UtilityMobile.AppUtil;
import UtilityMobile.BaseMobile;
import UtilityMobile.ExtentTestManager;
import UtilityMobile.utilMobile;


import com.relevantcodes.extentreports.LogStatus;

public class search extends BaseMobile{
	
	
	@Test
	  public static void searchheader() {
		
		
		//------------------------------------Foto Search---------------------------------------------------------------------------
	/*	Headersearch.search(Headersearch.fotosearch, Headersearch.searchfield, utilMobile.getTestData("fotosearch"));
		ExtentTestManager.getTest().log(LogStatus.INFO, "lending to foto search result page");
		utilMobile.wait(5000);
		
		searchresult = utilMobile.getText(Headersearch.fotoresultpage);
		noresult= utilMobile.getText(Headersearch.nofotoresult);
		
		System.out.println(searchresult);
		 
		if(searchresult.equalsIgnoreCase(utilMobile.getTestData("fotosearch"))){
			  ExtentTestManager.getTest().log(LogStatus.PASS, "search done successfully."); 
			  
		  }else if(noresult.contains(utilMobile.getTestData("nofotosearch"))){
			  
			  ExtentTestManager.getTest().log(LogStatus.PASS, "No result found.");  
		  }else{
			  ExtentTestManager.getTest().log(LogStatus.FAIL, "search failed.");
		  }
		  
		  driver.navigate().to("https://www.moebel.de/");
		  
		  utilMobile.wait(5000);*/
		//------------------------------------experten Search---------------------------------------------------------------------------
		/*  Headersearch.search(Headersearch.expertensearch, Headersearch.searchfield, utilMobile.getTestData("Expertensearch"));
			ExtentTestManager.getTest().log(LogStatus.INFO, "lending to magazin search result page");
			utilMobile.wait(3000);
			
			searchresult = utilMobile.getText(Headersearch.experteresult);
			noresult= utilMobile.getText(Headersearch.noexperteresult);
			  System.out.println(searchresult);
			  if(searchresult.equalsIgnoreCase(utilMobile.getTestData("Expertensearch"))){
				  ExtentTestManager.getTest().log(LogStatus.PASS, "search done successfully."); 
			  }else if(noresult.contains(utilMobile.getTestData("noexperteearch"))){
				
				  ExtentTestManager.getTest().log(LogStatus.PASS, "No result found.");  
			  }else{
				  ExtentTestManager.getTest().log(LogStatus.FAIL, "search failed.");
			  }
			  
			  driver.navigate().to("https://www.moebel.de/");
			  */
		//------------------------------------magazin Search---------------------------------------------------------------------------
		    Headersearch.search(Headersearch.magazinsearch, Headersearch.searchfield, utilMobile.getTestData("magazinsearch"));
			ExtentTestManager.getTest().log(LogStatus.INFO, "lending to magazin search result page");
			utilMobile.wait(1000);
			utilMobile.scrollTo();
			AppUtil.verify_headersearch(Headersearch.magazinresult, utilMobile.getTestData("magazinsearch"),"https://www.moebel.de/wohnideen/fotos");
			
			Headersearch.search(Headersearch.magazinsearch, Headersearch.searchfield, utilMobile.getTestData("nomagazinsearch"));
			ExtentTestManager.getTest().log(LogStatus.INFO, "lending to magazin search result page");
			utilMobile.wait(1000);
			utilMobile.scrollTo();
			AppUtil.verify_headersearch(Headersearch.nomagazinresult, utilMobile.getTestData("nomagazinsearchresult"),"https://www.moebel.de/wohnideen/fotos");
			
			  
			  
	
			  }
		
	}

