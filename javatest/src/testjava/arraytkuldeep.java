package testjava;

import java.util.Arrays;

public class arraytkuldeep {

	public static void main(String[] args) {
		String arr[] = "45.75,46.55,49.66,48.77,47,69,89".split(",");
		Arrays.sort(arr);
		
		test1(arr);
		}
	
	public static void  test1(String[] ap) {
		 for(int i=0;i<=ap.length-1;i++){
			 System.out.println( "desc order : "+ap[i]);
			 
		 }
		
	}

}
