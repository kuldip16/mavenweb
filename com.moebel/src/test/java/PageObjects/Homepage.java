package PageObjects;

import utilitypart1.baseclass;
import com.relevantcodes.extentreports.LogStatus;
import utilitypart1.ExtentTestManager;
import utilitypart1.util;



public class Homepage extends baseclass {
	
	public static String meinprofile = 	".//*[@id='User-Login-Profile']";
	public static String anmelden = 	".//*[@id='userAccessJson']/div[2]/div[1]/div/div[2]";
	public static String userprofile = ".//*[@id='userAccessJson']/div[2]/div[1]/div/span[1]";
	
	

public static void userlogin(String emailId, String passwordVal){
	
	
	  util.clickevent(meinprofile);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on meinprofile");
	  util.clickevent(anmelden);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on anmelden");
	  //login.login(utilMobile.getTestData("loginEmail"), utilMobile.getTestData("loginPassword"));
	  //login.login(emailId, passwordVal);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on anmelden");
}

}
