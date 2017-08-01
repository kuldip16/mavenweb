package com.moebel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC29 {

	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		WebElement row;
		String url = "https://www.moebel.de/essen/bar-moebel";
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
		driver = new ChromeDriver();
		Actions acn = new Actions(driver);
		driver.get(url);
		
		driver.manage().window().maximize();
		String str;
		Thread.sleep(5000);
		
		List<WebElement> drop = driver.findElements(By.xpath("//div[@class='product_details desktop']//ul[@class='prodtabs hidden-title hide_text_responsive']/li[2]"));
		List<WebElement> drop1 = driver.findElements(By.xpath("//div[@class='slideimg']//div[@class='subcategor_price_tag']"));
		
		System.out.println(drop1.size());
		System.out.println(drop.size());
		
		java.util.Iterator<WebElement> i = drop.iterator();
		java.util.Iterator<WebElement> i1 = drop1.iterator();
		
		int count  = 1;
		int marked = 1;
		
		while (i1.hasNext()) {
			System.out.println("product " + count);
			WebElement we = i1.next();
			acn.moveToElement(we).build().perform();
			System.out.println("product " + count);
			Thread.sleep(4000);
			row = i.next();
			try {
				str = row.getAttribute("class");
				System.out.println(str);
				if (str.contains("gemerkt")) 
				{
					System.out.println("skipping product " + count + "as it is marked already");
					marked++;
				} else
{
					row.click();
					System.out.println("product " + count + "is marked");
				}
			} catch (Exception e) {
				System.out.println("ignore error on product in" + count);
			}
			count++;
			if(count==4){
				break;
			}
		}
		System.out.println("total marked elements are "+marked);
		Thread.sleep(2000);
	}
}