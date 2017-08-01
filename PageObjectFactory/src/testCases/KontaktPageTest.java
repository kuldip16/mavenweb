package testCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.KontaktPage;
import utility.Base;
import utility.Util;

public class KontaktPageTest extends Base {

	@DataProvider(name = "logindata")

	public Object[][] testData() throws Exception {

		Util.DataProviderExcel("E:\\Automation Projects\\PageObjectFactory\\testDataFolder\\inputtext.xlsx");

		int rows = Util.getRowCount(0);
		int cols = Util.getColCount(0);

		Object[][] data = new Object[rows][cols];
		for (int i = 0; i < rows; i++) {

			data[i][0] = Util.getData(0, i, 0);
			data[i][1] = Util.getData(0, i, 1);
			data[i][2] = Util.getData(0, i, 2);
			data[i][3] = Util.getData(0, i, 3);
			data[i][4] = Util.getData(0, i, 4);
		}
		return data;
	}

	@Test(dataProvider = "logindata")
	public void formfillUp(String uid, String sid, String mailid, String datatext, String msginput)
			throws InterruptedException {

		KontaktPage kp = PageFactory.initElements(driver, KontaktPage.class);

		kp.formSubmit(uid, sid, mailid, datatext, msginput);
		
		System.out.println("done");

	}
}
