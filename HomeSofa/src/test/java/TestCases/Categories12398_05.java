package TestCases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Utility.Base;
import Utility.ExtentTestManager;
import Utility.util;

public class Categories12398_05 extends Base {
  
@Test
  
public void verifyCategoryNames() {
	  
	 
util.elementPresentOrNot(categoryLinkEcksofasWohnlandschaften);
	  
ExtentTestManager.getTest().log(LogStatus.PASS, "Category link Ecksofas & Wohnlandschaften exists");
	  
	 
 util.elementPresentOrNot(categoryLinkEinzelsofas);
	 
 ExtentTestManager.getTest().log(LogStatus.PASS, "Category link Einzelsofas exists");
	  
	
  util.elementPresentOrNot(categoryLinkSesselHocker);
	  
ExtentTestManager.getTest().log(LogStatus.PASS, "Category link Sessel & Hocker exists");
	  
	  
 
 }

}
