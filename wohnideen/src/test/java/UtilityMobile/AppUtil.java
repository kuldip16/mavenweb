package UtilityMobile;

import PageObjects.Headersearch;
import PageObjects.Homepage;
import PageObjects.registration;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By.ByXPath;
import org.sikuli.script.Keys;

import com.relevantcodes.extentreports.LogStatus;

public class AppUtil extends BaseMobile {
	
	
	
	public static void verify_headersearch(String text1, String text2, String Url){
		
		String searchresult;
		
		searchresult = utilMobile.getText(text1);
		
		  System.out.println(searchresult);
		  
		  if(searchresult.equalsIgnoreCase(text2)){
			  ExtentTestManager.getTest().log(LogStatus.PASS, "result matches, search done successfully."); 
		  }else{
			  ExtentTestManager.getTest().log(LogStatus.FAIL, "Test data doesn't match, search failed.");
		  }
		  driver.navigate().to(Url);
		  utilMobile.wait(1000);
		
	}
        public static void register() throws InterruptedException{
        	String actualTextLogin = null;
        	String emailId = utilMobile.getTestData("email")+utilMobile.getRandomNumberInRange(11, 99999)+"@mailinator.com";
        	String success;
	     	utilMobile.enterText(utilMobile.getTestData("Vorname"), registration.Vorname);
	     	ExtentTestManager.getTest().log(LogStatus.INFO, "Vorname is entered");
	    	utilMobile.enterText(utilMobile.getTestData("Nachname"), registration.Nachname);
	    	ExtentTestManager.getTest().log(LogStatus.INFO, "Nachname is entered");
		    utilMobile.enterText(emailId, registration.Email_field);
		    ExtentTestManager.getTest().log(LogStatus.INFO, "Email is entered");
		    utilMobile.enterText(utilMobile.getTestData("Password"), registration.Password);
		    ExtentTestManager.getTest().log(LogStatus.INFO, "Password is entered");
		    utilMobile.clickevent(registration.Chkbx);
		    ExtentTestManager.getTest().log(LogStatus.INFO, "Checkbox is entered");
		    utilMobile.clickevent(registration.Registerbutton);
		    ExtentTestManager.getTest().log(LogStatus.INFO, "Register button is clicked");
		    System.out.println(emailId);
		    success = utilMobile.getText(registration.successmessage);
		
			  if(success.contains(utilMobile.getTestData("successmessage"))){
				  ExtentTestManager.getTest().log(LogStatus.PASS, "register done successfully.");   
			  }else{
				  ExtentTestManager.getTest().log(LogStatus.FAIL, "register failed.");	    
	}     
			  utilMobile.wait(500);
			  driver.navigate().to("https://www.mailinator.com/");
			  ExtentTestManager.getTest().log(LogStatus.INFO, "mailinator is opened");
			  driver.findElement(By.xpath(registration.mailinatorfield)).sendKeys(emailId);
			  ExtentTestManager.getTest().log(LogStatus.INFO, "Registered email id is entered");
			  utilMobile.clickByXpath(registration.Okbutton);
			  ExtentTestManager.getTest().log(LogStatus.INFO, "Cliekd on Ok button");
			  utilMobile.wait(1000);
			  driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div/div/div/div[2]/div[3]/div/div/div[2]/div[2]/div")).click();
			  ExtentTestManager.getTest().log(LogStatus.INFO, "Cliekd on Activation mail in inbox");
			  System.out.println(driver.getTitle());
			  utilMobile.wait(500);
			  driver.switchTo().frame("publicshowmaildivcontent");
			  ExtentTestManager.getTest().log(LogStatus.INFO, "Switched to mail-frame");
			  driver.findElement(By.xpath("html/body/span[1]/a[1]")).click();
			  ExtentTestManager.getTest().log(LogStatus.INFO, "Cliked on Activation link");
			  
			  
				String parentWindow = driver.getWindowHandle();
				Set<String> handles = driver.getWindowHandles();
				for (String windowHandle : handles) {
					if (!windowHandle.equals(parentWindow)) {
						driver.switchTo().window(windowHandle);

					}
				}
				
				
		/*		utilMobile.clickevent(Homepage.meinprofile);
				ExtentTestManager.getTest().log(LogStatus.INFO, "Cliked on meinprofile");
				utilMobile.wait(500);
				System.out.println("test");
				actualTextLogin = utilMobile.getText(Homepage.userprofile);
				ExtentTestManager.getTest().log(LogStatus.INFO, "Username checked");
				 System.out.println(actualTextLogin);
				
				  if(actualTextLogin.equalsIgnoreCase(utilMobile.getTestData("registerVerify"))){
					  ExtentTestManager.getTest().log(LogStatus.PASS, "Activation done successfully."); 
				  }else{
					  ExtentTestManager.getTest().log(LogStatus.FAIL, "Activation failed.");
				  }
        }
        */
		Thread.sleep(1000);
        driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[6]/div[1]/div[1]/span/a")).click();
        ExtentTestManager.getTest().log(LogStatus.INFO, "Cliked on meinprofile");
    	Thread.sleep(1000);
		actualTextLogin = driver.findElement(By.xpath(".//*[@id='userAccessJson']/div[2]/div[1]/div/span[1]")).getText();
		ExtentTestManager.getTest().log(LogStatus.INFO, "Username checked");
		 System.out.println(actualTextLogin);
		
		 if(actualTextLogin.equalsIgnoreCase(utilMobile.getTestData("registerVerify"))){
			  ExtentTestManager.getTest().log(LogStatus.PASS, "Activation done successfully."); 
		  }else{
			  ExtentTestManager.getTest().log(LogStatus.FAIL, "Activation failed.");
		  }
        }
        
        
        //----------------------------------------------Experte-werden---------------------------------------------------------
        
