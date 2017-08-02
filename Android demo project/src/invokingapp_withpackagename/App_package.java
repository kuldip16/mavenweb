package invokingapp_withpackagename;

import static org.junit.Assert.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

public class App_package {

	@Test
	public void test() throws MalformedURLException {
		
		File file=new File("C:\\Users\\Trainer\\Downloads\\Appium\\Android demo project\\Android demo project\\bms.apk");

		 
	 
		DesiredCapabilities capability=new DesiredCapabilities();
		//DesiredCapabilities capability=new DesiredCapabilities();
		
		capability.setCapability(MobileCapabilityType.APP, file.getAbsolutePath());
		 
		 
		  //capability.setCapability("deviceName","Galaxy J1 ace" );
		  //capability.setCapability("platformName","Android" );
		 // capability.setCapability("VERSION","4.4.4" );
		  capability.setCapability("deviceName","emulator-5554" );
		  capability.setCapability("platformName","Android" );
		  capability.setCapability("VERSION","6.0" );
		  capability.setCapability("DEVICE_READY_TIMEOUT","50");
		  capability.setCapability("appPackage","com.android.calculator2");
		  capability.setCapability("appActivity","com.android.calculator2.Calculator");
		
		 
		 AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capability);
		
	}

}
 