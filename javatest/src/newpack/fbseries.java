package newpack;



public class fbseries 
{
	static int f1= 0;
	static int f2= 1;
	static int sum = 0;
	static int count = 10;
	public static void main(String[] args)
	{
		System.out.println(f1);
		System.out.println(f2);
		
		for(int i = 2;i<count; i++)
		{
			sum = f1+ f2;
			f1=f2;
			f2= sum;
			System.out.println(sum);
			
			
		}
	}

}
