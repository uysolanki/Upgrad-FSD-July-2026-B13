package day56;

public class DriverApp3 {

	public static void main(String[] args) {
		
			NewGreeting g1 =null;
			
			g1=(n,c)->{
				System.out.println("Welcome, "+n+ " to "+c);
			};
			
			g1.greet("Virat","Bengaluru");
			g1.greet("Dhoni","Chennai");
			g1.greet("Rohit","Mumbai");		
	}
}
