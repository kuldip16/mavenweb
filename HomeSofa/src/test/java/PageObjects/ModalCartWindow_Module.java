package PageObjects;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import Utility.Base;
import Utility.ExtentTestManager;
import Utility.util;

public class ModalCartWindow_Module extends util {
	
public static boolean cartwindow() throws InterruptedException, AWTException{
		
	boolean status = true;
	double pricedigit = 0;
	
	
	mousehover(Ecksofas_Wohnlandschaften_e);
	ExtentTestManager.getTest().log(LogStatus.INFO, "clicking on Wohnlandschaften category");
	clickevent(wohnlandschaft_sc_e);
	Thread.sleep(4000);
	
	mousehover(number_element_e);
	Thread.sleep(4000);
	
	clickevent(element_48_e); 
	getelement(util.getTestData("ProductSelected"), productnamelist);
	/* List<WebElement> drop = driver.findElements(By.xpath(productnamelist));
	 String CategoryPageProductName =  util.getTestData("FabricProduct");
	 java.util.Iterator<WebElement> i = drop.iterator();
	
	 while(i.hasNext()) {
		    WebElement row = i.next();
		    String str = row.getText();
		
		    if(str.equalsIgnoreCase(CategoryPageProductName)){
			   ExtentTestManager.getTest().log(LogStatus.INFO, "clicking on product " + CategoryPageProductName);
			   row.click();
		    		break;
		    		}
		}*/
		Thread.sleep(5000); 
		ExtentTestManager.getTest().log(LogStatus.INFO, "Getting the product name from ADP page");
		//On ADP page getting the Category and Product name productname_e
		String str = getText(productname_e);
		String str1 = IDgetText(productcategoryname_e);
		String product_name = str1+" "+str;
		//Verifying the product name on category page and on ADP page are same or not
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "Verifying the product name on category page and on ADP page are same or not");
		if(util.getTestData("ProductSelected").equalsIgnoreCase(product_name)) {
			
            String str3 = getattribute(price_adp_e, "content");
            pricedigit = Double.parseDouble(str3);
			//Storing the price of the product from ADP page 
			System.out.println(str3);
			ExtentTestManager.getTest().log(LogStatus.INFO, "The price of product is "+ str3);
			clickevent(Short_callbackoverlay_e);
			pagescroll(400);
			/*JavascriptExecutor jse = (JavascriptExecutor)driver;
	    	jse.executeScript("window.scrollBy(0,400)","");*/
			Thread.sleep(5000);
			
			ExtentTestManager.getTest().log(LogStatus.INFO, "adding the function in the product");
			clickevent(Schlaffunktion_Bettkasten_funk_e);
			ExtentTestManager.getTest().log(LogStatus.INFO, "getting the name of selected function");
			String function = getText(Schlaffunktion_Bettkasten_funk_e);
			String split[] = function.split("\\n");
			split[0] = split[0].replace(" entfernen","");
			split[0] = split[0].toLowerCase();
			System.out.println(replacecharachter(function));
			pricedigit = pricedigit + Double.parseDouble(replacecharachter(function));
			int j = (int)pricedigit;
			str3 = Integer.toString(j);
			System.out.println(str3);
			ExtentTestManager.getTest().log(LogStatus.INFO, "The price of product is after adding function "+split[0]+" :"+ str3);
			
			ExtentTestManager.getTest().log(LogStatus.INFO, "getting the name of selected fabric");
			String coverselected =	getattribute(selectedFabric_e, "title");
			coverselected = coverselected.toLowerCase();
		    coverselected = coverselected.replaceAll("\\s+$", "");
			
		    ExtentTestManager.getTest().log(LogStatus.INFO, "getting the name of selected direction");
		    String directionselected = getattribute(selecteddirection_e,"analytics_data");
		    directionselected = directionselected.toLowerCase();
		    
		    ExtentTestManager.getTest().log(LogStatus.INFO, "Product is adding to cart");
     	    cartadd();  //Adding the product to cart
		    Thread.sleep(5000);
		    
		    ExtentTestManager.getTest().log(LogStatus.INFO, "getting the name of added product from the modal cart window");
		    String str2 = getText(popup_product_name_e); //Getting the name of the product from cart popup
	        System.out.println(str2);
	        
	        ExtentTestManager.getTest().log(LogStatus.INFO, "getting all the data of added product from the cart window");
	        String allfunctionaldata = getText(functiondata_e);
	        
	        allfunctionaldata = allfunctionaldata.toLowerCase();
	        
	        
	        System.out.println(allfunctionaldata);
	        
	        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that fabric chosen same function added in product or not");
	        Assert.assertTrue(allfunctionaldata.contains(split[0]));
	        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that fabric chosen same fabric added in product or not");
	        Assert.assertTrue(allfunctionaldata.contains(coverselected));
	        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that fabric chosen same direction added in product or not");
	        Assert.assertTrue(allfunctionaldata.contains(directionselected));
	      	        	        
	        String ActualP = replacecharachter(getText(popup_product_price_e)); //Getting the price of the product from cart popup
	        System.out.println(ActualP);
	        ExtentTestManager.getTest().log(LogStatus.INFO, "The price of product is after adding function "+ ActualP);
	        
	        //Verifying the price and name on cart popup and ADP page are same or not 
	        ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that product is correct or not and Price is same or not as it os ADP page");
	       if(product_name.equalsIgnoreCase(str2) && str3.equalsIgnoreCase(ActualP)){
    		
	    	   System.out.println("Test is case is passed name and price are same");    		
    		  
    	  	 }
	       
    	   else{
    	
    		   System.out.println("test case is failed, name and price are not same");
    		   status = false;
    	     }
    	
		}
		
		else{
    	
			System.out.println("test case is failed name of product is incorrect");
			status = false;
    	}
		return status;
		
	}

public void multiproductcart() throws InterruptedException, AWTException{

int b;
double i = 0;
double j = 0;
for(b=1;b<11;b++){
	String s = Integer.toString(b);
	mousehover(Ecksofas_Wohnlandschaften_e);
	clickevent(wohnlandschaft_sc_e);
	String categoryproduct = product_e(s);
	Thread.sleep(8000);
	clickevent(categoryproduct);
	String str = getText(productname_e);
	String str1 = IDgetText(productcategoryname_e);
	String product_name = str1+" "+str;
	String str3 = getattribute(price_adp_e, "content");
	System.out.println(product_name +" Price is "+ str3);
	i = Double.parseDouble(str3);
	j = j + i;
	System.out.println(b+" Product price is  "+j);
	cartadd();
	Thread.sleep(5000);
	
	String str2 = getText(popup_product_name_e);
    //System.out.println(str2);
	if(product_name.equalsIgnoreCase(str2)){
		//System.out.println("Test is case is passed");
	    clickevent(backbutton_e);
	}
	else{
		
		System.out.println("test case is failed");
	}
	
	String cartcounter = getText(cart_counter_e);
	if(cartcounter.equalsIgnoreCase(s)){
		
		System.out.println("counter value is : "+ cartcounter);
	}
	else{
		System.out.println("counter value is incorrect:" + cartcounter);
	}
}

int h = (int) j;
String s = getText(subtottal_e);
String subtotal = replacecharachter(s);
String alltotal = Integer.toString(h);
System.out.println("All product total is: "+subtotal);
System.out.println("popup total is: "+alltotal);
if(subtotal.equalsIgnoreCase(alltotal)){
	System.out.println("price is same" );
}
else{

	System.out.println("Price is not match with subtoatl");
	
}
}


}
