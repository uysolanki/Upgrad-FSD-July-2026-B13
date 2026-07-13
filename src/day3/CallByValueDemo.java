package day3;

public class CallByValueDemo {

	public static void main(String[] args) {
		double a=10;
		System.out.println(a);   //10
		test(a);//primitive will be considered as call by value					//actual parameter
		System.out.println(a);   //10
	}

	public static void test(double b)										//formal parameter
	{
		System.out.println(b);   //10
		b=99;
		System.out.println(b);   //99
	}
}
