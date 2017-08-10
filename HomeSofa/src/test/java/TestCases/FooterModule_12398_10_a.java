package TestCases;



import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Utility.Base;
import Utility.ExtentTestManager;
import Utility.util;
import PageObjects.FooterLinks;
import PageObjects.RegistrationLogin;

public class FooterModule_12398_10_a extends Base {

	//verify Ihre Bestellungen link
	@Test (enabled = false)
	public void testBestellungenfooterlinks() throws InterruptedException{
	
		verifyfooter(footer_order_e, exp_footer_order_link, exp_order_ptitle);
		/*login_in();
		ExtentTestManager.getTest().log(LogStatus.INFO, "User is logined now");
		Thread.sleep(3000);
		pagescroll(800);	
		ExtentTestManager.getTest().log(LogStatus.INFO, "After lofin verify Ihre Bestellungen link in footer");
		ExtentTestManager.getTest().log(LogStatus.INFO, "After lofin verify on clicking link page is opening or not");
		boolean getstatus =	FooterLinks.VerifyTextLink(footer_order_e,exp_footer_order_link,exp_order_ptitle);
		Assert.assertTrue(getstatus);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Page is successfully opened");*/
	}

	//verify Ihre persönlichen Daten link
	@Test (enabled = false)
	public void testpersonlichen_Datenfooterlinks() throws InterruptedException{
	
		verifyfooter(footer_personalinfo_e,exp_footer_personalinfo_link,exp_personalinfo_ptitle);
		/*login_in();
		ExtentTestManager.getTest().log(LogStatus.INFO, "User is logined now");
		Thread.sleep(3000);
		pagescroll(594);	
		ExtentTestManager.getTest().log(LogStatus.INFO, "After lofin verify personal info link in footer");
		ExtentTestManager.getTest().log(LogStatus.INFO, "After lofin verify on clicking link page is opening or not");
		boolean getstatus =	FooterLinks.VerifyTextLink(footer_personalinfo_e,exp_footer_personalinfo_link,exp_personalinfo_ptitle);
		Assert.assertTrue(getstatus);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Page is successfully opened");*/
	}
	
	//verify Lieferung link
	@Test (enabled = true)
	public void testdeilverynfooterlinks() throws InterruptedException{
	
		verifyfooter(footer_delivery_e,exp_footer_delivery_link,exp_footer_delivery_ptitle);
		
		/*pagescroll(594);	
		ExtentTestManager.getTest().log(LogStatus.INFO, "After lofin verify Lieferung link in footer");
		ExtentTestManager.getTest().log(LogStatus.INFO, "After lofin verify on clicking link page is opening or not");
		boolean getstatus =	FooterLinks.VerifyTextLink(footer_delivery_e,exp_footer_delivery_link,exp_footer_delivery_ptitle);
		Assert.assertTrue(getstatus);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Page is successfully opened");*/
	}
	
	//verify Garantie & Reparatur link
	@Test (enabled = false)
	public void testWarrantyfooterlinks() throws InterruptedException{
	
		verifyfooter(footer_warranty_e,exp_footer_warranty_link,exp_footer_warranty_ptitle);
		/*pagescroll(594);	
		ExtentTestManager.getTest().log(LogStatus.INFO, "After lofin verify personal info link in footer");
		ExtentTestManager.getTest().log(LogStatus.INFO, "After lofin verify on clicking link page is opening or not");
		boolean getstatus =	FooterLinks.VerifyTextLink(footer_warranty_e,exp_footer_warranty_link,exp_footer_warranty_ptitle);
		Assert.assertTrue(getstatus);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Page is successfully opened");*/
	}
	
	//verify Mitnahme und Entsorgung link
	@Test (enabled = true)
	public void testentrainmentfooterlinks() throws InterruptedException{
	
		verifyfooter(footer_entrainment_e,exp_footer_entrainment_link,exp_footer_entrainment_ptitle);
		/*pagescroll(594);	
		ExtentTestManager.getTest().log(LogStatus.INFO, "After lofin verify personal info link in footer");
		ExtentTestManager.getTest().log(LogStatus.INFO, "After lofin verify on clicking link page is opening or not");
		boolean getstatus =	FooterLinks.VerifyTextLink(footer_entrainment_e,exp_footer_entrainment_link,exp_footer_entrainment_ptitle);
		Assert.assertTrue(getstatus);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Page is successfully opened");*/
	}
	
