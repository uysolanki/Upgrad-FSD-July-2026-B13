package day2;

public class FunctionCallinfDemo {

	public static void main(String[] args)    //US
	{
		
		System.out.println("I am in Main");					//1
		brazil();
		System.out.println("I am finally back in Main");   //5
	}

	public static void brazil()
	{
		System.out.println("I am in Brazil");				//2
		france();
		System.out.println("I am back in Brazil");			//4
	}
	
	public static void france()
	{
		System.out.println("I am in France");				//3
	}
}
