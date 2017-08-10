package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.FooterLinks;
import UtilityMobile.ExtentTestManager;
import UtilityMobile.BaseMobile;


public class VerifyFooterLinks1 extends BaseMobile {
	
	@Test (enabled = true)
	
	public void testBestellungenfooterlinks() throws InterruptedException{
	
		verifyfooter(FooterLinks.OurServicesXpath, FooterLinks.FAQText, FooterLinks.FAQPTitle);

	}
	
public static void verifyfooter(String st1, String st2, String st3) throws InterruptedException{
		
		
		//login_in();
		ExtentTestManager.getTest().log(LogStatus.INFO, "User is logined now");
		Thread.sleep(3000);
			
		ExtentTestManager.getTest().log(LogStatus.INFO, "After lofin verify " + st2 + "link in footer");
		ExtentTestManager.getTest().log(LogStatus.INFO, "After lofin verify on clicking link page is opening or not");
		boolean getstatus =	FooterLinks.VerifyTextLink(st1,st2,st3);
		Assert.assertTrue(getstatus);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Page is successfully opened");
	}

}
