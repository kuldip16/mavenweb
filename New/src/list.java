import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\admin\\Desktop\\geckodriver-v0.11.1-win64");
		 
		
 
   WebDriver  driver = new FirefoxDriver();
   driver.get("http://toolsqa.com/automation-practice-form/");
   
List<WebElement> name=driver.findElements(By.className("control-label"));
boolean value= true;


value=name.get(0).isSelected();
System.out.println(value);
 

	}

}
