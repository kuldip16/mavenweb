package web_automation;


import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.remote.MobileBrowserType;

import io.appium.java_client.remote.MobileCapabilityType;


import java.io.File;
import java.net.MalformedURLException;

import java.net.URL;
import java.sql.Driver;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.AfterMethod;


public class NewTest
 


{
	
	@SuppressWarnings("rawtypes")
	AndroidDriver driver;
  @SuppressWarnings("rawtypes")
@BeforeClass
  public void f() throws MalformedURLException {
	  
	  
	  DesiredCapabilities capability=new DesiredCapabilities();
		 
	  capability.setCapability("deviceName","emulator-5554" );
	  capability.setCapability("platformName","Android" );
	  capability.setCapability("VERSION","6.0" );
	 // capability.setCapability("browserName","Chrome" );
	  capability.setCapability("browserName",MobileBrowserType.BROWSER );
	 capability.setCapability("DEVICE_READY_TIMEOUT","50");
	  //capability.setCapability("appPackage","com.android.chrome");
	  //capability.setCapability("appActivity","com.google.android.apps.chrome.Main");
	 capability.setCapability(MobileCapabilityType.APP_PACKAGE,"com.android.browser");
    capability.setCapability(MobileCapabilityType.APP_ACTIVITY,"com.android.browser.BrowserActivity");
		
	
	  
	  //capability.setCapability(MobileCapabilityType.APP_ACTIVITY,"com.whatsapp.Conversation");
	  //capability.setCapability(MobileCapabilityType.APP_ACTIVITY,"com.whatsapp.ProfileInfoActivity");
	  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capability);
	
  }
  
  @Test
  public void test() throws InterruptedException{
	  
	  Thread.sleep(9000);
	  driver.get("https://www.google.com");
	  WebElement searchBox=driver.findElement(By.name("q"));
	  searchBox.sendKeys("Appium for mobile automation");
	  Thread.sleep(5000);
	  driver.findElement(By.name("btnG")).click();
	  
	  
  }
  
  
  @AfterClass()
  
  public void afterclass() throws InterruptedException{
	  Thread.sleep(9000);
	  driver.quit();
	  
	  
	  
  }

}
