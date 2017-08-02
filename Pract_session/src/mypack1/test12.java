package mypack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class test12 {
  

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		String url = "http://www.wikipedia.org/";
		driver.get(url);
		
		driver.findElement(By.xpath("//select [@id='searchLanguage']"));
		Select  select = new Select(driver.findElement(By.xpath("//select [@id='searchLanguage']")));
		select.getOptions();
		select.selectByValue("hi");
		List<WebElement> options= select.getOptions();
	    System.out.println(options.size());
	    
	    for(int i = 0 ; i< options.size(); i++)
	    {
	    	System.out.println(options.get(i).getText());
	    	
	    	
	    	
	    }
	    	
				
		
		

	}

}
