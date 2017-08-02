package testjava;

import java.util.Arrays;

public class arrayobject extends moebelcdn{

	public static void main(String[] args) {
		
		
		
        String[] a= {"abc","bcd","cde","def","efg"};
        ap(a);
	}
   public static void ap(String[] array){
	  Arrays.sort(array);
	   for (int i = 0; i<= array.length-1 ; i++ ){
		   System.out.println(array[i]);
	   }
   }
}
