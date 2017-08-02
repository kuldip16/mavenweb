package Invoking_Android_VD;

import static org.junit.Assert.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Desiredcapabilities {

	@Test
	public void test() throws MalformedURLException, InterruptedException {
		
		
		 DesiredCapabilities capability=new DesiredCapabilities();
		 File file=new File("C:\\Users\\Trainer\\Downloads\\Appium\\Android demo project\\Android demo project\\bms.apk");

		 capability.setCapability(MobileCapabilityType.APP, file.getAbsolutePath());
		 
		  capability.setCapability("deviceName","emulator-5554" );
		  capability.setCapability("platformName","Android" );
		  capability.setCapability("VERSION","6.0" );	
		 
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capability);
		
		Thread.sleep(5000);
		 //driver.navigate().back();//click on back button
		//driver.pressKeyCode(4); //4 is back,menu is 82,recent app is 187
		 
		 //((AndroidDriver) driver).pressKeyCode(AndroidKeyCode.BACK);
		 ((AndroidDriver) driver).pressKeyCode(AndroidKeyCode.HOME);
		 
			
		
	}

}
