package day17;

public class CallByRefDemo {

	public static void main(String[] args) {
		int a[]= {10,20,30};		//non primitive
		System.out.println(a[0]);   //10
		test(a);
		System.out.println(a[0]);   //99
	}

	private static void test(int b[]) {
		System.out.println(b[0]);	//10
		b[0]=99;
		System.out.println(b[0]);   //99
		
		
	}

}
