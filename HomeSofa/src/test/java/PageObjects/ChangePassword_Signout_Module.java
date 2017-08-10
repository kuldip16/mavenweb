package PageObjects;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import com.relevantcodes.extentreports.LogStatus;

import Utility.Base;
import Utility.ExtentTestManager;
import Utility.util;

public class ChangePassword_Signout_Module extends util{
	
	public static void gotomeinkonto(){
		ExtentTestManager.getTest().log(LogStatus.INFO, "User is on homepage");
		clickevent(Mein_konto_e);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Click on Mein Konto");
		clickevent(forgotpassword_link_e);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Click on forgot password link");
	}
	
	
	
	public static boolean forgotpasword_incorrectemail(String str, String str1){
		
		boolean status = true;
		gotomeinkonto();
			
		ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that the page title of forgot password is correct or not");
		try{
		if(driver.getTitle().contains(ForgotPwd_ptitle))
	 	   {
	 		   System.out.println("Page Title is : " + driver.getTitle());
	 		   Reporter.log("Page Title is : " + driver.getTitle());
	 		   ExtentTestManager.getTest().log(LogStatus.INFO, "Entering the invalid email address");
	 		  enterdata(ForgotPwd_email_e, str);	 		   
	 		   clickevent(ForgotPwd_submit_e);
	 		    		   
	 		    String st1 = getText(str1);
	 			
	 		   
	 		   ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that the field is validated or not");
	 		   if(st1.equalsIgnoreCase(wrongemailvalidationmsg)){
	 			   
	 			   System.out.println("email is invalid, test case is passed");
	 		   }
	 		   else if (st1.contains(successemailvalidationmsg)){
	 			   
	 			   
	 			  System.out.println("email is valid and password is send on the email, test case is passed");
	 			   
	 		   }
	 		   else{
	 			  System.out.println("forgot password functionality is not working");
		 		   status= false;
	 		   }
	 		   
	 	   }
	 	   else{
	 		   System.out.println("Page is not correct");
	 		   status= false;
	 	   }
		
		}
		catch(Exception e){
			
			System.out.println("Test Case is failed validation is not proper");
			status = false;
		}
		return status;
	}
	
	public static boolean signout() throws InterruptedException, AWTException{
		boolean status = true;
		ExtentTestManager.getTest().log(LogStatus.INFO, "User is on homepage");
		ExtentTestManager.getTest().log(LogStatus.INFO, "User is naviagting to login page and entering credentials");
		login_in();
		mousehover(username_e);
		String str = getText(signout_e);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Verifying the signout link is visible or not after login");
		if(exp_signout_link.equalsIgnoreCase(str)){
			System.out.println("User is signout now");
			ExtentTestManager.getTest().log(LogStatus.INFO, "User is successfully logout");
		clickevent(signout_e);
	}
		else{
			System.out.println("test case is failed user is unable to signout");
			status = false;
		}
	return status;
}
	
	public static boolean changepassword(String str1, String str2, String str3) throws InterruptedException{
		boolean status = true;
		ExtentTestManager.getTest().log(LogStatus.INFO, "User is on homepage");
		ExtentTestManager.getTest().log(LogStatus.INFO, "User is naviagting to login page and entering credentials");
		login_in();
		Thread.sleep(3000);
		clickevent(account_information_e);
		Thread.sleep(5000);
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "Entering the text in following fields Current password , New password , Confirm password ");
		enterdataID(old_pwd_pi_e , util.getTestData(str1));
		enterdataID(new_pwd_pi_e,util.getTestData(str1));
		enterdataID(cnfrm_new_pwd_pi_e,util.getTestData(str2));
		clickevent(continue_pi_e);
		
		String str = getText(str3);
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "Verfying the password updating validation message on successful or unsuccessful updating");
		
		if (str.contains(newpasswordnotmatch)){
			ExtentTestManager.getTest().log(LogStatus.INFO, "Verify the message when confirm password and New Password text is not same");
			System.out.println("The validation message is correct");
		}
		
		else if(str.contains(PersonalInfoUpdateMsg)){
			ExtentTestManager.getTest().log(LogStatus.INFO, "Verify the message when confirm password and New Password text is same");
			System.out.println("The new password has been updated");
		}
		
		else{
			ExtentTestManager.getTest().log(LogStatus.INFO, "Change password functionality not working properly");
			System.out.println("The validation message is incorrect or change password is not working"+ str );
			status = false;
		}
		return status;
	}
	
}
