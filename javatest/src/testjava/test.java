package testjava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.csvreader.CsvWriter;

public class test {
	static String eles = "";
	static String urls = "";
	static List<String> finalUrls = new ArrayList();
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		launchbrowser();
		urlgettrim();
		urlwr();

	}

	public static void launchbrowser() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yahoo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void urlgettrim() {
		List<WebElement> urlslist = driver.findElements(By.tagName("a"));
		try {
			for (WebElement ele : urlslist) {
				if ((ele.getAttribute("href").trim().length() > 10)
						&& (ele.getAttribute("href").trim().contains("yahoo.com"))) {
					eles = eles + ele.getAttribute("href").trim() + "\n";
					System.out.println(eles);
					finalUrls.add(eles);
				}
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

	}

	public static void urlwr() {
		try {
			File file = new File("C:\\Users\\Kuldip\\Desktop\\test.ods");

			if (!file.exists()) {
				file.createNewFile();
			}
			CsvWriter writer = new CsvWriter(new FileWriter(file, true), ',');

			String[] stockArr = new String[finalUrls.size()];
			stockArr = finalUrls.toArray(stockArr);
			writer.writeRecord(stockArr);

			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
