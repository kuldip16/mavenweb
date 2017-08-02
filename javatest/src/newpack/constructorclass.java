package newpack;

public class constructorclass {
int i;
	public static void main(String[] args) {
		constructorclass ccl = new constructorclass();
		//ccl.deep();

	}
      constructorclass()
	{
		
		System.out.println(i);
	}

	void deep(){
		
		System.out.println("void");
	}
}
