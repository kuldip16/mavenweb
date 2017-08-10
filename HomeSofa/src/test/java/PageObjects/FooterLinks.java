package PageObjects;

import org.testng.Reporter;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import Utility.Base;
import Utility.util;

public class FooterLinks extends util{

	public static boolean VerifyTextLink(String element , String linktext, String pagetitle){
		
		boolean status = true;
		 //verify footer "Ihre Bestellungen" link 
		String st1 = getText(element);
		System.out.println(st1);
		System.out.println(linktext);
		//comparing the actual text with expected text
		if(st1.equalsIgnoreCase(linktext)){
			if(linktext.equalsIgnoreCase("Ihre Bestellungen")||linktext.equalsIgnoreCase("Ihre persönlichen Daten")){
				login_in();
			}
			else{
				clickevent(Short_callbackoverlay_e);
			}
			pagescroll(594);
			clickevent(element);
			System.out.println("user has clicked the link " + st1 );
			
			
    	 //verifying that page is navigating to page not found page or not
    	   if(driver.getTitle().contains("Fehler 404")){
    		   System.out.println(linktext + " page is broken");
    		   Reporter.log(linktext + " page is broken");
    		   status = false;
    	   }
		
		
		//comparing the page actual page title with expected page title
 	   else if(driver.getTitle().contains(pagetitle))
 	   {
 		   System.out.println("Page Title is : " + driver.getTitle());
 		   Reporter.log("Page Title is : " + driver.getTitle());
 	   }
 	   else{
 		   System.out.println("Page title is incorrect");
 		   status= false;
 	   }
 	 //finding the expected heading of the page exist on page or not
 	   if(driver.getPageSource().contains(linktext)){
 		   System.out.println(linktext + " Page is correct");
 		   
 	   }
 	   else{
 		  System.out.println(linktext + " Page is incorrect");
 		   Reporter.log(linktext + " Page is incorrect");
 		  status = false;
 	   }
 	   
    }  
		else{
			System.out.println("link is incorrect " + st1 );
			status = false;
		}
	return status;
	}

}
