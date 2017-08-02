  package PageObjects;

import org.openqa.selenium.By;

import UtilityMobile.BaseMobile;
import UtilityMobile.ExtentTestManager;


import com.relevantcodes.extentreports.LogStatus;



public class login extends BaseMobile {
	

public static String emailfield = 	".//*[@id='login_email']";
public static String password = 	".//*[@id='login_pwd']";
public static String submitbutton = ".//*[@id='loginform']/div/div[8]/input";
public static String checkbox = ".//*[@id='loginform']/div/div[9]/label/label";


public static void login(String emailId, String passwordVal){
	driver.findElement(By.xpath(emailfield)).sendKeys(emailId);
	ExtentTestManager.getTest().log(LogStatus.INFO, "Entered email id.");
	
	driver.findElement(By.xpath(password)).sendKeys(passwordVal);
	ExtentTestManager.getTest().log(LogStatus.INFO, "Entered password.");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.xpath(checkbox)).click();
	ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on Checkbox");
	driver.findElement(By.xpath(submitbutton)).click();
	ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on submit button.");
}

}
