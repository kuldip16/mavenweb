package mobilegesture;

import static org.junit.Assert.*;
import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

public class gesture {

	@Test
	public void test() throws MalformedURLException, InterruptedException {
		
		
		DesiredCapabilities capability=new DesiredCapabilities();
		File file=new File("C:\\Users\\Trainer\\Downloads\\Appium\\Android demo project\\Android demo project\\api.apk");

		 capability.setCapability(MobileCapabilityType.APP, file.getAbsolutePath());
		 capability.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,100);
		  capability.setCapability("deviceName","emulator-5554" );
		  capability.setCapability("platformName","Android" );
		  capability.setCapability("VERSION","6.0" );
		 
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capability);
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	
	MobileElement ele=(MobileElement)driver.findElementById("android:id/text1");
	
	//ele.swipe(SwipeElementDirection.UP, 200);
	//ele.swipe(SwipeElementDirection.DOWN, 200);
	
	
	ele.zoom();
	
	
	//TouchAction tAction=new TouchAction(driver);
	
	//First tap on the screen and swipe it right using moveTo function
	//tAction.press(300,500).moveTo(600,500).release().perform();
		
	}

}
