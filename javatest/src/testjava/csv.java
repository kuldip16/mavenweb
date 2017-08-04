package testjava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import com.csvreader.CsvWriter;


public class csv {
	static String csv = "C:\\Users\\Kuldip\\Desktop\\test.ods";
	public static void main(String[] args) throws Exception {
		CSVwrite();
		CSVread();
	}
		public static void CSVwrite() throws Exception
		{
		
		//OutputStreamWriter src = new FileWriter(csv);
		//CsvWriter writer = new CsvWriter(src);
		CsvWriter writer = new CsvWriter(new FileWriter(csv,true),','); 
        String[] country = "India#China#United States".split("#");
		int rt = country.length;
		System.out.println(rt);
		for (int i = 0; i < rt; i++)
		{
		writer.write(country[i]);	
		writer.endRecord();
			
		}
		writer.close();
		}
		
		public static void CSVread() throws IOException 
		{
			FileReader fr = new FileReader(new File(csv));  
		     BufferedReader br = new BufferedReader(fr);  
		     String st;  
		     while ((st = br.readLine()) != null)
		     {  
		       System.out.println(st);  
		     }  
		
		}
	}


