package loops;

import java.util.Scanner;

public class breakloop {

	public static void main(String[] args) {
		int a;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the integer");
		a= s.nextInt();
		System.out.println("you entered the number :" +a);
		
		for(int i = 1;i<=a;i++){
			if(i==5){
				break;
			}
			System.out.println(i);
		}

	}

}
