package newpack;

import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class readexcel {

	public static void main(String[] args) throws BiffException, IOException {
		File file = new File("C:\\Users\\Kuldip\\Desktop\\16553.xls");
		if(!file.exists()){
			file.createNewFile();
		}
        Workbook owb= Workbook.getWorkbook(file);
        Sheet ost= owb.getSheet("sheet1");
        int rows = ost.getRows();
        int columns = ost.getColumns();
        String input[][]= new String[rows][columns];
        for(int i = 0;i<rows ;i++)
        {
        	for(int j = 0;j<rows ;j++)
        	{
        		Cell c= ost.getCell(j, i);
        		input[i][j]=c.getContents();
        		System.out.println(input[i][j]);
        	}
        }
	}

}

