package loops;

import java.util.Scanner;

public class whileloop {

	public static void main(String[] args) {
		int a;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the integer");
		a= s.nextInt();
		System.out.println("you entered the number :" +a);
        while (a<=15){
        	System.out.println(a);
        	a++;
        	
        }	
     
	}

}
