package PageObjects;

import com.relevantcodes.extentreports.LogStatus;

import UtilityMobile.BaseMobile;
import UtilityMobile.ExtentTestManager;
import UtilityMobile.appUtilMobile;
import UtilityMobile.utilMobile;

public class Cart extends BaseMobile {
	
	public static String removeFromcart = ".//*[contains(@id,'cart_quantity_down')]";
	public static String zurKasseXpath = "//button[@title='Zur Kasse']";
	public static String loginLinkXpath = "//a[text()='Loggen Sie sich ein']";
	public static String emptyCartPartXpath = "//div[@class='cart_empty_part']";
	public static String changeShippingAddressXpath = "//a[@title='Lieferadresse ändern']/span";
	public static String priceOfProductXpath = "//span[contains(@id,'total_product_price')]";
	public static String registrationSubmitFromCartXpath = ".//*[@id='submitAccount']";
	public static String registrationFnameXpath = ".//*[@id='customer_firstname']";
	public static String registrationLnameXpath = ".//*[@id='customer_lastname']";
	public static String cartsubmitXpath = "//div[@class = 'cart_navigation clearfix']/button";
	
	public static void loginFromCart(){
		   appUtilMobile.navigateToProductDetailPage();
		   
	   	   utilMobile.clickevent(ProductDetail.addToCartXpath);
	       ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on addToCart"); 
	       
	       utilMobile.clickevent(HomePage.menu);
	       
	       try {
	   		Thread.sleep(5000);
	   	   } catch (InterruptedException e) {
	   		// TODO Auto-generated catch block
	   		e.printStackTrace();
	   	   } 
	       utilMobile.clickevent(LeftNavigationMenu.cartXpath);
	       ExtentTestManager.getTest().log(LogStatus.INFO, "Moved to cart page."); 
	       
	       utilMobile.clickevent(zurKasseXpath);
	       ExtentTestManager.getTest().log(LogStatus.INFO, "Moved to registration page from cart page."); 
	       
	       utilMobile.clickevent(loginLinkXpath);
	       ExtentTestManager.getTest().log(LogStatus.INFO, "Moved to loginpage form cart page."); 
	       
	       LeftNavigationMenu.login(utilMobile.getTestData("loginEmail"), utilMobile.getTestData("loginPassword"));
	       
	       
	}
	

	
	public static void registrationFromCart(){
		
		   String emailId = utilMobile.getTestData("emailRegistrationFromCart")+utilMobile.getRandomNumberInRange(11, 99999)+"@mailinator.com";
		   appUtilMobile.navigateToProductDetailPage();
		   
	   	   utilMobile.clickevent(ProductDetail.addToCartXpath);
	       ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on addToCart"); 
	       
	       utilMobile.clickevent(HomePage.menu);
	       
	       try {
		   		Thread.sleep(5000);
		   	   } catch (InterruptedException e) {
		   		// TODO Auto-generated catch block
		   		e.printStackTrace();
		   	   } 
	       
	       utilMobile.clickevent(LeftNavigationMenu.cartXpath);
	       ExtentTestManager.getTest().log(LogStatus.INFO, "Moved to cart page."); 
	       
	       utilMobile.clickevent(zurKasseXpath);
	       ExtentTestManager.getTest().log(LogStatus.INFO, "Moved to registration page from cart page."); 
	       
	       try{
	    	  utilMobile.clickByXpath(MeinKonto.herrXpath);
	    	  ExtentTestManager.getTest().log(LogStatus.INFO, "Selected Herr.");
	    	  
	    	  
	 		  utilMobile.enterText(utilMobile.getTestData("profileUpdateFName"), registrationFnameXpath);
	 		  ExtentTestManager.getTest().log(LogStatus.INFO, "Entered FirstName.");
	 		   
	 		  utilMobile.enterText(utilMobile.getTestData("profileUpdateLName"), registrationLnameXpath);
	 		  ExtentTestManager.getTest().log(LogStatus.INFO, "Entered LastName.");
	    		   
	    	  utilMobile.selectDropDownValue(utilMobile.getTestData("day"), MeinKonto.dobDateXpath);
	    	  ExtentTestManager.getTest().log(LogStatus.INFO, "Entered date.");
	    		  
	    	  utilMobile.selectDropDownValue(utilMobile.getTestData("month"), MeinKonto.dobMonthXpath);
	  		  ExtentTestManager.getTest().log(LogStatus.INFO, "Entered month.");
	  		  
	  		  utilMobile.selectDropDownValue(utilMobile.getTestData("year"), MeinKonto.dobYearXpath);
	 		  ExtentTestManager.getTest().log(LogStatus.INFO, "Entered year.");
	 		  
	 		  utilMobile.enterText(emailId, LeftNavigationMenu.email);
	   		  ExtentTestManager.getTest().log(LogStatus.INFO, "Entered email.");
	   		  
	   		  utilMobile.enterText(utilMobile.getTestData("profileUpdateNewPassword"), LeftNavigationMenu.password);
	  		  ExtentTestManager.getTest().log(LogStatus.INFO, "Entered new password.");
	  		  
	  		  
	    	  utilMobile.enterText(utilMobile.getTestData("strafze"), MeinKonto.strafzeXpath);
	    	  Thread.sleep(4000);
	    	  utilMobile.clickByXpath(MeinKonto.strafzeValXpath);
	    	  ExtentTestManager.getTest().log(LogStatus.INFO, "Entered strafze.");
	    		  
	    	  utilMobile.enterText(utilMobile.getTestData("telefon"), MeinKonto.phoneXpath);
	    	  ExtentTestManager.getTest().log(LogStatus.INFO, "Entered telefon.");
	    		  	  
	    	  
	    	  utilMobile.clickByXpath(registrationSubmitFromCartXpath);
	    	  ExtentTestManager.getTest().log(LogStatus.INFO, "clicked on submit");
	    	  Thread.sleep(3000);  
	    	  }catch(Exception e){
	    		   
	    	   }
		
	}
	
	
	public static boolean verifyProductPriceOnCart(){
		boolean correctPrice = false;
		String priceOnDetail = null;
		String priceOnCart = null;
		
		appUtilMobile.navigateToProductDetailPage();
		   
		priceOnDetail = utilMobile.getText(ProductDetail.priceDetailPageXpath);
		   
	   	utilMobile.clickevent(ProductDetail.addToCartXpath);
	    ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on addToCart"); 
	       
	    utilMobile.clickevent(HomePage.menu);
	    
	    try {
	   		Thread.sleep(5000);
	   	   } catch (InterruptedException e) {
	   		// TODO Auto-generated catch block
	   		e.printStackTrace();
	   	   } 
	    
	    utilMobile.clickevent(LeftNavigationMenu.cartXpath);
	    ExtentTestManager.getTest().log(LogStatus.INFO, "Moved to cart page."); 
		
	    priceOnCart =  utilMobile.getText(priceOfProductXpath);
	    
	    if(priceOnDetail.equalsIgnoreCase(priceOnCart)){
	    	
	    	correctPrice = true;
	    	
	    }
		return correctPrice;
	}
	


}
