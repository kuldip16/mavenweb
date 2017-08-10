package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.LogStatus;
import UtilityMobile.BaseMobile;
import UtilityMobile.ExtentTestManager;
import UtilityMobile.appUtilMobile;
import UtilityMobile.utilMobile;

public class LeftNavigationMenu extends BaseMobile {
	
	public static String loginLink = ".//a[@class='login left-nav']";
	public static String meinKontoXpath = "//a[@class='account left-nav']";
	public static String email = ".//*[@id='email']";
	public static String password = ".//*[@id='passwd']";
	public static String loginSubmit = "//button[@name='SubmitLogin']";
	public static String passwordRequired = "//form[@id='login_form']/../..//div[@class='home-login-short-text']";
	
	public static String registerNowXpath = "//a[text()='Jetzt anmelden']";
	public static String firstNameXpath = ".//*[@id='customer_firstname']";
	public static String lastNameXpath = ".//*[@id='customer_lastname']";
	public static String registrationSubmitXpath = ".//*[@id='submitAccount']";
	public static String errorXpath = "//div[@class='home-login-error']";
	
	public static String myWishlistXpath = "//a[@title='My wishlists']";
	public static String myWishlistCountXpath = "//span[@id='total_fav']";
	public static String topCategoriesEcksofaXpath = ".//*[@id='page']/div[2]/div[1]/div[2]/ul/li[1]/ul/li[2]/div/ul/li/figure/figcaption/a";
	public static String topCategoriesWohnlandschaftXpath = ".//*[@id='page']/div[2]/div[1]/div[2]/ul/li[1]/ul/li[3]/div/ul/li/figure/figcaption/a";
	public static String cartXpath = "//a[@title='Zum Warenkorb']";
	public static String cartCountXpath = "//a[@title='Zum Warenkorb']/i/span";
	
	public static String ecksofasWohnlandschaftenXpath = "//div[@class='menu-slider-wrpr jq-menu-slider-wrpr open sticky-hdr']/div[2]/ul/li/a[@title='Ecksofas & Wohnlandschaften']";
	public static String einzelsofasXpath = "//div[@class='menu-slider-wrpr jq-menu-slider-wrpr open sticky-hdr']/div[2]/ul/li/a[@title='Einzelsofas']";
	public static String sesselHockerXpath = "//div[@class='menu-slider-wrpr jq-menu-slider-wrpr open sticky-hdr']/div[2]/ul/li/a[@title='Sessel & Hocker']";
	
	public static String subCategoryEcsofaXpath = ".//*[@id='page']/div[2]/div[1]/div[2]/ul/li[1]/ul/li[2]/div/ul/li/figure/figcaption/a";
	public static String subCategoryWohnlandschaftXpath = ".//*[@id='page']/div[2]/div[1]/div[2]/ul/li[1]/ul/li[3]/div/ul/li/figure/figcaption/a";
	public static String subCategoryRelaxliegeXpath = ".//*[@id='page']/div[2]/div[1]/div[2]/ul/li[2]/ul/li[2]/div/ul/li/figure/figcaption/a";
	public static String subCategorySchlafsofaXpath = ".//*[@id='page']/div[2]/div[1]/div[2]/ul/li[2]/ul/li[3]/div/ul/li/figure/figcaption/a"; 
	public static String subCategory2SitzerXpath = ".//*[@id='page']/div[2]/div[1]/div[2]/ul/li[2]/ul/li[4]/div/ul/li/figure/figcaption/a"; 
	public static String subCategory3SitzerXpath = ".//*[@id='page']/div[2]/div[1]/div[2]/ul/li[2]/ul/li[5]/div/ul/li/figure/figcaption/a"; 
	public static String subCategoryBigsofaXpath = ".//*[@id='page']/div[2]/div[1]/div[2]/ul/li[2]/ul/li[6]/div/ul/li/figure/figcaption/a";
	public static String subCategoryLoungesesselXpath = ".//*[@id='page']/div[2]/div[1]/div[2]/ul/li[3]/ul/li[2]/div/ul/li/figure/figcaption/a";
	public static String subCategoryXXLSesselXpath = ".//*[@id='page']/div[2]/div[1]/div[2]/ul/li[3]/ul/li[3]/div/ul/li/figure/figcaption/a";
	public static String subCategoryChesterfieldsesselXpath = ".//*[@id='page']/div[2]/div[1]/div[2]/ul/li[3]/ul/li[4]/div/ul/li/figure/figcaption/a";
	public static String subCategoryOhrensesselXpath = ".//*[@id='page']/div[2]/div[1]/div[2]/ul/li[3]/ul/li[5]/div/ul/li/figure/figcaption/a";
	public static String subCategoryHockerXpath = ".//*[@id='page']/div[2]/div[1]/div[2]/ul/li[3]/ul/li[6]/div/ul/li/figure/figcaption/a";
	
	
	public static String dropDown1Xpath =".//*[@id='page']/div[2]/div[1]/div[2]/ul/li[1]/i";
	public static String dropDown2Xpath =".//*[@id='page']/div[2]/div[1]/div[2]/ul/li[2]/i";
	public static String dropDown3Xpath =".//*[@id='page']/div[2]/div[1]/div[2]/ul/li[3]/i";
	
