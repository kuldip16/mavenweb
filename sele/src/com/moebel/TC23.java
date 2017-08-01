package com.moebel;

import java.io.File;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC23 {

		public static void main(String[] args) {
			  String url = "https://www.moebel.de/betatesting.php";
			    /*System.setProperty("webdriver.gecko.driver", "E:\\Selenium jars\\geckodriver.exe");  
			    WebDriver driver = new FirefoxDriver();
			   
			    driver.get(url);
			  */
			    
			    System.setProperty("webdriver.chrome.driver", "E:\\Automationdata\\chromedriver.exe");

			    DesiredCapabilities capabilities = DesiredCapabilities.chrome();

			    ChromeOptions options = new ChromeOptions();
			    options.addExtensions(new File("E:\\Automationdata\\extension_1_3_1.crx"));
			    capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			    
			    LoggingPreferences logPrefs = new LoggingPreferences();
			          logPrefs.enable(LogType.BROWSER, Level.ALL);
			          capabilities.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);
			          
			    ChromeDriver driver = new ChromeDriver(capabilities);
			    driver.get(url);
			    
			      driver.manage().window().maximize();
			      WebElement drpdwn= driver.findElement(By.xpath("html/body/div[1]/select"));
			      
			      Select sl= new Select(drpdwn);
			      sl.selectByValue("qa1c");
			      try {
			     Thread.sleep(2000);
			    } catch (InterruptedException e) {
			     // TODO Auto-generated catch block
			     e.printStackTrace();
			    }
			      driver.findElement(By.xpath("html/body/div[1]/font[2]/a[1]")).click(); 
			      
			     
			    // Switching to New tab: home page
			           Set<String> tab_handles = driver.getWindowHandles();
			            int number_of_tabs = tab_handles.size();
			        
			            int new_tab_index = number_of_tabs-1;
			            
			            driver.switchTo().window(tab_handles.toArray()[new_tab_index].toString());
			            System.out.println("Title of Home Page is: "+driver.getTitle());
			   

			            WebDriverWait wait = new WebDriverWait(driver, 20);
			            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='sb-nav-close']"))).click();
			            System.out.println("popup closed");
			            try {
			       Thread.sleep(1500);
			      } catch (InterruptedException e) {
			       // TODO Auto-generated catch block
			       e.printStackTrace();
			      }
			        HashMap<String,String> map = new HashMap<String,String>();
			         LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
			            for (LogEntry entry : logEntries) {
			             if(entry.getMessage().split("\"")[1].contains(":"))
			             // System.out.println(entry.getMessage());  
			            System.out.println(entry.getMessage().split("\"")[1].split(":")[0]+entry.getMessage().split("\"")[1].split(":")[1]);
			             
			         //    map.put( entry.getMessage().split("\"")[1].split(":")[0].trim(), entry.getMessage().split("\"")[1].split(":")[1].trim());
			               
			             
			            }
			            
			        //    print_map(map);     
			    
			   }
			   
			   private static void print_map(HashMap<String, String> map) {
			    // TODO Auto-generated method stub
			    
			    for (Entry<String, String> s : map.entrySet())
			    {  System.out.println("=====");
			     System.out.println(s.getKey() + s.getValue());
			    }
			    
			   }

	}

