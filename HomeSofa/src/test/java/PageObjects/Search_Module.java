package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import Utility.Base;
import Utility.ExtentTestManager;
import Utility.util;

public class Search_Module extends util{
	
	public static String str1;
	public static boolean joliesearch(String headersearchedtext, String searchproductlist ) throws InterruptedException{
		
		boolean status = true;
				
		str1 =  util.getTestData("searchterm");
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "Entering the search term in search box " + str1);
		driver.findElement(By.xpath(SearchBox_e)).sendKeys(str1);
		Thread.sleep(3000);
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that in jolie search window is started displaying or not");
		if(driver.findElement(By.xpath(joliesearchwindow_e)).isDisplayed()){
			String str2 = str1 ;
			System.out.println("Jolie search window is opened");
			
			if(searchproductlist.equalsIgnoreCase(productnamelist)){
				clickevent(moreresult_e);
				Thread.sleep(5000);
				str2 = str1.toUpperCase();
				System.out.println("Click on More Result button");
				Assert.assertTrue(driver.findElement(By.xpath(filteroptions_e)).isDisplayed());
			}
			String searchtermentered = driver.findElement(By.xpath(headersearchedtext)).getText();
			
			ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that the results are same as entered text or not");
			System.out.println("Matching the strings in header");
			Assert.assertEquals(str2 , searchtermentered);
			System.out.println("macthed");
			
			ExtentTestManager.getTest().log(LogStatus.INFO, "Getting the list of all products from search results");
			List<WebElement> drop = driver.findElements(By.xpath(searchproductlist));
			java.util.Iterator<WebElement> i = drop.iterator();
			
			ExtentTestManager.getTest().log(LogStatus.INFO, "Verify that, in product list the string is matched with text entered or not");			 
			System.out.println("macthing the product name with search term") ;
			 while(i.hasNext()) {
				 				 
				 WebElement row = i.next();
				    String str = row.getText();
				    System.out.println("Products search are "+ str);    			    
			    	Assert.assertTrue(str.contains(str1));
			 }
	}
		
		else{
			
			 System.out.println("Search window not opened");
			 status = false;
		 }
			
		return status;
	}

}



