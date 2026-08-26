package day38;

public class LPA27Demo {

	public static void main(String[] args) {

			int n=divide(10,0);
			System.out.println(n);
	}

	private static int divide(int n,int d) {
		try
		{
			double result=n/d;
			return 1;
		}
		catch(ArithmeticException ex)
		{
			return 2;
		}
		finally {
			return 3;
		}
	}

}
