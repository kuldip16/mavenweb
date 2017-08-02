package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import UtilityMobile.BaseMobile;
import UtilityMobile.ExtentTestManager;
import UtilityMobile.utilMobile;



public class Headersearch extends BaseMobile {

	
	public static String searchfield = 	".//*[@id='keyword']";
	public static String dropdown =  ".//*[@id='search-critea']";
	public static String submit = ".//*[@id='autoresultmainpage']/span/input";
	public static String fotosearch = 	".//*[@id='Fotos']/a";
	public static String fotoresultpage  = ".//*[@id='ajaxp']/div[2]/div[1]/div[1]/div/h1";
	public static String nofotoresult  = "html/body/div[1]/div[4]/div/div[2]/div[3]/div/div/div[1]/div[1]";
	public static String expertensearch = ".//*[@id='Experten']/a";
	public static String noexperteresult  = "html/body/div[1]/div[4]/div/div[2]/div[3]/div[1]/div/div[1]";
	public static String experteresult  = ".//*[@id='ajaxp']/div[2]/div[3]/div/div[2]/div[1]/div/h4/a";
	public static String magazinsearch  = ".//*[@id='Magazin']/a";
	public static String magazinresult  = ".//*[@id='center_column']/div/div[11]/div/div[1]/div[1]/a/div/div[1]";
	public static String nomagazinresult  = ".//*[@id='center_column']/div/div[11]/b";
	public static String productresult  = ".//*[@id='page_container']/div[3]/div/div[1]/div/div[3]/div[1]";
	
	
	
	 public static void search(String xpath, String xpath1, String testdata) {
		  
		  String searchresult = null;
		 
		  
	
		 utilMobile.clickevent(Headersearch.dropdown);
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on dropdown.");
		 
		 driver.findElement(By.xpath(xpath)).click();
		
		 ExtentTestManager.getTest().log(LogStatus.INFO,   "filter selected from Dropdown");
			
		 driver.findElement(By.xpath(xpath1)).sendKeys(testdata);
		 ExtentTestManager.getTest().log(LogStatus.INFO, "test data is entered");
		 
		 utilMobile.clickevent(Headersearch.submit);
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Clciked on submit");
		 
		 try {
				Thread.sleep(5000);
			   } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			    }
	
	 }
}
