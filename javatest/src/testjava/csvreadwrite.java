package testjava;

import java.io.FileWriter;


import com.csvreader.CsvWriter;


public class csvreadwrite {
	String csv = "C:\\Users\\Kuldip\\Desktop\\test.ods";
	public static void main(String[] args) throws Exception 
	{
		csvreadwrite csv1 = new csvreadwrite();
	    csv1.CSVWrite();
	}

	public void CSVWrite() throws Exception
	{
		CsvWriter writer = new CsvWriter(new FileWriter(csv,true),',');
		String [] country = "INDIA#GERMANY#CANADA".split("#");
		int val = country.length;
		System.out.println(val);
		for(int i = 0;i<val;i++)
		{
			writer.write(country[i]);
			writer.endRecord();
		}
		writer.close();
	}



}
