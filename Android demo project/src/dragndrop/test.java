package dragndrop;

import static org.junit.Assert.*;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class test {

	@Test
	public void test() throws MalformedURLException {
		
		DesiredCapabilities capability=new DesiredCapabilities();
		 File file=new File("C:\\Users\\Trainer\\Downloads\\Appium\\Android demo project\\Android demo project\\com.mobeta.android.demodslv-0.5.0-3_APKdot.com.apk");

		 capability.setCapability(MobileCapabilityType.APP, file.getAbsolutePath());
		 capability.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,100);
		  capability.setCapability("deviceName","emulator-5554" );
		  capability.setCapability("platformName","Android" );
		  capability.setCapability("VERSION","6.0" );
		 
		  AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capability);
		
		  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 driver.findElementByName("Basic usage playground").click();
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		 WebElement ele1 = (WebElement) driver.findElementsById("com.mobeta.android.demodslv:id/drag_handle").get(0);
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		 WebElement ele2 = (WebElement) driver.findElementsById("com.mobeta.android.demodslv:id/drag_handle").get(6);
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		  TouchAction action= new TouchAction(driver);
		  
		  System.out.println("It Is dragging element.");
		  action.longPress(ele1).moveTo(ele2).release().perform();  
		  System.out.println("Element has been droped at destination successfully.");
		
		
		
		
		
	}

}
