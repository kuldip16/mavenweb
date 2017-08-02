import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\admin\\Desktop\\geckodriver-v0.11.1-win64");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		List<WebElement> rdBtn_Sex=driver.findElements(By.name("sex"));
		boolean bValue=false;
		bValue=rdBtn_Sex.get(0).isSelected();
		if(bValue==true)
		{
			rdBtn_Sex.get(1).click();
		}
		else
		{
			rdBtn_Sex.get(0).click();
		}
        
	}

}
