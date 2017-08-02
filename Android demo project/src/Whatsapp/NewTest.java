package Whatsapp;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void f() {
	  
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() throws MalformedURLException {
	  
	  DesiredCapabilities capability=new DesiredCapabilities();
		 File file=new File("C:\\Koenig documents\\workspace\\Android demo project\\WhatsApp.apk");

		 capability.setCapability(MobileCapabilityType.APP, file.getAbsolutePath());
		 
		  capability.setCapability("deviceName","emulator-5554" );
		  capability.setCapability("platformName","Android" );
		  capability.setCapability("VERSION","6.0" );
		 
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:8888/wd/hub"), capability);
		
  }

  @AfterMethod
  public void afterMethod() {
  }

}
