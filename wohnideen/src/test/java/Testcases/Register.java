package Testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.Homepage;
import UtilityMobile.AppUtil;
import UtilityMobile.BaseMobile;
import UtilityMobile.ExtentTestManager;
import UtilityMobile.utilMobile;


public class Register extends BaseMobile {
	
	/*@Test
	 public static void registrationprocess() throws InterruptedException {
		
		  driver.navigate().refresh();
		  utilMobile.wait(1000);
		  
		  utilMobile.clickevent(Homepage.meinprofile);
		  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on meinprofile.");
		   utilMobile.wait(3000);
		  utilMobile.clickevent(Homepage.Jetztregistrieren);
		  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on anmelden link.");
		  utilMobile.wait(3000);
		  AppUtil.register();
	
	}*/
	@Test
	 public static void experteregister() throws InterruptedException {
		
		  AppUtil.Experteregister();
	
	}
}
