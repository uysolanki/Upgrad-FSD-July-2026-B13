package day33;

public class Abhishek extends Amitabh{

	protected String qualification = "MBA";          //property = qualifaction
	@Override
	void home()						//name is same arguement is same
									//overriding inheritance is required
	{
		System.out.println("new jalsa");
	}
	
	void car()											//methods = 2 home() + car()
	{
		System.out.println("Audi");
	}
}
