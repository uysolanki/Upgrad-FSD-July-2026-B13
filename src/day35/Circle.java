package day35;

public class Circle implements Shape{

	@Override
	public void area() {
		System.out.println(PI*5*5);
		
	}

	@Override
	public void perimeter() {
	System.out.println(2*PI*5);
	}

}
