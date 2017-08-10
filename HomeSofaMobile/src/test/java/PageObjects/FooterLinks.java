package PageObjects;

import org.testng.Reporter;

import com.relevantcodes.extentreports.LogStatus;

import UtilityMobile.BaseMobile;
import UtilityMobile.ExtentTestManager;
import UtilityMobile.utilMobile;

public class FooterLinks extends BaseMobile {
	
	public static String OurServicesXpath = "//div[@class = 'nw-footer-link']/a/span";
	public static String PaymentXpath = "//div[@class = 'nw-footer-link']/a[2]/span";
	public static String ShippingXpath = "//div[@class = 'nw-footer-link']/a[3]/span";
	public static String FAQXpath = "//div[@class = 'nw-footer-link']/a[4]/span";
	
	
	public static String ServiceText = "UNSER SERVICE";
	public static String PaymentText = "DIE ZAHLUNGSARTEN";
	public static String ShippingText = "DIE LIEFERUNG ZU IHNEN";
	public static String FAQText = "HÄUFIG GESTELLTE FRAGEN";

	public static String ServicePTitle = "Service - Homesofa.de";
	public static String PaymentPTitle = "Zahlungsmöglichkeiten - Homesofa.de";
	public static String ShippingPTitle = "Lieferung - Homesofa.de";
	public static String FAQPTitle = "Häufig gestellte Fragen - Homesofa.de";
	
	
public static boolean VerifyTextLink(String element , String linkexpectedtext, String pagetitle){
		
		boolean status = true;
		
		String actualtext = utilMobile.getText(element).trim();
		//String st2 = st1.trim();
		System.out.println(actualtext);
		System.out.println(linkexpectedtext);
		//comparing the actual text with expected text
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "Verify the link is matching with footer text " + linkexpectedtext );
		if(actualtext.contains(linkexpectedtext)){
			ExtentTestManager.getTest().log(LogStatus.INFO, "Click the link: " + linkexpectedtext );
			utilMobile.clickevent(element);
			
			System.out.println("link is clicked");
		
		}
		
		//utilMobile.pagescroll(15000);
		ExtentTestManager.getTest().log(LogStatus.INFO, linkexpectedtext + "Link is clicked ");
		System.out.println("user has clicked the link " + actualtext );
			
			
    	 //verifying that page is navigating to page not found page or not
    	   if(driver.getTitle().contains("Fehler 404")){
    		   System.out.println(linkexpectedtext + " page is broken");
    		   ExtentTestManager.getTest().log(LogStatus.INFO, linkexpectedtext + " page is broken");
    		   Reporter.log(linkexpectedtext + " page is broken");
    		   status = false;
    	   }
		
		
		//comparing the page actual page title with expected page title
 	   else if(driver.getTitle().contains(pagetitle))
 	   {
 		   System.out.println("Page Title is : " + driver.getTitle());
 		  ExtentTestManager.getTest().log(LogStatus.INFO, linkexpectedtext + "Page Title is : " + driver.getTitle());
 		   Reporter.log("Page Title is : " + driver.getTitle());
 	   }
 	   else{
 		  ExtentTestManager.getTest().log(LogStatus.INFO, linkexpectedtext + "Page title is incorrect"+ " "+ driver.getTitle());
 		   System.out.println("Page title is incorrect"+ " "+ driver.getTitle());
 		   status= false;
 	   }
 	 //finding the expected heading of the page exist on page or not
 	   if(driver.getPageSource().contains(linkexpectedtext)){
 		  ExtentTestManager.getTest().log(LogStatus.INFO, linkexpectedtext + "Page is correct");
 		   System.out.println(linkexpectedtext + " Page is correct");
 		   
 	   }
 	   else{
 		  System.out.println(linkexpectedtext + " Page is incorrect");
 		 ExtentTestManager.getTest().log(LogStatus.INFO, linkexpectedtext + " Page is incorrect");
 		   Reporter.log(linkexpectedtext + " Page is incorrect");
 		  status = false;
 	   }
 	   
    
		
	return status;
	}

	
	
}
