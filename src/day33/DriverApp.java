package day33;

public class DriverApp {

	public static void main(String[] args) {
		
		
		Amitabh a2;		               //Parent class reference 		   
		
		a2=new Amitabh();			   //Parent class object 	   P p = new P()
		
		a2.home();
		
		
		
		Abhishek a3;                  // Child class reference
		
		a3=new Abhishek();			  // Child class object   C c = new C();
		
		a3.home();
		
		
		
		Amitabh a4;					// Parent class reference
		
		a4 = new Abhishek();		// Child class object   P p = new C();  upcasting
		a4.home();
		//a4.car();
		
		
		
		
	}

}
