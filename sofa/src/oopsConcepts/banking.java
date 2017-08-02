package oopsConcepts;

public class banking {
	
	 int Ac_no;
	 protected String name;
	 private float balance;
	 public int rollno;
	  
	  void insert(int a,String n,float bal){ 
		  Ac_no= a;
		 name= n;
		 balance= bal;
		 
		  }  
	  protected void deposit(float bal){
		  if(bal<0){
			  System.out.println("error");
		  }
		  else{
		  balance= balance+bal;
		  
		  System.out.println(bal+ " rupees deposited");
		  }    
	  }
	  
  void withdraw(float bal){
		  if(balance<bal){
			  System.out.println("insufficient balance in account");
		  }
		  else{
			  balance= balance-bal;
			  
			  System.out.println(bal+ " rupees withdrawal done");  
		  }
		    
		  }
       void checkbalnce(){
	  System.out.println("balance is:"+ balance );	 
	  }
       void display(){
    	   System.out.println(Ac_no+" "+name+" "+balance);}  
	public static void main(String[] args) {
		
		banking b1= new banking();
		banking b2= new banking();
		b1.insert(101, "ishan", 0);
		b1.display();
		b1.checkbalnce();
		
		b1.deposit(100000);
		b1.checkbalnce();
		b1.withdraw(200000);
		b1.withdraw(50000);
		b1.checkbalnce();
		b1.display();

	}

}
