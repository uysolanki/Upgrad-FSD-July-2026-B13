package day42;

import java.util.ArrayList;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		ArrayList<Login> customers=new ArrayList();
		
		customers.add(new Login("alice@gmail.com","alice123"));
		customers.add(new Login("ben@gmail.com",  "ben123"));
		customers.add(new Login("chris@gmail.com","chris123"));
		
		String searchedEmail="chris@gmail.com";
		int flag=0;
		for(Login customer:customers)
		{
			if(customer.getEmail().equals(searchedEmail))
			{
				System.out.println(searchedEmail + "Customer exists");
				flag=1;
				break;
			}
		}
		
		if(flag==0)
			System.out.println(searchedEmail +" Cusotomer does not exist");
		
		
	}

}
