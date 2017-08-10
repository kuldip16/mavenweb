package UtilityMobile;

import PageObjects.CategoriesPage;
import PageObjects.HomePage;
import PageObjects.LeftNavigationMenu;
import PageObjects.ProductDetail;

import com.relevantcodes.extentreports.LogStatus;

public class appUtilMobile extends BaseMobile {
	
	public static void navigateToProductDetailPage(){
		
		  navigateToProductListPage(); 
		
		  utilMobile.clickevent(CategoriesPage.firstProductInListXpath);
		  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on product from list.");
			  
		  
	}
	
	public static void navigateToProductListPage(){
		  //utilMobile.clickevent(HomePage.homeSofaLogo);
		  utilMobile.clickevent(HomePage.menu);
		  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on left navigation menu.");
		  
		  try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  
		  utilMobile.clickevent(LeftNavigationMenu.topCategoriesWohnlandschaftXpath);
		  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on Wohnlandschaft.");
		  
	}

}
