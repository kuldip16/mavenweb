package testjava;


import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class snapshot extends checkElement {

	static String url = "http://www.yahoo.com";
	public static void main(String[] args) throws Exception 
	{
		checkElement ce = new snapshot();
		ce.launchbrowser(url);
		snapshot sp = new snapshot();
		sp.takescreenshot();
		checkElement ce1= new checkElement();
		ce1.closebrowser();
	}
	@Override
	public void launchbrowser(String url) {
		// TODO Auto-generated method stub
		super.launchbrowser(url);
	}
	public void takescreenshot() throws IOException 
	{
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Save screen shot desired location
		FileUtils.copyFile(scrFile, new File("D://kuldip//screenshot.png"));
	}
}