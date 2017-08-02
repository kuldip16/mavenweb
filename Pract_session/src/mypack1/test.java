package mypack1;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class test {
	WebDriver driver;
	String url;
	@Test (priority = 2)
	public void TestA(){
		Assert.assertEquals("gmail", "gmail");
		}
		@Test (priority = 3)
		public void testD(){
			Assert.assertEquals("gmail2", "gmail");
		}
		@Test (priority = 1)
		public void testC(){
			Assert.assertEquals("gmail3", "gmail3");
}
		}
