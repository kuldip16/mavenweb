package utility;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utility.ExtentManager;
import utility.ExtentTestManager;

public class Base {

	public static ExtentReports extent;
	public static ExtentTest test;
	public static WebDriver driver;

	String browser = Util.getConfigValue("browser");

	
	@BeforeSuite
	public void extentSetup(ITestContext context) {

		ExtentManager.setOutputDirectory(context);
		extent = ExtentManager.getInstance();

	}
	
	

	@BeforeMethod
	public void initializeTestBaseSetup(Method method) {
		try {

			ExtentTestManager.startTest(method.getName());
			launchbrowser(browser, Util.getConfigValue("appUrl"));

		} catch (Exception e) {

			System.out.println("Error....." + e.getStackTrace());
		}
	}

	public static WebDriver launchbrowser(String browswername, String appUrl) {

		if (browswername.equalsIgnoreCase("chrome")) {

			ExtentTestManager.getTest().log(LogStatus.INFO, "Launching chrome browser");

			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browswername.equalsIgnoreCase("firefox")) {

			ExtentTestManager.getTest().log(LogStatus.INFO, "Launching Firefox browser");

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.get(appUrl);

		driver.manage().window().maximize();

		return driver;

	}

	

	@AfterMethod
	public void afterEachTestMethod(ITestResult result) {
		ExtentTestManager.getTest().getTest().setStartedTime(getTime(result.getStartMillis())); // new
		ExtentTestManager.getTest().getTest().setEndedTime(getTime(result.getEndMillis())); // new

		for (String group : result.getMethod().getGroups()) {
			ExtentTestManager.getTest().assignCategory(group); // new
		}

		if (result.getStatus() == 1) {
			ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passed"); // new
		} else if (result.getStatus() == 2) {
			String path = Util.getscreenshot(driver, result.getName());
			// ExtentTestManager.getTest().log(LogStatus.FAIL,
			// getStackTrace(result.getThrowable())); // new
			String image = ExtentTestManager.getTest().addScreenCapture(path);
			ExtentTestManager.getTest().log(LogStatus.FAIL, getStackTrace(result.getThrowable()));
			ExtentTestManager.getTest().log(LogStatus.FAIL, image);
			driver.get(path);
		} else if (result.getStatus() == 3) {
			ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped"); // new
		}

		ExtentTestManager.endTest(); // new

		extent.flush();
		driver.quit();
	}

	protected String getStackTrace(Throwable t) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		t.printStackTrace(pw);
		return sw.toString();
	}

	@AfterSuite
	public void generateReport() {
		extent.close();
	}

	private Date getTime(long millis) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(millis);
		return calendar.getTime();
	}
}
