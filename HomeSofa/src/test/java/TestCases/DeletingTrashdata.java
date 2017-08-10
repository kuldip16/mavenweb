package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Utility.Base;
import Utility.ExtentTestManager;
import Utility.util;

public class DeletingTrashdata extends util{
	
//public FirefoxDriver Driver = new FirefoxDriver();
	
	@Test
	public void testbefore() throws InterruptedException{
		
//		String pathexe = "C:\\Users\\nitin\\Desktop\\Bugs SS\\chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver", pathexe );
		/*String url= "http://qa1.homesofa.de/admin831z23vv1";
	    Thread.sleep(5000);
		Driver.get(url);
		Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		*/Thread.sleep(5000);
		enterdata("//form[@id= 'login_form']//input[@id='email']", "nitinsahni@webvirtue.com");
		enterdata("//form[@id= 'login_form']//input[@id='passwd']", "testing123");
		clickevent("//*[@id='login_form']/div[3]/button");
		Thread.sleep(5000);
		clickevent(".//*[@id='maintab-AdminParentOrders']/a/span");
		
		enterdata(".//*[@id='form-order']//input[@name='orderFilter_reference']","H60945855");
		clickevent(".//*[@id='submitFilterButtonorder']");
		clickevent("//tr[@class = ' odd']/td[3]");
		
				 Thread.sleep(5000);
			     clickevent("//form[@id = 'orderStateChangeForm']//a[@class='chosen-single']");
				 clickevent(".//*[@id='id_order_state_chosen']/div/ul/li[9]");
				 
				 clickevent("//form[@id = 'orderStateChangeForm']//button[@id='orderIdStateChange']");
				
		    	System.out.println("heloo");
		    	
		  }
		

}
	
