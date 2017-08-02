package Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilitypart1.baseclass;
import PageObjects.flyout;
import utilitypart1.util;

public class flyouttest extends baseclass {
	//public int i;
	public static int i;
	
	@Test
	public static void flyoutcheck (){
	util.mousehoverVj(flyout.bad);
	WebElement a1= driver.findElement(By.xpath("//a [@class='dropdown-toggle disabled']"));  
	System.out.println(a1.findElements(By.xpath("//a [@class='dropdown-toggle disabled']")).size());
    List<WebElement> List = a1.findElements(By.xpath("//*[@id='bad']/ul/li/ul"));
    for (WebElement ele : List)
    {

        ele = List.get(i);
        String value = ele.getText();
        System.out.println("sub categories = " + value);
         i=i+1;
    }
		
	}

	
}

