package TestCases;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class WAP {
  @Test
  public void TestWap() throws MalformedURLException {
	  
  
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setCapability("deviceName", "4100a255e4ad91cd");
	  capabilities.setCapability("browserName", "Android");
	  capabilities.setCapability("VERSION", "6.0.1");
	  capabilities.setCapability("platformName", "Android");
	  capabilities.setCapability("app", "chrome");
	  
	  
	  WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	  driver.get("http://qa1.homesofa.de/");
	  //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
 	
/*	  
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setCapability("deviceName", "9885b53254514b534e");
      capabilities.setCapability("platformName", "Android");
      capabilities.setCapability(CapabilityType.VERSION, "6.0.1");
      capabilities.setCapability("device", "Android");
      
      capabilities.setCapability("app", "chrome");
      WebDriver driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
      driver.get("http://google.com"); */
  }
}
