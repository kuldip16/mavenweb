package mypack1;

//import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class mercury_travels {
	WebDriver driver;
	String url;
	@Before
	public void launcbrowser(){
		driver = new FirefoxDriver();
		url = "http://mercurytravels.co.in/";
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
	}
	@Test
	//	public void travel_exact_checkbox(){
	//		driver.get(url);
	//		driver.findElement(By.xpath("//input [@value ='One Way']")).click();
	//		driver.findElement(By.xpath("//input [@id='frm:searchForm:fromFlight0']")).sendKeys("New Delhi");
	//		driver.findElement(By.xpath("//input [@id='frm:searchForm:fromFlight0']")).sendKeys(Keys.TAB);
	//		if(driver.findElement(By.xpath("//input [@value ='exact']")).isSelected());
	//		{
	//			System.out.println("Exact Date check box is selected");}
	//	}
	public void travel(){
		driver.get(url);
		driver.findElement(By.xpath("//input [@value ='One Way']")).click();
		driver.findElement(By.xpath("//input [@id='frm:searchForm:fromFlight0']")).sendKeys("New Delhi");
		driver.findElement(By.xpath("//input [@id='frm:searchForm:fromFlight0']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input [@id='frm:searchForm:toFlight0']")).sendKeys("pune");
		driver.findElement(By.xpath("//input [@id='frm:searchForm:toFlight0']")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("frm:searchForm:departFlight0")).click();
		driver.findElement(By.xpath("//div[@class='calendar']/table/tbody[1]/tr[4]")).click();
		new Select(driver.findElement(By.xpath("//select [@id='frm:searchForm:departTime0']"))).selectByVisibleText("Morning");
		new Select(driver.findElement(By.xpath("//select [@id='frm:searchForm:adultmore']"))).selectByValue("4");
		new Select(driver.findElement(By.xpath("//select[@id='frm:searchForm:childmore']"))).selectByVisibleText("2");
		new Select(driver.findElement(By.xpath("//select[@id='frm:searchForm:infantmore']"))).selectByVisibleText("2");
		driver.findElement(By.xpath(".//div[@class='searchbutton']")).click();
		String result =  driver.findElement(By.xpath("//div [@id='shownoresults']")).getText();
		System.out.println(result);

		}
	}

