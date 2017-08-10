package TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.HomePage;
import PageObjects.LeftNavigationMenu;
import PageObjects.MeinKonto;
import UtilityMobile.BaseMobile;
import UtilityMobile.ExtentTestManager;
import UtilityMobile.utilMobile;

public class Registration extends BaseMobile {
	
  @Test (enabled=true)
  public void createAccount() {
	  
	  String actualTextRegistration = null;
	  
	  utilMobile.clickevent(HomePage.menu);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on left navigation menu.");
	  
	  utilMobile.clickevent(LeftNavigationMenu.registerNowXpath);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on register now button.");
	  
	  LeftNavigationMenu.registration();
	  
	  actualTextRegistration = utilMobile.getText(MeinKonto.meinKonto);
	  
	  if(actualTextRegistration.equalsIgnoreCase(utilMobile.getTestData("loginVerify"))){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Registration successful."); 
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Registration Failed.");
	  }
	  
  }
  
  @Test
  public void registrationMandatoryFieldsCheck(){
	    String expectedVal = "Fehler:";
	    String actualVal = null;
	  
	    String emailId = utilMobile.getTestData("email")+utilMobile.getRandomNumberInRange(11, 99999)+"@mailinator.com";
	  
	    utilMobile.clickevent(HomePage.menu);
	    ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on left navigation menu.");
		  
		utilMobile.clickevent(LeftNavigationMenu.registerNowXpath);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on register now button.");
		  
	    driver.findElement(By.xpath(LeftNavigationMenu.firstNameXpath)).sendKeys(utilMobile.getTestData("firstName"));
		ExtentTestManager.getTest().log(LogStatus.INFO, "Entered first name.");
		
		driver.findElement(By.xpath(LeftNavigationMenu.lastNameXpath)).sendKeys(utilMobile.getTestData("lastName"));
		ExtentTestManager.getTest().log(LogStatus.INFO, "Entered last name.");
		
		driver.findElement(By.xpath(LeftNavigationMenu.password)).sendKeys(utilMobile.getTestData("password"));
		ExtentTestManager.getTest().log(LogStatus.INFO, "Entered password.");
		
		driver.findElement(By.xpath(LeftNavigationMenu.registrationSubmitXpath)).click();
		ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on submit registration.");
		
		actualVal = utilMobile.getText(LeftNavigationMenu.errorXpath);
		
		Assert.assertEquals(actualVal, expectedVal);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Email is mandatory field.");
		/*************************Email Test Completed*********************************************/
		
		utilMobile.clearText(LeftNavigationMenu.password);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Cleared Password.");
		
		driver.findElement(By.xpath(LeftNavigationMenu.email)).sendKeys(emailId);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Entered email.");
		
		driver.findElement(By.xpath(LeftNavigationMenu.registrationSubmitXpath)).click();
		ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on submit registration.");
		
		actualVal = utilMobile.getText(LeftNavigationMenu.errorXpath);
		
		Assert.assertEquals(actualVal, expectedVal);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Password is mandatory field.");
		/*************************Password Test Completed*********************************************/
		
		utilMobile.clearText(LeftNavigationMenu.firstNameXpath);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Cleared First name.");
		
		driver.findElement(By.xpath(LeftNavigationMenu.password)).sendKeys(utilMobile.getTestData("password"));
		ExtentTestManager.getTest().log(LogStatus.INFO, "Entered password.");
		
		driver.findElement(By.xpath(LeftNavigationMenu.registrationSubmitXpath)).click();
		ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on submit registration.");
		
		actualVal = utilMobile.getText(LeftNavigationMenu.errorXpath);
		
		Assert.assertEquals(actualVal, expectedVal);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Firstname is mandatory field.");
		/*************************Firstname Test Completed*********************************************/
		
		utilMobile.clearText(LeftNavigationMenu.lastNameXpath);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Cleared Last name.");
		
		driver.findElement(By.xpath(LeftNavigationMenu.firstNameXpath)).sendKeys(utilMobile.getTestData("firstName"));
		ExtentTestManager.getTest().log(LogStatus.INFO, "Entered first name.");
		
		driver.findElement(By.xpath(LeftNavigationMenu.password)).sendKeys(utilMobile.getTestData("password"));
		ExtentTestManager.getTest().log(LogStatus.INFO, "Entered password.");
		
		driver.findElement(By.xpath(LeftNavigationMenu.registrationSubmitXpath)).click();
		ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on submit registration.");
		
		actualVal = utilMobile.getText(LeftNavigationMenu.errorXpath);
		
		Assert.assertEquals(actualVal, expectedVal);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Lastname is mandatory field.");
		/*************************Lastname Test Completed*********************************************/
  }
  
}
