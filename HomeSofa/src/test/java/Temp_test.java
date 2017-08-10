import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Temp_test {
	WebDriver driver;
	private LinkedList<String> initial = new LinkedList<String>();
	private LinkedList<String> last = new LinkedList<String>();
	private By product_price = By.xpath(".//*[@id='view_full_size']/section/div/div/figure/figcaption/div/div/span[2]");
	@Test
	public void sorttest() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.homesofa.de/");
		Actions action = new Actions(driver);

		action.moveToElement(
				driver.findElement(By
						.xpath(".//*[contains(text(),'Ecksofas & Wohnlandschaften')]")))
				.build().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(
				By.xpath(".//*[@title='Wohnlandschaft']"))
				.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		last = pick_price();
		Collections.sort(last);

		action.moveToElement(
				driver.findElement(By
						//.xpath("html/body/div[3]/div/div[2]/div/div/div/div[4]/div[1]")))
						.cssSelector(".sort-itm.itm-productSort.itm-productSort-sales")))
				.build().perform();

		driver.findElement(
				By.xpath(".//*[contains(text(),'Preis: aufsteigend')]"))
				.click();
		pick_price();
		compare();

		driver.close();

	}

	private LinkedList<String> pick_price() {
		List<WebElement> list_elements = driver
				.findElements(product_price);
		for (WebElement e : list_elements) {
			initial.add(e.getText().replaceAll("\\D+", ""));
		}

		return initial;
	}

	private void compare() {
		for (int i = 0; i < initial.size(); i++) {
			Assert.assertEquals(initial.get(i), last.get(i));
		}
	}

}
