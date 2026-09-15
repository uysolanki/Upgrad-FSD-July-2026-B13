package day52;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,Double>  employees=new HashMap(); //insertion order is not preserved
		
		employees.put("Alice", 800.0);
		employees.put("Ben",   900.0);
		employees.put("Chris", 1600.0);
		employees.put("David", 1100.0);
		
		System.out.println(employees);
		
		System.out.println(employees.keySet());
		System.out.println(employees.values());
		
		// display name of emps earning more than 999
		
		System.out.println("*** Emps name earning more than 999 are as follows ***");
		for(Entry<String,Double> emp : employees.entrySet())
		{
			if(emp.getValue()>999)
				System.out.println(emp.getKey());
		}
		
		// display name of emp earning max sal;
		
		String empName="";
		double maxSal=0.0;
		
		for(Entry<String,Double> emp : employees.entrySet())
		{
			if (emp.getValue()>maxSal)
				{
				maxSal=emp.getValue();
				empName=emp.getKey();
				}
		}
		
		System.out.println("Name of emp earning max sal is "+empName);
		
		
		employees.put("Chris", 2000.0);
		System.out.println(employees);
	}
}
