import org.openqa.selenium.Alert;		
import org.openqa.selenium.By;		
import org.openqa.selenium.NoAlertPresentException;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;		

public class AlertDemo {				
        		
        public static void main(String[] args) throws NoAlertPresentException {	
        	System.setProperty("webdriver.firefox.marionette", "C:\\Users\\admin\\Desktop\\geckodriver-v0.11.1-win64");
            WebDriver driver = new FirefoxDriver();			
            		
            // Alert Message handling
                        		
            driver.get("http://demo.guru99.com/V4/");			
                                		
            driver.findElement(By.name("uid")).sendKeys("mngr30127");					
            driver.findElement(By.name("password")).sendKeys("EzAtAqy");					
            driver.findElement(By.name("btnLogin")).submit();			
            driver.findElement(By.linkText("Delete Customer")).click();			
            driver.findElement(By.name("cusid")).sendKeys("53920");					
            driver.findElement(By.name("AccSubmit")).submit();			
            		
                // Switching to Alert 
          
            Alert alert=driver.switchTo().alert();
            
          
            		
            
        
            // Accepting alert		
            alert.accept();	
            
        }}
            
                		

