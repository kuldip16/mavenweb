package Registration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class List_of_links {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.moebel.de/betatesting.php");
		driver.manage().window().maximize();
		new Select(driver.findElement(By.name("selectlocation"))).selectByVisibleText("Node QA1 {desktop/tablet internal}");
		driver.get("https://www.moebel.de/"); 

		WebElement links= driver.findElement(By.tagName("div"));  
		System.out.println(links.findElements(By.tagName("div")).size()) ; 

		List<WebElement> list=driver.findElements(By.xpath("//*[@href or @src]"));

		for(WebElement e : list){
			String link = e.getAttribute("href");
			if(null==link)
				link=e.getAttribute("src");
			System.out.println(e.getTagName() + "=" + link);
		}
	}

}
