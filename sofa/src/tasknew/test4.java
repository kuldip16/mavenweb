package tasknew;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = s.nextInt();
        
        for(int i = 0;i<n;i++)
        {
        	for (int j = 0;j<n-i;j++)
        	{
        		System.out.print(" ");
        	}
        	 for(int k = 0;k<=i;k++)
        	 {        			
					System.out.print(k + " ");
			}
          System.out.println();
        }
	}

}
