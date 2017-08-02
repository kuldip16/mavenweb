package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class sub_cat {

	WebDriver driver;
	String url;
	private int i;
	@Before
	public void launchbrowser(){
		driver = new FirefoxDriver();
		url = "https://www.moebel.de/betatesting.php";
		driver.manage().window().maximize();
		driver.get(url);
		new Select(driver.findElement(By.name("selectlocation"))).selectByVisibleText("Node QA1 {desktop/tablet internal}");
		driver.get("https://www.moebel.de/"); 
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	@Test
	public void count_categories(){
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//a [@href='https://www.moebel.de/bad']"));
		action.moveToElement(we).build().perform();
		WebElement wohnen= driver.findElement(By.xpath("//a [@class='dropdown-toggle disabled']"));  
		System.out.println("Total no. of categories are :" + wohnen.findElements(By.xpath("//a [@class='dropdown-toggle disabled']")).size());
	}
	@Test
	public void wohnen(){
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//a [@href='https://www.moebel.de/wohnen']"));
		action.moveToElement(we).build().perform();
		WebElement ct= we.findElement(By.xpath("//li [@id='wohnen']/ul"));  
		int web = ct.findElements(By.tagName("li")).size(); 
		System.out.println("Total number of sub categories Of wohnen = " + web);
		List<WebElement> List =ct.findElements(By.xpath("//*[@id='wohnen']/ul/li/ul"));
		for (WebElement ele : List)
		{
			ele = List.get(i);
			String value = ele.getText();
			System.out.println("List of sub categories Of wohnen = " + value);
			i=i+1;
		}
	}
	@Test
	public void schlafen(){
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//a [@href='https://www.moebel.de/schlafen']"));
		action.moveToElement(we).build().perform();
		WebElement ct= we.findElement(By.xpath("//li [@id='schlafen']/ul"));  
		int web = ct.findElements(By.tagName("li")).size(); 
		System.out.println("Total number of sub categories Of schlafen = " + web);
		List<WebElement> List =ct.findElements(By.xpath("//*[@id='schlafen']/ul/li/ul"));
		for (WebElement ele : List)
		{
			ele = List.get(i);
			String value = ele.getText();
			System.out.println("List of sub categories Of schlafen = " + value);
			i=i+1;
		}
	}
	@Test
	public void essen(){
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//a [@href='https://www.moebel.de/essen']"));
		action.moveToElement(we).build().perform();
		WebElement ct= we.findElement(By.xpath("//li [@id='essen']/ul"));  
		int web = ct.findElements(By.tagName("li")).size(); 
		System.out.println("Total number of sub categories Of Essen = " + web);
		List<WebElement> List =ct.findElements(By.xpath("//*[@id='essen']/ul/li/ul"));
		for (WebElement ele : List)
		{
			ele = List.get(i);
			String value = ele.getText();
			System.out.println("List of sub categories Of Essen = " + value);
			i=i+1;
		}
	}
	@Test
	public void Bad(){
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//a [@href='https://www.moebel.de/bad']"));
		action.moveToElement(we).build().perform();
		WebElement ct= we.findElement(By.xpath("//li [@id='bad']/ul/li/ul"));  
		int web = ct.findElements(By.tagName("a")).size(); 
		System.out.println("Total number of sub categories Of bad = " + web );
		List<WebElement> List =ct.findElements(By.xpath("//*[@id='bad']/ul/li/ul"));
		for (WebElement ele : List)
		{
			ele = List.get(i);
			String value = ele.getText();
			System.out.println("List of sub categories Of bad =" + value);
			i=i+1;
		}
	}
	@Test
	public void Kinder(){
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//a [@href='https://www.moebel.de/kinder']"));
		action.moveToElement(we).build().perform();
		WebElement ct= we.findElement(By.xpath("//li [@id='kinder']/ul/li/ul"));  
		int web = ct.findElements(By.tagName("a")).size(); 
		System.out.println("Total number of sub categories Of kinder = " + web );
		List<WebElement> List =ct.findElements(By.xpath("//*[@id='kinder']/ul/li/ul"));
		for (WebElement ele : List)
		{
			ele = List.get(i);
			String value = ele.getText();
			System.out.println("List of sub categories Of kinder =" + value);
			i=i+1;
		}
	}
	@Test
	public void flur(){
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//a [@href='https://www.moebel.de/flur']"));
		action.moveToElement(we).build().perform();
		WebElement ct= we.findElement(By.xpath("//li [@id='flur']/ul/li/ul"));  
		int web = ct.findElements(By.tagName("a")).size(); 
		System.out.println("Total number of sub categories Of flur = " + web );
		List<WebElement> List =ct.findElements(By.xpath("//*[@id='flur']/ul/li/ul"));
		for (WebElement ele : List)
		{
			ele = List.get(i);
			String value = ele.getText();
			System.out.println("List of sub categories Of flur =" + value);
			i=i+1;
		}
	}
	@Test
	public void Buro(){
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//a [@href='https://www.moebel.de/buero']"));
		action.moveToElement(we).build().perform();
		WebElement ct= we.findElement(By.xpath("//li [@id='buero']/ul/li/ul"));  
		int web = ct.findElements(By.tagName("a")).size(); 
		System.out.println("Total number of sub categories Of buero = " + web );
		List<WebElement> List =ct.findElements(By.xpath("//*[@id='buero']/ul/li/ul"));
		for (WebElement ele : List)
		{
			ele = List.get(i);
			String value = ele.getText();
			System.out.println("List of sub categories Of buero =" + value);
			i=i+1;
		}
	}
	@Test
	public void Garten(){
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//a [@href='https://www.moebel.de/garten']"));
		action.moveToElement(we).build().perform();
		WebElement ct= we.findElement(By.xpath("//li [@id='garten']/ul/li/ul"));  
		int web = ct.findElements(By.tagName("a")).size(); 
		System.out.println("Total number of sub categories Of garten = " + web );
		List<WebElement> List =ct.findElements(By.xpath("//*[@id='garten']/ul/li/ul"));
		for (WebElement ele : List)
		{
			ele = List.get(i);
			String value = ele.getText();
			System.out.println("List of sub categories Of garten =" + value);
			i=i+1;
		}
	}
	@Test
    public void Lampen(){
    	Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//a [@href='https://www.moebel.de/lampen']"));
		action.moveToElement(we).build().perform();
		WebElement ct= we.findElement(By.xpath("//li [@id='lampen']/ul/li/ul"));  
		int web = ct.findElements(By.tagName("a")).size(); 
		System.out.println("Total number of sub categories Of lampen = " + web );
		List<WebElement> List =ct.findElements(By.xpath("//*[@id='lampen']/ul/li/ul"));
		for (WebElement ele : List)
		{
			ele = List.get(i);
			String value = ele.getText();
			System.out.println("List of sub categories Of lampen =" + value);
			i=i+1;
		}
    }
	@Test
    public void Heimtextilien(){
    	Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//a [@href='https://www.moebel.de/heimtextilien']"));
		action.moveToElement(we).build().perform();
		WebElement ct= we.findElement(By.xpath("//li [@id='heimtextilien']/ul/li/ul"));  
		int web = ct.findElements(By.tagName("a")).size(); 
		System.out.println("Total number of sub categories Of heimtextilien = " + web );
		List<WebElement> List =ct.findElements(By.xpath("//*[@id='heimtextilien']/ul/li/ul"));
		for (WebElement ele : List)
		{
			ele = List.get(i);
			String value = ele.getText();
			System.out.println("List of sub categories Of heimtextilien =" + value);
			i=i+1;
    }
    }
	@Test
    public void Dekoration(){
    	Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//a [@href='https://www.moebel.de/dekoration']"));
		action.moveToElement(we).build().perform();
		WebElement ct= we.findElement(By.xpath("//li [@id='dekoration']/ul/li/ul"));  
		int web = ct.findElements(By.tagName("a")).size(); 
		System.out.println("Total number of sub categories Of dekoration = " + web );
		List<WebElement> List =ct.findElements(By.xpath("//*[@id='dekoration']/ul/li/ul"));
		for (WebElement ele : List)
		{
			ele = List.get(i);
			String value = ele.getText();
			System.out.println("List of sub categories Of dekoration =" + value);
			i=i+1;
    }
    }
	@Test
    public void Baumarkt(){
    	Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("//a [@href='https://www.moebel.de/baumarkt']"));
		action.moveToElement(we).build().perform();
		WebElement ct= we.findElement(By.xpath("//li [@id='baumarkt']/ul/li/ul"));  
		int web = ct.findElements(By.tagName("a")).size(); 
		System.out.println("Total number of sub categories Of baumarkt = " + web );
		List<WebElement> List =ct.findElements(By.xpath("//*[@id='baumarkt']/ul/li/ul"));
		for (WebElement ele : List)
		{
			ele = List.get(i);
			String value = ele.getText();
			System.out.println("List of sub categories Of baumarkt =" + value);
			i=i+1;
    }
    }
	
    @After
	public void closebroser(){
		driver.quit();
	}

}
