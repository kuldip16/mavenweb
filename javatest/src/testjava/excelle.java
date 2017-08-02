package testjava;

import java.io.File;  
 import java.io.IOException;  
 import jxl.Sheet;  
 import jxl.Workbook;  
 import jxl.read.biff.BiffException;  
 import jxl.write.Label;  
 import jxl.write.WritableSheet;  
 import jxl.write.WritableWorkbook;  
 import jxl.write.WriteException;  
 import jxl.write.Number;  
 public class excelle {  
   public static void main(String[] args) throws BiffException, IOException, WriteException {  
     File file = new File("output.xls");  
     // if file doesnt exists, then create it  
     if (!file.exists()) {  
       file.createNewFile();  
     }  
     // Write Excel file using jxl api  
     WritableWorkbook wworkbook;  
     wworkbook = Workbook.createWorkbook(file);  
     WritableSheet wsheet = wworkbook.createSheet("First Sheet", 0);  
     for (int rows = 0; rows < 10; rows++) {  
       wsheet.addCell(new Label(0, rows, "First Coloum " + rows));  
       wsheet.addCell(new Number(1, rows, 3.1459 + rows));  
       wsheet.addCell(new Label(2, rows, "third Coloum " + rows));  
       wsheet.addCell(new Number(3, rows, 7895 + rows));  
     }  
     wworkbook.write();  
     wworkbook.close();  
     // Read Excel file using jxl api  
     Workbook workbook = Workbook.getWorkbook(file);  
     Sheet sh = workbook.getSheet(0);  
     for (int rows = 0; rows < sh.getRows(); rows++) {  
       for (int colm = 0; colm < sh.getColumns(); colm++) {  
    System.out.print(sh.getCell(colm, rows).getContents() + " ");  
       }  
       System.out.println();  
     }  
   }  
 }  