package testjava;

import org.apache.xpath.operations.String;

public class arrayone {
	
	
	

public static void main(String[] array) 
{
		String [] Ani= {"tiger" ,"Lion", "Leopard"};
		System.out.println(Ani.length);
		 print_Ani(Ani);
		

	}
	public static void print_Ani(String[] sarray){
		
		for(int i=0;i<3;i++){
			System.out.println(sarray[i]);
			
		}
	}

}
