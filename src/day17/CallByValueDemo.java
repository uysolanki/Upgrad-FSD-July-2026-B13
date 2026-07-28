package day17;

public class CallByValueDemo {

	public static void main(String[] args) {
		int a=10;		//primitive
		System.out.println(a);   //10
		test(a);
		System.out.println(a);
	}

	private static void test(int b) {
		System.out.println(b);
		b=99;
		System.out.println(b);
		
		
	}

}
