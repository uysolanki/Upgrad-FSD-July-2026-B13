package day28;

import java.util.Scanner;

public class Supplier {
	
	private int supplierId;
	private String supplierName;
	private String supplierCity;
	private String supplierEmail;
	private long supplierContactNumber;
	private boolean isCODAccepted;
	
	public void acceptSupplier()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Supplier ID");
		supplierId=sc.nextInt();
		
		System.out.println("Enter Supplier Name");
		supplierName=sc.next();
		
		System.out.println("Enter Supplier City");
		supplierCity=sc.next();
		
		System.out.println("Enter Supplier Email");
		supplierEmail=sc.next();
		
		System.out.println("Enter Supplier Contact Number");
		supplierContactNumber=sc.nextLong();
		
		System.out.println("do you accept cash on delivery true/false");
		isCODAccepted=sc.nextBoolean();	
	}
	
	public void displaySupplier()
	{
		System.out.println("Supplier ID is " +supplierId);
		
		System.out.println("Supplier Name is "+ supplierName);
		
		System.out.println("Supplier City is "+ supplierCity);
		
		System.out.println("Supplier Email is "+ supplierEmail);
		
		System.out.println("Supplier Contact Number is "+ supplierContactNumber);
		
		System.out.println("COD accpeted " + (isCODAccepted?"Yes":"No"));
	}
	
	public void test()
	{
		Supplier s2=new Supplier();   //Anant object
		System.out.println(s2.supplierId);
	}

}
