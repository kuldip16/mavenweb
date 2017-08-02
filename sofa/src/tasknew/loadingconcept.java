package tasknew;

interface Info
{
	static final String language = "Java";

	public void display();
}

class Simple implements Info {
	public static void main(String[] args)
	{
		Simple obj = new Simple();
		obj.display();
	}

	public void display() 
	{
		System.out.println(language + " is awesome");
	}
}
