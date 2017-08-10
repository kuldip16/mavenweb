package PageObjects;

import com.relevantcodes.extentreports.LogStatus;

import TestCases.Login;

import UtilityMobile.BaseMobile;
import UtilityMobile.ExtentTestManager;
import UtilityMobile.appUtilMobile;
import UtilityMobile.utilMobile;

public class OrderProcess extends BaseMobile {

	public static String AgreeCheckboxXpath = "//div[@class = 'agree newcheckbox']/label";
	public static String finalcheckoutXpath = ".//*[@id='final_checkout']";
	public static String kalrnaIframe = "klarna-checkout-iframe";
	public static String klarnacheckbox = ".//*[@id='widget3']/div/span[1]";
	public static String submitKlarnaXpath = ".//*[@id='buy-button']";
    public static String klarnaFrameButton = "klarna-checkout-iframe";
    public static String klarnaBestellung = "//button[@class='confirmation-action__order-details']";
    public static String klarnaFrameOrder = "klarna-fullscreen-iframe";
    public static String klarnaOrderId = "//*[@class='order-details-dialog__order-id']/p";
    public static String klarnaOrderAmount = "//span[@class='order-details-dialog__total-amount']";
	
	public static void creatingorder() throws InterruptedException{
		
		Login.loginTest();
		  appUtilMobile.navigateToProductDetailPage();
		   
	   	   utilMobile.clickevent(ProductDetail.addToCartXpath);
	       ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on addToCart"); 
	       
	       utilMobile.clickevent(HomePage.menu);
	       utilMobile.clickevent(LeftNavigationMenu.cartXpath);
	       ExtentTestManager.getTest().log(LogStatus.INFO, "Moved to cart page."); 
	       utilMobile.clickevent(Cart.cartsubmitXpath);
	       
	       utilMobile.clickevent(AgreeCheckboxXpath);
	       Thread.sleep(2000);
	       utilMobile.clickevent(finalcheckoutXpath);
	       Thread.sleep(12000);
	       utilMobile.switchToIframe(kalrnaIframe);
	       utilMobile.clickevent(klarnacheckbox);
	       driver.switchTo().defaultContent();
 		  Thread.sleep(7000);
 		 driver.switchTo().frame(klarnaFrameButton);
		  
 		utilMobile.clickByXpath(klarnaBestellung);
		  
		  driver.switchTo().defaultContent();
		   
		  Thread.sleep(4000);
		  
		  driver.switchTo().frame(klarnaFrameOrder);
		 
		 String orderId = utilMobile.getText(klarnaOrderId);
	       
	       
	       
	}
	
}
