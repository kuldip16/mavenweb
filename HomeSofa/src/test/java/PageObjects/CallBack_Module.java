package PageObjects;

import java.awt.AWTException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.openqa.selenium.By;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import Utility.ExtentTestManager;
import Utility.util;

public class CallBack_Module extends util{

	public static boolean status = true;
	static boolean status2 ;
	public static boolean callback() throws InterruptedException, ParseException, AWTException{
		
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that call back overlay is displaying at footer or not");
		if(util.elementdisplayed(callbackfooterbtn_e)){
		System.out.println("call button displayed");
		
			util.clickevent(Mein_konto_e);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that on other pages call back overlay is displaying at footer or not");
			Assert.assertTrue(util.elementdisplayed(callbackfooterbtn_e));
			ExtentTestManager.getTest().log(LogStatus.INFO, "Click on overlay");
			util.clickevent(callbackfooterbtn_e);
			Thread.sleep(5000);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that call back popup is opening or not");
			Assert.assertTrue(util.elementdisplayed(callbackwindow_e));
			status2 = dropdown();
			callbackfunctionality();
			status2 = ADPCallBack();
			return status2;
			
		}
			
		
		else{
			System.out.println("no");
		}
		return status2;
		
	}
	
	public static boolean dropdown() throws InterruptedException, ParseException{
		
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "Calculating the current time");
		String currentTime ;
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		currentTime= dateFormat.format(new Date());
		System.out.println(currentTime);
		Date ten = dateFormat.parse(currentTime);
		String morningtime = "11:00:00";
		String eveningtime = "18:00:00";
		Date newdate = dateFormat.parse(morningtime);
		Date newdate1 = dateFormat.parse(eveningtime);
		
