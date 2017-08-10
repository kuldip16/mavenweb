package Utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

public class util extends Base {
	protected static FileReader reader;
	protected static Properties properties;
	
	public static String getConfigValue(String key){
		String val=null;
		try {
			reader = new FileReader("D:\\Automation Test\\HomeSofa\\config.properties");
			properties = new Properties();
			properties.load(reader);
			val = properties.getProperty(key);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return val;
	}
	
	
	public static String getTestData(String key){
		String val=null;
		try {
			reader = new FileReader(util.getConfigValue("testData"));
			properties = new Properties();
			properties.load(reader);
			val = properties.getProperty(key);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return val;
	}
	
	public static String getscreenshot(WebDriver driver,String screenshotName)
    {    
		String filePath=null;
		try{
            File scrnFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            filePath  = "D:\\Automation Test\\HomeSofa\\Screenshots\\"+screenshotName+".png";
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
		selectDrop.selectByVisibleText(text);
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
//    	 daydropdown.selectByVisibleText(util.getTestData("day"));
    	int i= Integer.parseInt(str2);
    	daydropdown.selectByIndex(i); 
    	
    	
    }

    public void addremovewishlist(String ctr, String wishlistbttn) throws InterruptedException{
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
    }

    public static void clickevent(String str){
    
    	driver.findElement(By.xpath(str)).click();
    }
    
    public static void clickIDevent(String str){
        
    	driver.findElement(By.id(str)).click();
    }
    
    public static void pagescroll(int i){
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
    	jse.executeScript("window.scrollBy(0,"+i+")","");
    	    	
    }
   

    public static void login_in(){
    	clickevent(Mein_konto_e);
    	 driver.findElement(By.xpath(email_l_e)).sendKeys(util.getTestData("validemailchangepassword"));
    	 driver.findElement(By.xpath(pwd_l_e)).sendKeys(util.getTestData("validpasswrd"));
    	 driver.findElement(By.xpath(login_submit_e)).click();
    }

    public static void cartadd(){
    	driver.findElement(By.xpath(addtocart_e)).click();
    	}
   
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
  
  
}