        public static void Experteregister() throws InterruptedException{
        String emailId = utilMobile.getTestData("email")+utilMobile.getRandomNumberInRange(11, 99999)+"@mailinator.com";	
        driver.navigate().to("https://www.moebel.de/wohnideen/experte-werden");
        ExtentTestManager.getTest().log(LogStatus.INFO, "lended to experte-werden page");
      
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
        utilMobile.scrollTo();
        ExtentTestManager.getTest().log(LogStatus.INFO, "scrolled down to form");
         utilMobile.enterdata(registration.Exp_Firmenname,utilMobile.getTestData("firmname"));
         ExtentTestManager.getTest().log(LogStatus.INFO, "Firmname entered");
         utilMobile.enterdata(registration.Exp_Vorname,utilMobile.getTestData("firstname"));
         ExtentTestManager.getTest().log(LogStatus.INFO, "firstname entered");
         utilMobile.enterdata(registration.Exp_Nachname,utilMobile.getTestData("lastname"));
         ExtentTestManager.getTest().log(LogStatus.INFO, "lastname entered");
         utilMobile.enterdata(registration.Exp_Email,emailId);
         ExtentTestManager.getTest().log(LogStatus.INFO, "email entered");
         driver.findElement(By.name("remail")).sendKeys(emailId);
         ExtentTestManager.getTest().log(LogStatus.INFO, "again email entered");
         
         utilMobile.enterdata(registration.Exp_Password,utilMobile.getTestData("password"));
         ExtentTestManager.getTest().log(LogStatus.INFO, "password entered");
         
         utilMobile.enterdata(registration.Exp_cPassword,utilMobile.getTestData("password"));
         ExtentTestManager.getTest().log(LogStatus.INFO, "re-password entered");
         
         utilMobile.enterdata(registration.Telefon,utilMobile.getTestData("telefon"));
         ExtentTestManager.getTest().log(LogStatus.INFO, "telefone entered");
         
         utilMobile.enterdata(registration.Impressum,utilMobile.getTestData("Impressum"));
         ExtentTestManager.getTest().log(LogStatus.INFO, "Impressum checked");
         utilMobile.clickByXpath(registration.AGB);
         ExtentTestManager.getTest().log(LogStatus.INFO, "AGB checked");
         utilMobile.clickByXpath(registration.industry);
         ExtentTestManager.getTest().log(LogStatus.INFO, "Industry checked");
         utilMobile.clickByXpath(registration.Geschlecht);
         ExtentTestManager.getTest().log(LogStatus.INFO, "Gender checked");
         utilMobile.enterdata(registration.Ansprechpartner,utilMobile.getTestData("Ansprechpartner"));
         ExtentTestManager.getTest().log(LogStatus.INFO, "Ansprechpartner entered");
         utilMobile.enterdata(registration.Straße,utilMobile.getTestData("Straße"));
         ExtentTestManager.getTest().log(LogStatus.INFO, "street entered");
         utilMobile.enterdata(registration.Hausnummer,utilMobile.getTestData("Hausnummer"));
         ExtentTestManager.getTest().log(LogStatus.INFO, "house entered");
         utilMobile.enterdata(registration.PLZ,utilMobile.getTestData("PLZ"));
         ExtentTestManager.getTest().log(LogStatus.INFO, "pincode entered");
         utilMobile.enterdata(registration.Ort,utilMobile.getTestData("Ort"));
         ExtentTestManager.getTest().log(LogStatus.INFO, "loaction entered");
         utilMobile.wait(1000);
         utilMobile.clickByXpath(registration.land_drpdwn);
         
         ExtentTestManager.getTest().log(LogStatus.INFO, "land dropdown selected");
         utilMobile.wait(1000);
         utilMobile.clickByXpath(registration.land_selection);
         ExtentTestManager.getTest().log(LogStatus.INFO, "land selected");
         utilMobile.wait(1000);
         utilMobile.clickByXpath(registration.Bundesland);
         ExtentTestManager.getTest().log(LogStatus.INFO, "state dropdown selected");
         utilMobile.wait(1000);
         utilMobile.clickByXpath(registration.Bundesland_selection);
         ExtentTestManager.getTest().log(LogStatus.INFO, "state selected");
         utilMobile.wait(1000);
       
         JavascriptExecutor jsed = (JavascriptExecutor)driver;
       	jsed.executeScript("window.scrollBy(0,-700)", "");
       	utilMobile.wait(1000);
     	utilMobile.clickByXpath(registration.Register_btn);
     	ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on Register button");
     	utilMobile.wait(1000);
     	driver.findElement(By.xpath(".//*[@id='elementtoScrollToID']/div/div[5]/form/div[1]/div[2]/a[2]")).click();
     	ExtentTestManager.getTest().log(LogStatus.INFO, "Condition accepted");
     	utilMobile.wait(1000);
     	utilMobile.photoupload(registration.upload_photo, registration.browse_photo, registration.crop_submit,utilMobile.getTestData("imagepath"));
     	ExtentTestManager.getTest().log(LogStatus.INFO, "Photo uploaded successfully");
}
}