package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import PageObjects.HomePage;
import PageObjects.LeftNavigationMenu;
import PageObjects.MeinKonto;
import UtilityMobile.ExtentTestManager;
import UtilityMobile.BaseMobile;
import UtilityMobile.utilMobile;

public class Login extends BaseMobile {
	
  @Test
  public static void loginTest() {
	  
	  String actualTextLogin = null;
	  
	  utilMobile.clickevent(HomePage.menu);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on left navigation menu.");
	  
	  try {
		Thread.sleep(5000);
	   } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	  utilMobile.clickevent(LeftNavigationMenu.loginLink);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on login link.");
	  
	  LeftNavigationMenu.login(utilMobile.getTestData("loginEmail"), utilMobile.getTestData("loginPassword"));
	  
	  actualTextLogin = utilMobile.getText(MeinKonto.meinKonto);
	  
	  if(actualTextLogin.equalsIgnoreCase(utilMobile.getTestData("loginVerify"))){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "logged in successfully."); 
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Login failed.");
	  }
	    
	  
  }
  
  
  @Test (enabled=false)
  public void loginBlockerCheck(){
	  
	  String errorText = null;
	  utilMobile.clickevent(HomePage.menu);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on left navigation menu.");
	  
	  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	  utilMobile.clickevent(LeftNavigationMenu.loginLink);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on login link.");
	  
	  driver.findElement(By.xpath(LeftNavigationMenu.email)).sendKeys(utilMobile.getTestData("loginEmail"));
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Entered email id.");
		
	  driver.findElement(By.xpath(LeftNavigationMenu.loginSubmit)).click();
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on submit button.");
	  
	  errorText = utilMobile.getText(LeftNavigationMenu.passwordRequired);
	  
	  if(errorText.equalsIgnoreCase(utilMobile.getTestData("passwordRequired"))){
		  
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Not bale to login without password.");
		  
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FATAL, "Logged-in without password."); 
	  }
	  
  }
}
