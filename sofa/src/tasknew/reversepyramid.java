package tasknew;

import java.util.Scanner;

public class reversepyramid {

	public static void main(String[] args) {
		int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = s.nextInt();
        
        for(int i = n;i>1;i--)
        {
        	for (int j = n;j>i;j--)
        	{
        		System.out.print(" ");
        	}
        	 for(int k = 1;k<i;k++)
        	 {      
        		  for (int s1 = n; s1 > i; s1--)
        		  {
                      System.out.print( k +" ");
                   }
					System.out.print(k + " ");
			 }
          System.out.println();
        }
	}

}
