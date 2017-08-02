package tasknew;

import java.util.Scanner;

public class arrayonedim {

	public static void main(String[] args) {
		int a;
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter num");
		a= s.nextInt();
		int a1[] = new int[a];
		System.out.println("enter array list");
        for(int i = 0;i<a;i++)
        {
        a1[i] = s.nextInt();
        }
      	}

}
