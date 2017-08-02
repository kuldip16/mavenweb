package testjava;

import java.io.BufferedReader;  
 import java.io.BufferedWriter;  
 import java.io.File;  
 import java.io.FileNotFoundException;  
 import java.io.FileReader;  
 import java.io.FileWriter;  
 import java.io.IOException;  
 public class txtfile {  
   static File file;  
   public static void main(String[] a) throws FileNotFoundException, IOException {  
     try {  
       file = new File("writetextfile.txt");  
       // if file doesnt exists, then create it  
       if (!file.exists()) {  
         file.createNewFile();  
       }  
       // Write text on txt file.  
       FileWriter fw = new FileWriter(file, true);  
       BufferedWriter bw = new BufferedWriter(fw);  
       bw.write("How to write and read text file in java\n");  
       bw.close();  
     } catch (IOException e) {  
       e.printStackTrace();  
     }  
     // Read text from file.    
     FileReader fr = new FileReader(file);  
     BufferedReader br = new BufferedReader(fr);  
     String st;  
     while ((st = br.readLine()) != null) {  
       System.out.println(st);  
     }  
   }  
 }  