package PageObjects;

import java.awt.AWTException;


import java.text.DateFormat;
import java.util.Date;
import java.util.TimeZone;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import Utility.ExtentTestManager;
import Utility.util;
import java.text.SimpleDateFormat;
public class CartPageModule extends util{
	
	public static boolean cartpage() throws InterruptedException, AWTException{
		
		boolean status = true;
		String str = "";
		ExtentTestManager.getTest().log(LogStatus.INFO, "mouse hover on Ecksofas & Wohnlandschaften ");
		mousehover(Ecksofas_Wohnlandschaften_e);
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "clicking on Wohnlandschaften category");
		clickevent(wohnlandschaft_sc_e);
		Thread.sleep(4000);
		
		mousehover(number_element_e);
		Thread.sleep(4000);
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "clicking on 48 number");
		clickevent(element_48_e); 
		getelement(util.getTestData("ProductSelected"), productnamelist);
				
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Getting the price of product on ADP page");
		 String str3 = getattribute(price_adp_e, "content");
         double  pricedigit = Double.parseDouble(str3);
         System.out.println(pricedigit);
         
         ExtentTestManager.getTest().log(LogStatus.INFO, "Getting the name of selected fabric from adp page");
		 String coverselected =	getattribute(price_adp_e, "title");
		    coverselected =  lower_casestring(coverselected);
		    coverselected = Replace_space_string(coverselected);
		 
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Adding the product to cart");
		 cartadd();
		 
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Getting the Germany time of adding product in cart");
		 DateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm");
		 df.setTimeZone(TimeZone.getTimeZone("CET"));
		 Date dateobj = new Date();
		 System.out.println(df.format(dateobj));
		 String cdt = (df.format(dateobj));
		 Thread.sleep(3000);
		 System.out.println("Category page name :"+ util.getTestData("ProductSelected"));
		 
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Click on continue button cart window and navigating to cart page");
		 clickevent(submitcart_e);
		 
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Getting the name of product in cart page");
		 String cartproduct = getText(cart1stproductname_e);
		 System.out.println("Cart page product name :"+ cartproduct);
		 
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Verify the name of product on cart page and ADP page are same or not");
		 Assert.assertTrue(cartproduct.equalsIgnoreCase(util.getTestData("ProductSelected")));
		 
		 System.out.println("Fabric ADP: " + coverselected );
		 
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Getting the fabric name of the added product in cart page");
		 String fabric = getText(cart1stproductfabricname_e);
		 System.out.println("Fabric cart: " + lower_casestring(fabric) );
		
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Verify the fabric name of product on cart page and ADP page are same or not");
		 Assert.assertTrue(lower_casestring(fabric).contains(coverselected));
		
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Getting the time of added product from cart page");
		 String timeadded = getText(productaddedtime_e);
		 String date1 = timeadded.substring(15, 25);
		 String time1 = date1 + " "+ timeadded.substring(29);
		 System.out.println(time1);
		 
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Verify the time of product on cart page and added on ADP page are same or not");
		 Assert.assertTrue(cdt.equalsIgnoreCase(time1));
		 
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Getting the price of product from cart page");
		 String str1  = getText(cart1stproductpricename_e);
		 str1 = replacecharachter(str1);
		 double productprice = Double.parseDouble(str1);
		 System.out.println(productprice);
		 
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Verify the price of product on cart page and ADP page are same or not");
		 Assert.assertTrue(pricedigit == productprice);
		 
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Clicking the +  6 time and getting price each time");
		 for (int j = 1; j<6; j++ ){
		 
			 clickevent(cartqtyinc1stproduct_e);
			 Thread.sleep(1000);
			 pricematch(j);
		 }
		 
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Clicking the - 5 times and getting price each time");
		 for (int l = 5; l>0; l-- ){
			 
			 clickevent(cartqtydec1stproduct_e);
			 Thread.sleep(1000);
			 if(l-1!=0){
			 pricematch(l-1);
			 }
		 }
		 
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Adding services");
		 clickevent(addservice_e);
		 Thread.sleep(1000);
		 
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Getting price of shipping");
		 double shipping = Double.parseDouble(replacecharachter(getText(shippingprice_e)));
		 System.out.println(shipping);
		 
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Getting price of service added");
		 double servicecharge = Double.parseDouble(replacecharachter(getText(serviceprice_e)));
		 System.out.println(servicecharge);
		
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Getting Grand total price ");
		 double total = Double.parseDouble(replacecharachter(getText(totalpriceincldship_e)));
		 System.out.println(total);
		 pricedigit = pricedigit + shipping + servicecharge;
		 System.out.println(pricedigit);
		 
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Verify the total price of product is displaying correct or not");
		 Assert.assertTrue(pricedigit == total);
		
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Click on minus button trying to handle alert");
		 removeproduct();
		 Thread.sleep(3000);
		 
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that on deleting product from cart page, page is empty or not");
		 Assert.assertTrue(elementPresentOrNot(emptycartpage_e));
		 return status;
	}

	public static void pricematch(int j ) throws InterruptedException{
		
		 String str1  = getText(cart1stproductpricename_e);
		 str1 = replacecharachter(str1);
		 double productprice = Double.parseDouble(str1);
		 
		 String str2 = getText(prd_totalprice_e);
		 Thread.sleep(1000);
		 str2 = replacecharachter(str2);
	 	 
	 	 
	 	 double totalprdprice1 = Double.parseDouble(str2);
	 	 double totalprdprice = (productprice * (j+1));
	 	 System.out.println(totalprdprice);
	  	 System.out.println(totalprdprice1);
	     Thread.sleep(1000);
	     
	     ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that price which is displaying on increasing quantity as calculation or not");
	  	 Assert.assertTrue(totalprdprice1 == totalprdprice);
	  	 
	  	System.out.println(getText(cart_counter_e));
	  	 System.out.println(getText(prdqtycounter_e));
	  	 
	  	 ExtentTestManager.getTest().log(LogStatus.INFO, "Verify the counter value is same as quantity in info box or not");
	  	 Assert.assertTrue(getText(cart_counter_e).equalsIgnoreCase(getText(prdqtycounter_e)));
	 
	}
	
	public static void removeproduct() throws InterruptedException{
		try 
	    { 
		  ExtentTestManager.getTest().log(LogStatus.INFO, "Click on minus button");
		  clickevent(cartqtydec1stproduct_e);
		 
		   ExtentTestManager.getTest().log(LogStatus.INFO, "Switching to alert box");
		  
		   Alert alert = driver.switchTo().alert();
		  
		   Thread.sleep(2000);
	       String al = alert.getText();
	       
	       ExtentTestManager.getTest().log(LogStatus.INFO, "Verify the message displaying in alert box is correct or not");
	       Assert.assertTrue(al.equalsIgnoreCase(alertmesg));
	       
	       System.out.println("String is matched");
	       
	       ExtentTestManager.getTest().log(LogStatus.INFO, "Closing the alert box");
	       alert.dismiss();
	       
	       ExtentTestManager.getTest().log(LogStatus.INFO, "Again click on minus button");
	       clickevent(cartqtydec1stproduct_e);
	       Thread.sleep(2000);
	       
	       ExtentTestManager.getTest().log(LogStatus.INFO, "Click OK on alert box and deleting the product from the cart");
	       alert.accept();
	        
	        
	    }  
	    catch (NoAlertPresentException Ex) 
	    { 
	         Ex.printStackTrace();
	    }
	}
	
}
