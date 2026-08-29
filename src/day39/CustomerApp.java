package day39;

import java.util.Arrays;

public class CustomerApp {

	public static void main(String[] args) {
		Customer c1=new Customer(1, "Alice", "alice@gmail.com", "Pune", 9890123111L);
		Customer c2=new Customer(2, "Ben", 	 "ben@gmail.com",   "Pune", 9890123222L);
		Customer c3=new Customer(3, "Chris", "chris@gmail.com", "Pune", 9890123333L);
		Customer c4=new Customer(4, "David", "david@gmail.com", "Delhi",9890123444L);
		Customer c5=new Customer(5, "Elcid", "elcid@gmail.com", "Delhi",9890123555L);
		
		Customer customers[]=new Customer[5];
		
		customers[0]=c1;
		customers[1]=c2;
		customers[2]=c3;
		customers[3]=c4;
		customers[4]=c5;
		
		System.out.println(Arrays.toString(customers));
		
		String searchEmail="tom@gmail.com";   //expected ans : Not Found
		//String searchEmail="alice@gmail.com";	//expected ans : Found
		int flag1=0;
		for(int i=0;i<customers.length;i++)
		{
			if(customers[i].search(searchEmail))
			{
				System.out.println("Customer by the email " + searchEmail + " exists in the Database");
				flag1=1;
				break;
			}
		}
		
		if(flag1==0)
			System.out.println("Customer by the email " + searchEmail + " does NOT exists in the Database");
		
		
		long searchMobile=9890123444L;	//expected ans : Found
		int flag2=0;
		for(int i=0;i<customers.length;i++)
		{
			if(customers[i].search(searchMobile))
			{
				System.out.println("Customer by the mobile number " + searchMobile + " exists in the Database");
				flag2=1;
				break;
			}
		}
		
		if(flag2==0)
			System.out.println("Customer by the mobile number " + searchMobile + " does not exists in the Database");
		
	}

}
