package day56;

public class DriverApp4 {

	public static void main(String[] args) {
		
			Shape s1 =null;
			
			s1=(radius)->Math.PI*radius*radius;

			
			double result=s1.area(3);
			System.out.println(result);
	}
}
