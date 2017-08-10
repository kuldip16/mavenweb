package applicationUtility;

import org.openqa.selenium.By;

import Utility.Base;

public class HomePage extends Base {
	
	public static String meinKonto = "//a[@class = 'login']/span";
	 public static String MeinKontoUserName = "//a[@class = 'account']/span";
	    
    
    public static void clickMeinKonto(){
    	driver.findElement(By.xpath(meinKonto)).click();
    }
    
    public static String getUsername(){
    	String username = null;
    	username = driver.findElement(By.xpath(MeinKontoAfterLogin)).getText();
    	
    	return username;
    }
  
    
    
  
    
    
}
