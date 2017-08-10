package TestCases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utility.Base;
import Utility.ExtentTestManager;
import Utility.util;

import com.relevantcodes.extentreports.LogStatus;

public class MyAccount12398_02_c extends Base{
	
  @Test  (groups = {"Regression"})
  public void verifyEmptyWishList() {
	  List<WebElement> ls = new ArrayList<WebElement>();
	
	  util.mousehoverVj(Mein_konto_e);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on mein konto on home page header");
	  
	  util.clickByXpath(wishlistcounter2_e);
	  ExtentTestManager.getTest().log(LogStatus.INFO, "Moved to wishlist page");
	  
	  ls = util.getElements(productnamelist);
	  
	  System.out.println(ls.size());
	  
	  if(ls.size()==3){
		  ExtentTestManager.getTest().log(LogStatus.PASS, "Top seller products are available on empty wishlist");  
	  }else{
		  ExtentTestManager.getTest().log(LogStatus.FAIL, "Top seller products are not available on empty wishlist");
		  Assert.fail();
	  }
	  
	  
  }
}
