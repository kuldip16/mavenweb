package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.FooterLinks;
import UtilityMobile.BaseMobile;
import UtilityMobile.ExtentTestManager;

import com.relevantcodes.extentreports.LogStatus;

public class FooterVerify extends BaseMobile {

@Test (enabled = true)
	
	public void ServiceLinkVerify() throws InterruptedException{
	
		verifyfooter(FooterLinks.OurServicesXpath, FooterLinks.ServiceText, FooterLinks.ServicePTitle);
	}


@Test (enabled = true)

public void PaymentLinkVerify() throws InterruptedException{

	verifyfooter(FooterLinks.PaymentXpath, FooterLinks.PaymentText, FooterLinks.PaymentPTitle);
}


@Test (enabled = true)

public void ShippingLinkVerify() throws InterruptedException{

	verifyfooter(FooterLinks.ShippingXpath, FooterLinks.ShippingText, FooterLinks.ShippingPTitle);
}

@Test (enabled = true)

public void FAQLinkVerify() throws InterruptedException{

	verifyfooter(FooterLinks.FAQXpath, FooterLinks.FAQText, FooterLinks.FAQPTitle);

}

	
public static void verifyfooter(String st1, String st2, String st3) throws InterruptedException{
		
		
		
        Thread.sleep(3000);
		boolean getstatus =	FooterLinks.VerifyTextLink(st1,st2,st3);
		Assert.assertTrue(getstatus);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Page is successfully opened");
	}

	
}
