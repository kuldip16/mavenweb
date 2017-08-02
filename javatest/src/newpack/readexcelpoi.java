package newpack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class readexcelpoi {

	public static void main(String[] args) throws BiffException, IOException {
		File file = new File("C:\\Users\\Kuldip\\Desktop\\16553.txt");
		if(!file.exists()){
			file.createNewFile();
		}
		FileInputStream src = new FileInputStream(file);
		XSSFWorkbook owb = new XSSFWorkbook(src);
		XSSFSheet ost = owb.getSheetAt(0);
		int rows = ost.getLastRowNum();
		int columns = ost.getRow(0).getLastCellNum();
        //with java JXl
		/*orkbook owb= Workbook.getWorkbook(file);
        Sheet ost= owb.getSheet("sheet1");
        int rows = ost.getRows();
        int columns = ost.getColumns();*/
        String input[][]= new String[rows][columns];
        for(int i = 0;i<rows ;i++)
        {
        	for(int j = 0;j<rows ;j++)
        	{
        		String data= ost.getRow(i).getCell(j).getStringCellValue();
        		
        		System.out.print(data);
        		System.out.print("      ");
                	}
        System.out.println("      " );
        
        }
        owb.close();
	}

}

