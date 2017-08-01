package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import utility.Base;

public class KontaktPage extends Base {

	@FindBy(xpath = ".//*[@id='herrId']")
	WebElement sex;

	@FindBy(how = How.XPATH, using = ".//*[@id='vorname']")
	WebElement username;

	@FindBy(how = How.XPATH, using = ".//*[@id='name']")
	WebElement lastname;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='emailAddress']")
	WebElement email;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='kontaktform']/div[8]/div/input")
	WebElement checkbox;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='nachricht']")
	WebElement textArea;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='kontaktform']/div[15]/input")
	WebElement submitButton;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='successFullySent']")
	WebElement successMessage;
	
	@FindBy(how = How.ID, using = "popup_message")
	WebElement errorMessage;

	public KontaktPage(WebDriver driver) {

		Base.driver = driver;

	}

	public void formSubmit(String uname, String sname, String mail, String text, String msg)
			throws InterruptedException {
		sex.click();
		utility.ExtentTestManager.getTest().log(LogStatus.INFO, "Radiobutton: Sex is selected");
		username.sendKeys(uname);
		utility.ExtentTestManager.getTest().log(LogStatus.INFO, "User firstname is enetred");
		lastname.sendKeys(sname);
		utility.ExtentTestManager.getTest().log(LogStatus.INFO, "Last name is entered");
		email.sendKeys(mail);
		utility.ExtentTestManager.getTest().log(LogStatus.INFO, "Email id is entered");
		checkbox.click();
		utility.ExtentTestManager.getTest().log(LogStatus.INFO, "checbox is selected");
		textArea.sendKeys(text);
		utility.ExtentTestManager.getTest().log(LogStatus.INFO, "text is written");
		submitButton.click();
		utility.ExtentTestManager.getTest().log(LogStatus.INFO, "Clicked on submit button.");
System.out.println("test");
		Thread.sleep(5000);

		formvalidation(msg);

	}

	public void formvalidation(String message) {
		String expected = "Die Nachricht wurde erfolgreich übermittelt.";
		String actual = null;

		if (successMessage.isDisplayed()) {

			actual = successMessage.getText();
			utility.ExtentTestManager.getTest().log(LogStatus.INFO, "page is submitted successfully");

		} else if (errorMessage.isDisplayed()) {

			actual = errorMessage.getText();
			utility.ExtentTestManager.getTest().log(LogStatus.INFO, "Error message is appeared");
		}

		Assert.assertEquals(actual, expected, message);

	}
}
