package utilitypart1;

import java.awt.Robot;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import utilitypart1.ExtentTestManager;
import utilitypart1.util;

import com.relevantcodes.extentreports.LogStatus;

public class util extends baseclass {
	public static FileReader reader;
	public static Properties properties;
	
	public static String getconfigvalue (String Key) {
		String val= null;
		try {
			reader = new FileReader("config.properties");
			properties = new Properties();
			properties.load(reader);
			val = properties.getProperty(Key);
		} catch (Exception e) {
			e.printStackTrace();

		}
		return val;
	}
	
	public static String  gettestdata (String Key){
		String val= null;
		try {
		reader= new FileReader("testdata.properties");	
		properties = new Properties();
		properties.load(reader);
		val = properties.getProperty(Key);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return val;
	}

public static void wait(int i){
		
		try {
			Thread.sleep(i);
		   } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    }
}
	
		public static String getscreenshot(WebDriver driver,String screenshotName)
	    {    
			String filePath=null;
			try{
	            File scrnFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	            filePath  = "D:\\workspace\\HomeSofaMobile\\ScreenshotsMobile\\"+screenshotName+".png";
	            FileUtils.copyFile(scrnFile, new File(filePath));
	            
	    }catch(Exception e){
	    	   e.printStackTrace();
	    }
	    
		return filePath;
	    }
	
		public static void clickByXpath(String xpath){
			driver.findElement(By.xpath(xpath)).click();
		}
	    
		public static String  replaceChar(String testChar,String initial,String replacedChar){
			String newstr = testChar.replace(initial, replacedChar);
			
			return newstr;
		}
		
		public static void mousehoverVj(String st1){
		    Actions a = new Actions(driver);
		    WebElement we =   driver.findElement(By.xpath(st1));
		    a.moveToElement(we).build().perform();
		}

		public static String getText(String xpath){
			String text = null;
			text = driver.findElement(By.xpath(xpath)).getText();
			return text;
		}
		

		public static String getAttribute(String attribute,String xpath){
			String attributeVal = null;
			attributeVal = driver.findElement(By.xpath(xpath)).getAttribute(attribute);
			return attributeVal;
		}
		
		public static void enterText(String data, String xpath){
			driver.findElement(By.xpath(xpath)).sendKeys(data);
		}
		
		public static void clearText(String xpath){
			driver.findElement(By.xpath(xpath)).clear();
		}

		public static void selectDropDownValue(String text,String xpath){
			WebElement we = driver.findElement(By.xpath(xpath));
			Select selectDrop = new Select(we);
			selectDrop.selectByIndex(3);
			//selectDrop.selectByVisibleText(text);
		}
		
		public static List<WebElement> getElements(String xpath){
			List<WebElement> ls = new ArrayList<WebElement>();
			 ls = driver.findElements(By.xpath(xpath));
			
			return ls;
		}
		
