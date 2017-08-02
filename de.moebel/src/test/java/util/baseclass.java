package util;

import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import util.Utilbase;

public class baseclass {
	public static ExtentReports extent;
	public static WebDriver driver;
	String browser = Utilbase.getConfigValue("browser");

	private void setDriver(String browsertype, String appURL) {
		if (browsertype.equalsIgnoreCase("chrome")) {
			driver = launchChromeDriver(appURL);
		} else {
			driver = launchFirefoxDriver(appURL);
		}
	}

	private static WebDriver launchFirefoxDriver(String appURL) {
		// ExtentTestManager.getTest().log(LogStatus.INFO, "Launching Firefox
		// browser");
		System.setProperty("webdriver.gecko.driver", "D:\\Training\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to(appURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}

	private static WebDriver launchChromeDriver(String appURL) {
		// ExtentTestManager.getTest().log(LogStatus.INFO, "Launching chrome
		// browser");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to(appURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}

	@BeforeSuite
	public void extentSetup(ITestContext context) {

		ExtentManager.setOutputDirectory(context);
		extent = ExtentManager.getInstance();
	}

	@BeforeMethod
	public void initializeTestBaseSetup(Method method) {
		try {

			ExtentTestManager.startTest(method.getName());
			setDriver(browser, Utilbase.getConfigValue("appUrl"));
			Thread.sleep(5000);

			WebElement element = driver.findElement(By.xpath("html/body/div[1]/select"));
			Select oSelect = new Select(element);
			oSelect.selectByValue("qa1");
			Thread.sleep(5000);
			driver.findElement(By.xpath("html/body/div[1]/font[2]/a[1]")).click();
			Thread.sleep(5000);
			String parentWindow = driver.getWindowHandle();
			Set<String> handles = driver.getWindowHandles();
			for (String windowHandle : handles) {
				if (!windowHandle.equals(parentWindow)) {
					driver.switchTo().window(windowHandle);

				}
			}
			Thread.sleep(5000);
		} catch (Exception e) {

			System.out.println("Error....." + e.getStackTrace());
		}
	}
}
