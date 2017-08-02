package testjava;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class imagesurlmoebel extends checkElement {
	static WebDriver driver;
	static String url = "http://www.moebel.de/wohnen";
	public static void main(String[] a) throws InterruptedException
	{
		checkElement ce = new checkElement();
		ce.launchbrowser(url);
		imagesurlmoebel imgurl= new imagesurlmoebel();
		imgurl.imageurl();
		driver.quit();
	}
public void imageurl() throws InterruptedException{
	List<WebElement> links = driver.findElements(By.tagName("a"));
	for (WebElement ele : links) 
	{
		if (!(ele.getAttribute("href") == null)
				&& !(ele.getAttribute("href").contains("javascript:void(0)")))
		{
			driver.get(ele.getAttribute("href"));
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			List<WebElement> imageurls = driver.findElements(By.tagName("img"));
			System.err.println("Page URL =: " + driver.getCurrentUrl());
			// get all images url
			for (WebElement ele1: imageurls) 
			{
				if (!(ele1.getAttribute("src").equals(""))
						&& !(ele1.getAttribute("src") == null))
				{
					System.out.println(ele1.getAttribute("src"));
				}
			}
			/*driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "w");
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");
			driver.switchTo().defaultContent();*/
			Thread.sleep(3000);
		}
	}
}
}