	public static void login(String emailId, String passwordVal){
		driver.findElement(By.xpath(email)).sendKeys(emailId);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Entered email id.");
		
		driver.findElement(By.xpath(password)).sendKeys(passwordVal);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Entered password.");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath(loginSubmit)).click();
		ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on submit button.");
	}
	
	public static void registration(){
		
		String emailId = utilMobile.getTestData("email")+utilMobile.getRandomNumberInRange(11, 99999)+"@mailinator.com";
		
		driver.findElement(By.xpath(firstNameXpath)).sendKeys(utilMobile.getTestData("firstName"));
		ExtentTestManager.getTest().log(LogStatus.INFO, "Entered first name.");
		
		driver.findElement(By.xpath(lastNameXpath)).sendKeys(utilMobile.getTestData("lastName"));
		ExtentTestManager.getTest().log(LogStatus.INFO, "Entered last name.");
		
		driver.findElement(By.xpath(email)).sendKeys(emailId);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Entered email.");
		
		driver.findElement(By.xpath(password)).sendKeys(utilMobile.getTestData("password"));
		ExtentTestManager.getTest().log(LogStatus.INFO, "Entered password.");
		
		driver.findElement(By.xpath(registrationSubmitXpath)).click();
		ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on submit registration.");
	}
	
    public static int changeInMenuCount(String locator , String productDetialOrList) throws InterruptedException{
    	int changeInCount =0;
    	
    	if(productDetialOrList.equalsIgnoreCase("productDetail")){
    	  int initialCount = menuCount(locator);
    	  ExtentTestManager.getTest().log(LogStatus.INFO, "Initial Menu count is: "+initialCount);
    	  
      	  appUtilMobile.navigateToProductDetailPage();
      	
      	  utilMobile.clickevent(ProductDetail.addToWishListButtonXpath);
     	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on AddToWishlist via product detail page.");
     	  Thread.sleep(2000);
     	  
     	  int finalCount = menuCount(locator);
     	  ExtentTestManager.getTest().log(LogStatus.INFO, "Final Menu count is: "+finalCount);  
     	  
    	  changeInCount = finalCount - initialCount ; 
     	    
      	}else{
      		
      		if(productDetialOrList.equalsIgnoreCase("productList")){
      			  
    	    	  appUtilMobile.navigateToProductListPage();
    	    	  
    	    	  utilMobile.clickevent(CategoriesPage.addToWishlistXpath);
    	    	  Thread.sleep(2000);
    	    	  int initialCount = menuCount(locator);
    	    	  Thread.sleep(2000);
    	    	  
    	    	  utilMobile.clickevent(CategoriesPage.removeFromWishlistXpath);
    	       	  ExtentTestManager.getTest().log(LogStatus.INFO, "Removed from wishlist via categories page.");
    	       	  
    	       	  Thread.sleep(2000);
    	       	  int finalCount = menuCount(locator);
        	    
    	    	  changeInCount = initialCount - finalCount; 
    	       	  
    	    	 }else{
    	    	  ExtentTestManager.getTest().log(LogStatus.ERROR, "Please enter either productDetail or productList.");	
    	    	 }
      	
      	}
      	
   	    
    	return changeInCount; 
    }
    
