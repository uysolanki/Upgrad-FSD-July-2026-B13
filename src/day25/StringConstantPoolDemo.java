package day25;

public class StringConstantPoolDemo {

	public static void main(String[] args) {
		String name="Alice";
		
		String name1="Alice";
		
		String name2="Ben";
		
		String name3= new String("Chris");
		String name4= new String("Chris");
		
		String name5="Chris";
		
		String name6= new String("Alice");
		
		System.out.println(name.equals(name6));   //true
		System.out.println(name==name6);          //false
		
		System.out.println(name3.equals(name5)); //true
		System.out.println(name5==name3); 
		
	}

}
