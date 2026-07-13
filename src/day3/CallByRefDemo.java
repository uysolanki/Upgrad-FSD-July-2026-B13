package day3;

public class CallByRefDemo {

	public static void main(String[] args) {
		int arr[]= {10,20,30};
		System.out.println(arr[0]);   //10
		test(arr);	//non primitive will be considered as call by ref										//actual parameter
		System.out.println(arr[0]);   //99
	}

	public static void test(int zrr[])					//formal parameter
	{
		System.out.println(zrr[0]);   //10
		zrr[0]=99;
		System.out.println(zrr[0]);   //99
	}
}
