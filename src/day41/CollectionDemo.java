package day41;

import java.util.ArrayList;
import java.util.Vector;

import day38.UpgradStudent;

public class CollectionDemo {

	public static void main(String[] args) {
		
		Vector vector=new Vector();     //NoArgsConstructor
										//default capacity = 10   default increment = double

		System.out.println("CAPACITY " +vector.capacity());
		System.out.println("SIZE " +vector.size());
		
		vector.add(10);
		vector.add("Alice");
		vector.add(true);
		vector.add(10.0);
		vector.add(new UpgradStudent(1,"Alice",78.5));
		
		
		System.out.println(vector);
		
		
		System.out.println("CAPACITY " +vector.capacity());
		System.out.println("SIZE " +vector.size());
		
		String name=(String)vector.get(1);
		int a=(int)vector.get(0);
		double b=(double)vector.get(3);
		
		System.out.println("My name is "+name);
		System.out.println("I am "+a + " year old");
		
		for(int i=1;i<=5;i++)
		{
			vector.add("Alice");
		}
		
		System.out.println("CAPACITY " +vector.capacity());
		System.out.println("SIZE " +vector.size());
		
		vector.add("Alice");
		
		System.out.println("CAPACITY " +vector.capacity());
		System.out.println("SIZE " +vector.size());
		
		//vector.get(11);
		ArrayList a1=new ArrayList();
		a1.add(10);
		
		a1.get(1);
	}

}
