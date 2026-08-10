package day26;

public class StringFunctions {

	public static void main(String[] args) {     //  0      1   	 2       3       4        5
		String name="viratr";                     // 'v'    'i'   	'r'  	 'a'     't'      'r'
		
		//charAt
		
		System.out.println(name.charAt(2));  //r
		
		//indexOf
		System.out.println(name.indexOf('r'));
		
		//indexOf
		System.out.println(name.lastIndexOf('r'));
		
		
		System.out.printf("%s%d\n","shoes",1500);
		System.out.printf("%s%d\n","Tie",800);
		System.out.printf("%s%d\n","Trouser",2000);
		System.out.printf("%s%d\n","Total",4300);
		
		//format
		System.out.println(String.format("%-10s%5d", "shoes",1500));
		System.out.println(String.format("%-10s%5d", "Tie",800));
		System.out.println(String.format("%-10s%5d", "Trouser",2000));
		System.out.println(String.format("%-10s%5d", "Total",4300));
		
		String name1="Mahendra Singh Dhoni";
		name1=name1.replace("Singh", "Kumar");
		System.out.println(name1);
		
		System.out.println(name1.contains("Kohli"));
		
		String email1="abc@upgrad.com";
		String email2="pqr@upgrade.com";
		String email3="lmn@upgrad.com";
		
		System.out.println("---");
		System.out.println(email1.endsWith("upgrad.com"));
		System.out.println(email2.endsWith("upgrad.com"));
		System.out.println(email3.endsWith("upgrad.com"));
		
		
		
		
		

	}
}

/*
Format A
shoes1500
Tie800
Trouser2000
Total4300


Format B
shoes     1500
Tie        800
Trouser   2000
Total     4300
 
Format C
     shoes1500
       Tie800
   Trouser2000
     Total4300
*/
