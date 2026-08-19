package day33;

public class DriverApp2 {

	public static void main(String[] args) {
		
		Amitabh a1;
		
		a1=new Amitabh();       	//allowed
		a1=new Abhishek();       	//allowed
		a1=new Aradhya();        	//allowed
		
		 a1.home();           		//new jalsa
		
		
		Abhishek a2;
		a2=new Abhishek();       
		a2=new Aradhya();       
		
		a2.home();				//new jalsa
		a2.car();				//audi
		
		
		Aradhya a3;
		a3=new Aradhya();
		
		a3.home();               //new jalsa
		a3.car();				 //audi
		a3.office();             //bandra office
	}

}
