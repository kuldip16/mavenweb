import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\admin\\Desktop\\geckodriver-v0.11.1-win64");
		WebDriver driver =new FirefoxDriver();
		String url="https://www.facebook.com";
		driver.get(url);
		Select oselect=new Select(driver.findElement(By.id("day")));
		Select bselect=new Select(driver.findElement(By.id("month")));
		oselect.selectByVisibleText("16");
		bselect.selectByVisibleText("Jan");
	
		// by index
		// by value
		//get options
		List <WebElement> element =oselect.getOptions();
		System.out.println(element.size());
		

	}

}
