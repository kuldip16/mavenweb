package PageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.LogStatus;
import UtilityMobile.BaseMobile;
import UtilityMobile.ExtentTestManager;

import UtilityMobile.utilMobile;



public class Homepage extends BaseMobile {
	
	//public static String meinprofile =".//*[@id='User-Login-Profile']";
	public static String meinprofile ="html/body/div[1]/div[2]/div/div[6]/div[1]/div[1]/span/a";
	//public static String Jetztregistrieren =".//*[@id='userAccessJson']/div[2]/div[1]/div/div[1]/u";
	public static String Jetztregistrieren ="html/body/div[1]/div[2]/div/div[6]/div[1]/div[1]/div[1]/div[2]/div[1]/div/div[1]/u";
	public static String anmelden =".//*[@id='userAccessJson']/div[2]/div[1]/div/div[2]";
	public static String userprofile =".//*[@id='userAccessJson']/div[2]/div[1]/div/span[1]";
	public static String popup ="html/body/div[5]/div[2]/div[3]/div/div[2]/a[1]";
	
	

public static void userlogin(String link){
	
	  utilMobile.clickevent(meinprofile);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on meinprofile");
	  utilMobile.clickevent(link);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on anmelden");
	
}

}