		public static void scrollTo() {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,550)", "");
	    }
		
		public static void switchToIframe(String frameid){
			
			driver.switchTo().frame(frameid);
		}
		public static boolean elementPresentOrNot(String xpath){
	 	   boolean status=false;
	 	   status = driver.findElement(By.xpath(xpath)).isDisplayed();
	 	   return status;
	    }

		public static int getRandomNumberInRange(int min, int max) {

			if (min >= max) {
				throw new IllegalArgumentException("max must be greater than min");
			}

			Random r = new Random();
			return r.nextInt((max - min) + 1) + min;
		}

		/*public void addremovewishlist(String ctr, String wishlistbttn) throws InterruptedException{
			driver.findElement(By.xpath(wishlistbttn)).click();
			Thread.sleep(5000);
			String str = driver.findElementById(wishlist_counter_e).getText();
			System.out.println("Counter value is : "+str);
			if(str.equalsIgnoreCase(ctr))
			{
			System.out.println(" TestCase is passed");
			Reporter.log(str);
		}

		else{
			
			System.out.println("Test is Fail");
		}
		}*/


		   
	    public static void mousehover(String st1){
	      try{ 
	    	  Actions a = new Actions(driver);
	        
	        WebElement we =   driver.findElement(By.xpath(st1));
	        Point coordinates = we.getLocation();
	        Robot robot = new Robot();
	        robot.mouseMove(coordinates.getX(),coordinates.getY()+120);
	         
	        a.moveToElement(we).build().perform();
	        Thread.sleep(3000);
	      }catch(Exception e){
	    	  ExtentTestManager.getTest().log(LogStatus.SKIP, e.getMessage());  
	      }
	        
	    }
	    
	    public static String lower_casestring(String st1) {
	    	st1= st1.toLowerCase();
	    	return st1;
	    }
	    public static String Replace_space_string(String st1) {
	    	st1= st1.replaceAll("\\s+$", "");
	    	return st1;
	    }

	    public void screenshot(String pagename) throws IOException{
	    	File srcfile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    	FileUtils.copyFile(srcfile, new File("C:\\Users\\nitin\\Desktop\\Testing Report\\Whole Site Test Cases\\Automated Test Cases\\12950\\"+pagename+".png"));

	    }

	    public static String replacecharachter(String s){
	    	String numberOnly= s.replaceAll("[^0-9]", "");
	    	double i = (Double.parseDouble(numberOnly))/100;
	    	int k = (int) i;
	    	String numbero = Integer.toString(k);
	    	return numbero;
	    }
	    
	    public static void selectdropdownvalue(String str1, String str2){
	    	
	    	 Select daydropdown = new Select(driver.findElement(By.xpath(str1)));
	    	 int i= Integer.parseInt(str2);
	    	 daydropdown.selectByIndex(i); 
	    }

	 /*   public void addremovewishlist(String ctr, String wishlistbttn) throws InterruptedException{
	    	driver.findElement(By.xpath(wishlistbttn)).click();
	    	Thread.sleep(5000);
	    	String str = driver.findElement(By.xpath(wishlist_counter_e)).getText();
	    	System.out.println("Counter value is : "+str);
	    	if(str.equalsIgnoreCase(ctr))
	    	{
	    	System.out.println(" TestCase is passed");
	    	//Reporter.log(str);
	    }

	    else{
	    	
	    	System.out.println("Test is Fail");
	    }
	    } */

	    public static void clickevent(String str){
	    
	    	if(driver==null){
	    		System.out.println("driver............ is null");
	    	}else{
	    		WebElement webElement =  driver.findElement(By.xpath(str));
	        	if(webElement==null){
	        		System.out.println("Webelement............ is null");
	        	}else{
	        		webElement.click();
	        	}
	    	}
	    		
	    	
	    	
	    }
	    
	    public static void clickIDevent(String str){
	        
	    	driver.findElement(By.id(str)).click();
	    }
	    
	    public static void pagescroll(int i){
	    	JavascriptExecutor jse = (JavascriptExecutor)driver;
	    	jse.executeScript("window.scrollBy(0,"+i+")","");
	    	    	
	    }
	   

	  /*  public static void login_in(){
	    	clickevent(Mein_konto_e);
	    	 driver.findElement(By.xpath(email_l_e)).sendKeys(util.getTestData("validemailchangepassword"));
	    	 driver.findElement(By.xpath(pwd_l_e)).sendKeys(util.getTestData("validpasswrd"));
	    	 driver.findElement(By.xpath(login_submit_e)).click();
	    }*/

	 /*   public static void cartadd(){
	    	driver.findElement(By.xpath(addtocart_e)).click();
	    	}
	   */
	    public static void enterdata(String str, String str1){
	    	
	    	driver.findElement(By.xpath(str)).sendKeys(str1);
	    	
	    }
	    
	    
	    
	   public static void enterdataID(String str, String str1){
	    	
	    	driver.findElement(By.id(str)).sendKeys(str1);
	    	
	    }


	  public static boolean elementdisplayed(String str){
		  driver.findElement(By.xpath(str)).isDisplayed();
		  return true;
	  }
	  
	  public static void getelement(String stname, String stelement){
		  String str;
		  
		  List<WebElement> drop = driver.findElements(By.xpath(stelement));
			
			 java.util.Iterator<WebElement> i = drop.iterator();
			
			 while(i.hasNext()) {
				    WebElement row = i.next();
				     str = row.getText();
				
				    if(str.equalsIgnoreCase(stname)){
					   ExtentTestManager.getTest().log(LogStatus.INFO, "clicking on product " + str);
					   row.click();
				    		break;
				    		}
				}
		  
	  }
	  
	 
	  
	  public static String IDgetText(String id){
			String text = null;
			text = driver.findElement(By.id(id)).getText();
			return text;
		}
	  
	  public static String getattribute(String xpath, String att){
		 
		 String st = driver.findElement(By.xpath(xpath)).getAttribute(att);
		return st;
	  }
	  
	  public static boolean guiMatch(String imagePath){
		    boolean match = false;
		
			Screen screen = new Screen();
			
			Pattern image = new Pattern(imagePath);
			
			try {
				screen.wait(image,5000);
				screen.exists(image);
				ExtentTestManager.getTest().log(LogStatus.INFO, "Image match found.");
				match = true;
			} catch (FindFailed e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		  return match;
	  }
	  
	  public static int getCount(String locator){
	  	int count =0;
		String countVal = null;
		countVal = util.getText(locator);
		count = Integer.parseInt(countVal);
	  	return count;
		}
	  
	  public static boolean MatchElement(String stname, String stelement){
		   String str;
		   boolean status = false;
		   
		   List<WebElement> drop = driver.findElements(By.xpath(stelement));
		  
		   java.util.Iterator<WebElement> i = drop.iterator();
		  
		   while(i.hasNext()) {
		    
		      WebElement row = i.next();
		      str = row.getText();
		      System.out.println(str);
		      
		      if(str.contains(stname)){
		           System.out.println("matched");
		        ExtentTestManager.getTest().log(LogStatus.INFO, "Name matched " + str);
		      status = true;
		        
		         }
		      else {
		       
		       ExtentTestManager.getTest().log(LogStatus.INFO, "Name is not matched " + str);
		       status = false;
		       
		           }
		    
		   }
		  return status;
		   
		  }
		  public static boolean MatchElementAttr(String stname, String stelement){
		   String str;
		   boolean status = false;
		   boolean status1 = false;
		   
		   List<WebElement> drop = driver.findElements(By.xpath(stelement));
		  
		   java.util.Iterator<WebElement> i = drop.iterator();
		  
		   while(i.hasNext()) {
		      WebElement row = i.next();
		      str = row.getAttribute("attribute_name");
		      System.out.println(str);
		   
		      if(str.contains(stname)){
		         
		       System.out.println("matched");
		       ExtentTestManager.getTest().log(LogStatus.INFO, "clicking on product " + str);
		       status = true;
		       status1 = status;
		        }
		      
		      else{
		       status = false;
		       }
		   }
		   status = status1;
		   return status;
		  }
		  
		  public static void ClickEnter(String element){

			  
			  WebElement webElement = driver.findElement(By.xpath(element));
			  webElement.sendKeys(Keys.ENTER);
			     
			    }
	      public static String alertOperation(String operation) throws InterruptedException{
	    	  String text=null;
	    	  Alert alert = driver.switchTo().alert();
	    	  
	    	  switch (operation){
	    	  
	    	  case "accept": alert.accept();
	    	  break;
	    	  case "dismiss": alert.dismiss();
	    	  break;
	    	  case "input": alert.sendKeys("");
	    	  break;
	    	  case "getText": text = alert.getText();
	    	  break;
	    	  }
	    	  return text;
	    	  
	    	  }
	      
	      
	      public static String getTitle(){
	  		try {
	  			
	  		return	driver.getTitle();
	  			
	  		} catch (Exception e) {
	  			e.printStackTrace();
	  			return "";
	  		}
	  	}
	    	  
	      public static boolean patternMatching(String imagePath){
	    	  boolean match=false;
	    	  
	    	  
	  		Screen screen = new Screen();
	  		
	  		Pattern image1 = new Pattern(imagePath);
	  		//Pattern image2 = new Pattern("E:\\sikuliImages\\flashJFkennedy.png");
	  		
	  		try {
	  			//screen.wait(image1,2000);
	  			screen.click(image1);
	  			match = true;
	  		} catch (FindFailed e) {
	  			// TODO Auto-generated catch block
	  			e.printStackTrace();	  			
	  		}  
	    	  return match;
	      }
	    	  
	 }
	  



