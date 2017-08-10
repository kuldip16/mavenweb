package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.LogStatus;


import UtilityMobile.BaseMobile;
import UtilityMobile.ExtentTestManager;
import UtilityMobile.utilMobile;

public class SearchPage extends BaseMobile{
	
	public static String SearchbarXpath = ".//*[@id='search_query_top']";
	public static String submitsearcgXpath = ".//*[@id='searchbox']/i";
	public static String searchedTextXpath = "//div[@class='search-query src-mid-hd text-center']/h3/span";
	public static String searchproductXpath = "//div[@class='prduct-detail']/h5/a";
	public static String FilterBtnXpath = ".//*[@id='center_column']/button";
	public static String ColorfltrXpath = "//div[@class = 'delivery_info']/ul/li[3]/a";
	public static String seatsliderXpath = "//div[@class='filter-block jq-filter-block']/div[2]/span[3]";
	public static String prddetailclrlistXpath = "//div[@class = 'color-row']/ul/li/a";
	public static String productclickXpath = "//div[@class = 'prduct-detail']/h5/a";
	public static String setFilterXpath = ".//*[@id='set-filters']";
	
	public static String searchinput = utilMobile.getTestData("searchterm");
	public static boolean searchbar(){
		
		boolean status = true;
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Scrolling the page downwards");
		 utilMobile.pagescroll(15000);
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that on scrolling the page search bar is displaying or not");
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Expected Result: On scrolling the page search bar should not be displaying"); 
		
		 if(utilMobile.elementPresentOrNot(SearchbarXpath)){
			ExtentTestManager.getTest().log(LogStatus.FAIL, "Search bar is displaying " );
			System.out.println("search bar is displaying");
			status = false;
		}
					
		else{
			
			ExtentTestManager.getTest().log(LogStatus.PASS, "Search bar is not displaying " );
			System.out.println("search bar is not displaying");
		    status = true;
		}
			return status;
		
	}
	
	public static boolean searchfunc() throws InterruptedException{
	
		boolean status = true;
		ExtentTestManager.getTest().log(LogStatus.INFO, "Entering the text in search bar");
		utilMobile.enterdata(SearchbarXpath, searchinput);
	 
		ExtentTestManager.getTest().log(LogStatus.INFO, "Clicking keyboard Enter button");
		utilMobile.ClickEnter(SearchbarXpath);
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "Waiting to load all products related to that keyword");
		Thread.sleep(25000);
	
		ExtentTestManager.getTest().log(LogStatus.INFO, "Verify text is same as written on the search page or not");
		
		if(searchinput.equalsIgnoreCase(utilMobile.getText(searchedTextXpath))){
			
			ExtentTestManager.getTest().log(LogStatus.PASS, "Text which searched, is correct " );
			System.out.println("Searched text is correct");
			System.out.println(utilMobile.getText(searchedTextXpath));		
			status = true;
		}
		
		else{
				
			ExtentTestManager.getTest().log(LogStatus.FAIL, "Text which searched, is incorrect " );
			System.out.println(utilMobile.getText(searchedTextXpath));
			System.out.println("text is incorrect");
			status = false;
		
			}
	
		ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that searched name is related to the product names or not" );
		status = utilMobile.MatchElement(searchinput, searchproductXpath);
		
		if(status){
			
			System.out.println("Products are matched");			
			ExtentTestManager.getTest().log(LogStatus.PASS, "Product list is not proper as per the search term" );
		}
		
		else{
			
			ExtentTestManager.getTest().log(LogStatus.FAIL, "Product list is not proper as per the search term" );
		}
		
	    status = searchfilterfunc(FilterBtnXpath);
	
	return status;
	
	
	}
	
	public static boolean searchfilterfunc(String element) throws InterruptedException{
		boolean status = false;

		ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Filter Button" );
		utilMobile.clickevent(element);
		System.out.println("Button clicked");
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "Clicking color in filter option" );
		utilMobile.clickevent(ColorfltrXpath);
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "Getting the name of the color clicked" );
		String clrname = utilMobile.getattribute(ColorfltrXpath, "title");
		clrname = utilMobile.lower_casestring(clrname);
		System.out.println("color clicked");
		System.out.println(clrname);

		ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Apply filter button" );
		utilMobile.clickevent(setFilterXpath);
		Thread.sleep(10000);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Waiting to products to load" );
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "Clicking on any product of that filtered products" );
		utilMobile.clickevent(productclickXpath);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Navigating to product detail page" );
		Thread.sleep(30000);
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "Verifying the clicked color exist in the color list of that product or not" );
		status = utilMobile.MatchElementAttr(clrname, prddetailclrlistXpath);

		if(status){
			ExtentTestManager.getTest().log(LogStatus.PASS, "Color String is matched");
		}
		else{
			ExtentTestManager.getTest().log(LogStatus.FAIL, "Color String is not matched");
		}
		
		return status;
		
	}
}
