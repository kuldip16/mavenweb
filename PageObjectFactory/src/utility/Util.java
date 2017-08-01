package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class Util extends Base{

	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	
	protected static FileReader reader;
	protected static Properties properties;

	

	public static XSSFWorkbook DataProviderExcel(String path) throws Exception {

		File src = new File(path);
		FileInputStream fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);

		return wb;

	}

	
	public static String getData(int sheetindex, int row, int col) throws IOException {

		sheet = wb.getSheetAt(sheetindex);

		String data = sheet.getRow(row).getCell(col).getStringCellValue();

		return data;

	}

	public static int getRowCount(int sheetindex) {

		int row = wb.getSheetAt(sheetindex).getLastRowNum();
		row = row + 1;
		return row;
	}
	
	public static int getColCount(int sheetindex) {

		int Col = wb.getSheetAt(sheetindex).getRow(0).getLastCellNum();
	
		return Col;
	}
	
	public static String getConfigValue(String key){
		String val=null;
		try {
			reader = new FileReader("config.properties");
			properties = new Properties();
			properties.load(reader);
			val = properties.getProperty(key);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return val;
	}
	
	public static String getscreenshot(WebDriver driver,String screenshotName)
    {    
		String filePath=null;
		try{
            File scrnFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            filePath  = "E:\\Automation Projects\\PageObjectFactory\\screenshots\\"+screenshotName+".png";
           
            FileUtils.copyFile(scrnFile, new File(filePath));
            
    }catch(Exception e){
    	   e.printStackTrace();
    }
    
	return filePath;
    }

}
