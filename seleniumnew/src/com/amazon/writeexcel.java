package com.amazon;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeexcel {

		public static void main(String[] args) throws Exception 
		{
		File src = new File("E:\\wv_training\\test_data\\testNG_test.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		sheet1.getRow(0).createCell(2).setCellValue("pass");
		sheet1.getRow(1).createCell(3).setCellValue("fail");
	    }
	
}