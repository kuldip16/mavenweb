package gesture2;

import static org.junit.Assert.*;
import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class installapp {

	@Test
	public void test() throws MalformedURLException {
		
		
		DesiredCapabilities capability=new DesiredCapabilities();
		 File file=new File("C:\\Users\\Trainer\\Downloads\\Appium\\Android demo project\\Android demo project\\api.apk");

		 capability.setCapability(MobileCapabilityType.APP, file.getAbsolutePath());
		 capability.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,100);
		  capability.setCapability("deviceName","emulator-5554" );
		  capability.setCapability("platformName","Android" );
		  capability.setCapability("VERSION","6.0" );
		 
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capability);
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	
	//driver.installApp(appPath);
	System.out.println(driver.isLocked());
	
	System.out.println(driver.getContext());
	System.out.println(driver.currentActivity());
	
	//List <WebElement>ele=driver.findElementsByClassName("android.widget.TextView");
	
	WebElement e1=driver.findElementByName("Graphics");
	
	TouchAction t=new TouchAction(driver);
	
	//t.tap(ele.get(4)).perform();
	//t.tap(e1).perform();
	t.longPress(e1, 200).perform();


	
	//driver.closeApp();
	
	
		
	}

}