    public static int menuCount(String locator){
    	int count =0;
    	//utilMobile.clickevent(HomePage.homeSofaLogo);
    	//ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on homeSofa logo.");
    	 
    	count = utilMobile.getCount(locator);
    	
    	return count;
    }
    
    public static int changeInWishlistCount(String locator , String productDetialOrList){
    	int changeInCount =0;
    	
    	if(productDetialOrList.equalsIgnoreCase("productList")){
    		int initialCount = WishlistCount(locator);
    		appUtilMobile.navigateToProductListPage();
    		ExtentTestManager.getTest().log(LogStatus.INFO, "The initial count is: "+initialCount);
        	
        	utilMobile.clickevent(CategoriesPage.addToWishlistXpath);
       	    ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on  add to wishlist via categories page..");
       	    
       		int finalCount = WishlistCount(locator);
       		ExtentTestManager.getTest().log(LogStatus.INFO, "The final count is: "+finalCount);
       		
	   	    changeInCount = finalCount - initialCount; 
       	    
        	}else{

          		if(productDetialOrList.equalsIgnoreCase("productDetail")){
          			int initialCount = WishlistCount(locator);
          			  appUtilMobile.navigateToProductDetailPage();
          			  ExtentTestManager.getTest().log(LogStatus.INFO, "The initial count is: "+initialCount);
          			  
        	    	  utilMobile.clickevent(ProductDetail.removeFromWishListButtonXpath);
        	       	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on remove from wishlist via product detail page.");
        	       	    	  
        	       	int finalCount = WishlistCount(locator);
        	       	ExtentTestManager.getTest().log(LogStatus.INFO, "The final count is: "+finalCount);
        	       	
        	   	    changeInCount = initialCount - finalCount; 
        	    	 }else{
        	    	  ExtentTestManager.getTest().log(LogStatus.ERROR, "Please enter either productDetail or productList.");	
        	    	 }
        	
          }
   	  
   	    
    	return changeInCount; 
    }
    
    
    public static int WishlistCount(String locator){
    	 int finalCount = 0;
    	 
    	// utilMobile.clickevent(HomePage.homeSofaLogo);
    	// ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on homeSofa logo.");
    	 
    	 utilMobile.clickevent(HomePage.menu);
		 
		 
		 finalCount = utilMobile.getCount(locator);
		 
		 utilMobile.clickevent(HomePage.menu);
		 
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Got the initial wishlist count.");
		 return finalCount;
    }
    
   public static int changeInCartCount(String locator , String addOrRemove){
	   int initialCount = 0;
	   int finalCount = 0;
	   int changeInCount = 0;
	   
   	
	   if(addOrRemove.equalsIgnoreCase("addtocart")){ 
	   initialCount = cartCount(locator);
	   ExtentTestManager.getTest().log(LogStatus.INFO, "Got the initial cart count: "+initialCount);   
	   
	   appUtilMobile.navigateToProductDetailPage();
	   
   	   utilMobile.clickevent(ProductDetail.addToCartXpath);
       ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on addToCart"); 
   	
   	   finalCount = cartCount(locator);
       ExtentTestManager.getTest().log(LogStatus.INFO, "Got the final cart count: "+finalCount);
       
   	   changeInCount = finalCount - initialCount;
   	   
       }else{
    	 
    	 appUtilMobile.navigateToProductDetailPage();
    	   
       	 utilMobile.clickevent(ProductDetail.addToCartXpath); 
       	 
       	 initialCount = cartCount(locator);
 	     ExtentTestManager.getTest().log(LogStatus.INFO, "Got the initial cart count: "+initialCount);
 	     
 	     utilMobile.clickevent(HomePage.menu);
      	 utilMobile.clickevent(cartXpath);
      	 ExtentTestManager.getTest().log(LogStatus.INFO, "Moved to cart page.");
      	 
    	 utilMobile.clickevent(Cart.removeFromcart);
    	 
    	 changeInCount = initialCount - finalCount;  
       }
	   return changeInCount;
   }

   public static int cartCount(String locator){
	   int count=0;
	   utilMobile.clickevent(HomePage.menu);
		  
	   count = utilMobile.getCount(locator);
		 
	   utilMobile.clickevent(HomePage.menu);
		 
	   ExtentTestManager.getTest().log(LogStatus.INFO, "Got the initial cart count.");
	   
	   return count;
   }

}
