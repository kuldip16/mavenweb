package PageObjects;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import Utility.Base;
import Utility.ExtentTestManager;
import Utility.util;

public class Fabric_Module extends util{

	public static boolean fabricmodule() throws InterruptedException, AWTException{
	
		boolean status = true;
		ExtentTestManager.getTest().log(LogStatus.INFO, "User is naviagating to login page to login with valid user");
		login_in();
		Thread.sleep(3000);
		mousehover(Ecksofas_Wohnlandschaften_e);
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "clicking on Wohnlandschaften category");
		clickevent(wohnlandschaft_sc_e);
		Thread.sleep(4000);
		
		mousehover(number_element_e);
		Thread.sleep(4000);
		
		clickevent(element_48_e); 
		
		getelement(util.getTestData("ProductSelected"), productnamelist);
		/* List<WebElement> drop = driver.findElements(By.xpath(productnamelist));
		 String str1 =  util.getTestData("FabricProduct");
		 java.util.Iterator<WebElement> i = drop.iterator();
		
		 while(i.hasNext()) {
			    WebElement row = i.next();
			    String str = row.getText();
			
			    if(str.equalsIgnoreCase(str1)){
				   ExtentTestManager.getTest().log(LogStatus.INFO, "clicking on product " + str1);
				   row.click();
			    		break;
			    		}
			}*/
		
		    String fabrictext = getText(fabricsample_e);
			
		    ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that fabric sample link exist on page or not, if exist then click on it");
			if(fabrictext.equalsIgnoreCase(fabricsample_text)){
				clickevent(fabricsample_e);
				
				ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that fabric modal window opens or not");
				if(elementPresentOrNot(fabricwindow_e)){
					
					System.out.println(getText(fabricmodalwindowheader_e));
					
					ExtentTestManager.getTest().log(LogStatus.INFO, "If fabric modal window opens, then verify that the window is of fabric or not by verifying its header text");
					if(fabricsample_text.equalsIgnoreCase(getText(fabricmodalwindowheader_e))){
					
						System.out.println("Fabric window is opened");
						clickevent(weiter_e);
				
						ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that without selecting fabric, clicking on Continue button validation message displays or not");
						if(getText(nofabricvalidationmsg_e).contains(nofabricvalidationmsg_text)){
							
							System.out.println("No fabric is selected, working fine");
							ExtentTestManager.getTest().log(LogStatus.INFO, "If validation message is displaying then choose the fabric and get the data of that fabric");
							clickevent(modalwindow_fabric_e);
							
							String srcseletced= getattribute(modalwindow_fabric_e, "src");
							System.out.println(srcseletced);
							
							ExtentTestManager.getTest().log(LogStatus.INFO, "click on continue");
							clickevent(weiter_e);
							Thread.sleep(2000);
							
							ExtentTestManager.getTest().log(LogStatus.INFO, "On next page of modal window get the fabric data");
							String srcseletced2= getattribute(modalwindow_fabric_p2_e, "src");
						
							ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that on previous page the fabric which was selected exist on 2nd page or not");
							Assert.assertEquals(srcseletced, srcseletced2);
							
							ExtentTestManager.getTest().log(LogStatus.INFO, "click on continue");							
							clickevent(weiter_2_e);
							Thread.sleep(3000);
							
							ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that thank you message is displaying or not");
							if(getText(thankyoumsg_e).contains(thankyoumsg_text)){
								System.out.println("Email is sent");
							}
							
							else{
								System.out.println("email not sent");
								ExtentTestManager.getTest().log(LogStatus.INFO, "Thank You message not displaying, functionality not working");
								status = false;
							}
							
						}
											
						else{
							ExtentTestManager.getTest().log(LogStatus.INFO, "Validation message is not displaying");
							System.out.println("Message is not displaying, functionality not working");
							status = false;
						}
											
					}
					else{
						
						ExtentTestManager.getTest().log(LogStatus.INFO, "Fabric sample window is not opened properly");
						System.out.println("It is not fabric window");
						status = false;
					}
				}
				else{
					ExtentTestManager.getTest().log(LogStatus.INFO, "Fabric sample link not found");
					System.out.println("Fabric window is not opened");
					status = false;
				}
							
			}
			
		return status;
	}
}
