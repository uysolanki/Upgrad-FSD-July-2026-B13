package day26;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder name=new StringBuilder("Alice");
		
		name.append(" Peter");
		
		System.out.println(name);
		System.out.println(name.reverse());
		
		//in multi threading env
		StringBuffer name1=new StringBuffer("Virat");
		
		name1.append(" Kohli");
		
		System.out.println(name1);
		System.out.println(name1.reverse());
	}

}
