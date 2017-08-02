package newpack;

public class swapnum3rdvar
{
	static int x = 2;
	static int y = 4;
	static int a;
	public static void main(String[] args) 
	{
		a = x;
		x = y;
		y = a;
		System.out.println(x + " test " + y);
	}
}
