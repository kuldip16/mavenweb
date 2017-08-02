package loops;

import java.util.Scanner;

public class dowhile {

	public static void main(String[] args) {
		int a;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the integer");
		a= s.nextInt();
		System.out.println("you entered the number :" +a);
		do{
			System.out.println(a);
			a++;
		}while(a<=10);
				

	}

}
