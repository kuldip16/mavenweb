package Registration;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Header_new {


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.moebel.de/betatesting.php");
		driver.manage().window().maximize();
		new Select(driver.findElement(By.name("selectlocation"))).selectByVisibleText("Node Devel1 {internal}");
		driver.get("https://www.moebel.de/"); 
		Thread.sleep(5000L);
		int size = driver.findElements(By.tagName("a")).size();
		System.out.println(size);

		List<String> Linkarray = new ArrayList<String>();

		List<WebElement> Linklist = driver.findElements(By.tagName("a"));

		for (WebElement link : Linklist) {

			String links = link.getText();
			Linkarray.add(links );

		}
		for (String linkToTest : Linkarray){
			System.out.println(driver.getTitle());
			driver.findElement(By.linkText(linkToTest)).click();

			Thread.sleep(15000L);
			if(driver.getTitle().contains("404")) {
				System.out.println("Fail");
			}
			else
			{
				System.out.println("pass");
			}

			Thread.sleep(5000L);
		} 
		driver.close();

	}
}


