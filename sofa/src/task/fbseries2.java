package task;

import java.util.Scanner;

public class fbseries2 {
	
	
	   public static void fbseries(int a) {
		int n1=0,n2=1,n3;
		System.out.println(n1);
		System.out.println(n2);
		for(int i = 2;i<a;++i){
			n3= n2+n1;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
		}
		
	}
	public static void main(String[] args) {
		int a;
		Scanner s = new Scanner(System.in);
		System.out.println("@ Kuldip : enter the number ");
		a= s.nextInt();
		System.out.println("fb series of first " +a);
		fbseries(a);
		
		
	}
}


