package com.amazon;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readpoi
{
		public static void main(String[] args) throws Exception {
		File src = new File("E:\\wv_training\\test_data\\testNG_test.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		int row = sheet1.getLastRowNum();
		System.out.println(row);
		int ty = sheet1.getRow(0).getLastCellNum();
		System.out.println(ty);
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < ty; j++) 
			{
				String data = sheet1.getRow(i).getCell(j).getStringCellValue();
				System.out.print(data);
				System.out.print("      ");
			}
			System.out.println("data in row");
		}
		wb.close();
	}
}