	//verify Häufig gestellte Fragen link
	@Test (enabled = false)
	public void testFAQtfooterlinks() throws InterruptedException{
	
		verifyfooter(footer_faq_e,exp_footer_faq_link,exp_footer_faq_ptitle);
		/*pagescroll(594);	
		ExtentTestManager.getTest().log(LogStatus.INFO, "After lofin verify personal info link in footer");
		ExtentTestManager.getTest().log(LogStatus.INFO, "After lofin verify on clicking link page is opening or not");
		boolean getstatus =	FooterLinks.VerifyTextLink(footer_faq_e,exp_footer_faq_link,exp_footer_faq_ptitle);
		Assert.assertTrue(getstatus);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Page is successfully opened");*/
	}
	
	//verify Pflegetipps link
	@Test (enabled = false)
	public void testCareTipstfooterlinks() throws InterruptedException{
	
		verifyfooter(footer_tips_e,exp_footer_tips_link,exp_footer_tips_ptitle);
		/*pagescroll(594);	
		ExtentTestManager.getTest().log(LogStatus.INFO, "After lofin verify personal info link in footer");
		ExtentTestManager.getTest().log(LogStatus.INFO, "After lofin verify on clicking link page is opening or not");
		boolean getstatus =	FooterLinks.VerifyTextLink(footer_tips_e,exp_footer_tips_link,exp_footer_tips_ptitle);
		Assert.assertTrue(getstatus);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Page is successfully opened");*/
	}
	
	//verify Kontakt link
	@Test (enabled = false)
	public void testContactfooterlinks() throws InterruptedException{
	
		verifyfooter(footer_contact_e,exp_footer_contact_link,exp_footer_contact_ptitle);
/*		pagescroll(594);	
		ExtentTestManager.getTest().log(LogStatus.INFO, "After lofin verify personal info link in footer");
		ExtentTestManager.getTest().log(LogStatus.INFO, "After lofin verify on clicking link page is opening or not");
		boolean getstatus =	FooterLinks.VerifyTextLink(footer_contact_e,exp_footer_contact_link,exp_footer_contact_ptitle);
		Assert.assertTrue(getstatus);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Page is successfully opened");*/
	}
	
	//verify AGB & Impressum link
	@Test (enabled = false)
	public void testAGBfooterlinks() throws InterruptedException{
	
		verifyfooter(footer_AGB_e,exp_footer_AGB_link,exp_footer_AGB_ptitle);
/*		pagescroll(594);	
		ExtentTestManager.getTest().log(LogStatus.INFO, "After lofin verify personal info link in footer");
		ExtentTestManager.getTest().log(LogStatus.INFO, "After lofin verify on clicking link page is opening or not");
		boolean getstatus =	FooterLinks.VerifyTextLink(footer_AGB_e,exp_footer_AGB_link,exp_footer_AGB_ptitle);
		Assert.assertTrue(getstatus);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Page is successfully opened");*/
	}
	
	//verify Datenschutz link
	@Test (enabled = false)
	public void testdata_protectionfooterlinks() throws InterruptedException{
	
		verifyfooter(footer_data_protection_e,exp_footer_data_protection_link,exp_footer_data_protection_ptitle);
/*		ExtentTestManager.getTest().log(LogStatus.INFO, "After lofin verify personal info link in footer");
		ExtentTestManager.getTest().log(LogStatus.INFO, "After lofin verify on clicking link page is opening or not");
		boolean getstatus =	FooterLinks.VerifyTextLink(footer_data_protection_e,exp_footer_data_protection_link,exp_footer_data_protection_ptitle);
		Assert.assertTrue(getstatus);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Page is successfully opened");*/
	}
	
	//verify Zahlungsarten link
	@Test (enabled = false)
	public void testPaymentsfooterlinks() throws InterruptedException{
	
		verifyfooter(footer_payments_e,exp_footer_payments_link,exp_footer_payments_ptitle);
		/*pagescroll(594);	
		ExtentTestManager.getTest().log(LogStatus.INFO, "After lofin verify personal info link in footer");
		ExtentTestManager.getTest().log(LogStatus.INFO, "After lofin verify on clicking link page is opening or not");
		boolean getstatus =	FooterLinks.VerifyTextLink(footer_payments_e,exp_footer_payments_link,exp_footer_payments_ptitle);
		Assert.assertTrue(getstatus);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Page is successfully opened");*/
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