		boolean x = ten.before(newdate);
		boolean y = ten.after(newdate1);
		
	
			
			
		ExtentTestManager.getTest().log(LogStatus.INFO, "Getting the current day of week");
			Calendar calendar = Calendar.getInstance();
			int day = calendar.get(Calendar.DAY_OF_WEEK); 
			System.out.println(day);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that cuurent day with condition");
			switch (day) {
			    case Calendar.SUNDAY:{
			    	ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that cuurent day is Sunday then in popup dropdown should display");
			    	if(util.elementdisplayed(callbackdropdown_e)){
		   				status = false;
		   			}
		   			else{
		   				Assert.assertTrue(util.elementdisplayed(callbackdropdown2_e));
		   			}
			    	break;
			   }
			        
			    	

			    case Calendar.MONDAY:
			       {
			    	   
			    	   if(x || y){
			    		   daycheck("MONDAY");
			    	   }
			   		else{
			   			
			   			System.out.println("Monday drop down will not display");
			   		}
			    	   
			    	   break;
			       }

			    case Calendar.TUESDAY:
			    {
			    	  if(x || y)
			    	  {
			    		  daycheck("TUESDAY");
				   	}
				   		else{
				   			
				   			System.out.println("Tuesday drop down not displaying");
				   		}
			    	  break;
			    	
			    }
			    case Calendar.WEDNESDAY:
			    {
			    	
			    	  if(x || y){
			    		 
			    		  daycheck("WEDNESDAY");
				   	}
				   		else{
				   			
				   			System.out.println("WEDNESDAY drop down not displaying");
				   		}
			    	  break;	
			    }
			    case Calendar.THURSDAY:
			    {
			    	  if(x || y){
			    		  daycheck("THURSDAY");
				   	}
				   		else{
				   			
				   			System.out.println("THURSDAY drop down not displaying");
				   		}
			    	  break;
			    }
			       
			    case Calendar.FRIDAY:
			    {
			    	  if(x || y){
			    		  daycheck("FRIDAY");
				   	}
				   		else{
				   			
				   			System.out.println("Friday drop down not displaying");
				   			
				   		}
			    	break;
			    }
			    case Calendar.SATURDAY:{
			    	
			    	ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that cuurent day is Saturday then in popup dropdown should display");
			    	if(util.elementdisplayed(callbackdropdown_e)){
		   				status = false;
		   			}
		   			else{
		   				Assert.assertTrue(util.elementdisplayed(callbackdropdown2_e));
		   			}
			    	break;
			   }
			     
			}
			return status;
		}
		

	
	
	public static void callbackfunctionality() throws InterruptedException{
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that validation message is displaying or not when phone number is empty");
		util.clickevent(submitbutton_e);
		String str = driver.findElement(By.xpath(validationmsg_e)).getText();
		Assert.assertTrue(str.equalsIgnoreCase(validationmsg_text));
		
		System.out.println("String is matched of error");
		ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that question field is empty or not");
		String str1 = util.getText(callbackquesfield_e);
		Assert.assertTrue(str1.equalsIgnoreCase(""));
		
		System.out.println("Textfield is blank");
		ExtentTestManager.getTest().log(LogStatus.INFO, "Enter phone number is the field");
		enterdata(callback_phnofield_e, util.getTestData("callbackphno"));
		Thread.sleep(3000);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Click on submit button");
		clickevent(submitbutton_e);
		Thread.sleep(3000);
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that Thank you message is displaying or not");
		String str3 = getText(callbackTQmsg2_e);
		System.out.println(str3);
		//Assert.assertTrue(str3.contains(callbackTQmsg_text));
		clickevent(closecallbackbtn_e);
			
	}
	
	public static void daycheck(String str){
		
		
	   			System.out.println(str);
	   			ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that current day is " +str +" then in popup dropdown should display before 10:00AM and after 6:00PM");
	   			if(elementdisplayed(callbackdropdown_e)){
	   				status = false;
	   			}
	   			else{
	   				Assert.assertTrue(elementdisplayed(callbackdropdown2_e));
	   			}
	   		
	}
	
	
	public static boolean ADPCallBack() throws InterruptedException, ParseException, AWTException{
		
		String str = "";
		Thread.sleep(3000);
		mousehover(Ecksofas_Wohnlandschaften_e);
		ExtentTestManager.getTest().log(LogStatus.INFO, "clicking on Wohnlandschaften category");
		clickevent(wohnlandschaft_sc_e);
		Thread.sleep(4000);
		
		mousehover(number_element_e);
		Thread.sleep(4000);
		
		clickevent(element_48_e); 
		getelement(util.getTestData("ProductSelected"), productnamelist);
		 /*List<WebElement> drop = driver.findElements(By.xpath(productnamelist));
		 String CategoryPageProductName =  util.getTestData("FabricProduct");
		 java.util.Iterator<WebElement> i = drop.iterator();
		
		 while(i.hasNext()) {
			    WebElement row = i.next();
			     str = row.getText();
			
			    if(str.equalsIgnoreCase(CategoryPageProductName)){
				   ExtentTestManager.getTest().log(LogStatus.INFO, "clicking on product " + CategoryPageProductName);
				   row.click();
			    		break;
			    		}
			}*/
			Thread.sleep(5000); 
			ExtentTestManager.getTest().log(LogStatus.INFO, "Getting the product name from ADP page");
			ExtentTestManager.getTest().log(LogStatus.INFO, "Clicking on the ADP acll back button in product description ");
			clickevent(ADP_callbackbtn_e);
			String str1 = getText(callbackquesfield2_e);
			str = str.replaceAll("\\s+$", "");
			System.out.println(str);
			System.out.println(str1);
			
			ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that in question field product related info is displaying or not");
			Assert.assertTrue(str1.contains(str));
			
			ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that drop down condition");
			status2 = dropdown();
			
			ExtentTestManager.getTest().log(LogStatus.INFO, "Click on close button");
			clickevent(closecallbackbtn_e);
			return status2;
			
		
	}
	
}
