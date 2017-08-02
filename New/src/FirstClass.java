import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//webdriver.firefox.marionette
		//System.setProperty("webdriver.firefox.marionette", "true");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Desktop\\geckodriver-v0.11.1-win64\\geckodriver.exe");
WebDriver driver= new FirefoxDriver();
driver.get("https://www.amazon.com");
Actions abc=new Actions(driver); //has both driver and actions capability
WebElement element=driver.findElement(By.xpath(".//*[@id='nav-link-accountList']/span[2]"));
//abc.moveToElement(element).build().perform();
abc.moveToElement(element).build().perform();

WebElement element1=driver.findElement(By.className("Account & Lists"));
abc.contextClick(element1).build().perform();
//abc.keyDown(Keys.SHIFT).moveToElement(toElement);

//abc.contextClick().build().perform();



	}

}
