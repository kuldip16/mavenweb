package PageObjects;

import org.openqa.selenium.By;

import Utility.Base;

public class HomePage extends Base {
	
	private static String meinKonto = ".//*[@class='header_user_info']/a/span";
	    
    
    public static void clickMeinKonto(){
    	driver.findElement(By.xpath(meinKonto)).click();
    }
    
    public static String getUsername(){
    	String username = null;
    	username = driver.findElement(By.xpath(meinKonto)).getText();
    	
    	return username;
    }
  
    
  
    
    
}
