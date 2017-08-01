package com.moebel;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class detailurl {

	public static void main(String[] args) throws Exception 
	{
		String url = "https://www.moebel.de/betatesting.php";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.xpath("html/body/div/select"));
		Select osel = new Select(element);
		osel.selectByValue("qa1");
		System.out.println("testing page switch");
		driver.findElement(By.xpath("html/body /div[1]/font[2]/a[1]")).click();
		Thread.sleep(1000);

		Set<String> tab_handles = driver.getWindowHandles();
		int number_of_tabs = tab_handles.size();
		int i = number_of_tabs - 1;
		driver.switchTo().window(tab_handles.toArray()[i].toString());
		System.out.println(driver.getTitle());
		Thread.sleep(2000);

		Actions act = new Actions(driver);
		WebElement we = driver.findElement(By.xpath(".//*[@id='nav_wohnen']/a"));
		act.moveToElement(we).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='sofas']")).click();

		Actions act1 = new Actions(driver);
		WebElement we1 = driver.findElement(By.xpath(".//*[@id='content']/div/div/div[1]/div[2]/div/div[1]"));
		act1.moveToElement(we1).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='content']/div/div/div[1]/div[2]/div/div[3]/ul/li[1]")).click();
		driver.findElement(By.xpath(".//*[@id='white_content']/div/div[4]/div[2]/div[1]/span")).click();
		WebElement cop = driver.findElement(By.xpath(".//*[@id='urlText']"));
		String url1 = cop.getAttribute("value");
		System.out.println(url1);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(2));
		
		driver.get(url1);
		System.out.println(driver.getTitle());
	}
}
