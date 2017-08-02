package Registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Logo_Verification {

	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.moebel.de/betatesting.php");
		driver.manage().window().maximize();
		new Select(driver.findElement(By.name("selectlocation"))).selectByVisibleText("Node QA1 {desktop/tablet internal}");
		driver.get("https://www.moebel.de/"); 
		//verify that launched page having logo or not
		if(driver.findElement(By.xpath("//img [@class='img-responsive']")).isDisplayed())
		{
			System.out.println("Logo is present on Home page");}
		else
		{ 
			System.out.println("Logo is absent");}
        //To close the browser  
		driver.quit();
	}
}
