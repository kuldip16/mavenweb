package TestCases;

import java.awt.AWTException;
import junit.framework.Assert;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import PageObjects.Checkout_Without_SignIn;
import Utility.Base;
import Utility.ExtentTestManager;

public class Checkout_12298_08 extends Base{
	
	@Test (enabled = true)
	public void Checkoutsignup() throws InterruptedException, AWTException{
		ExtentTestManager.getTest().log(LogStatus.INFO, "Verify the checkout process without existing user");
		boolean getstatus = Checkout_Without_SignIn.checkout_signup();
		Assert.assertTrue(getstatus);
	}

}
