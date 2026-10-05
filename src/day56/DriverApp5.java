package day56;

public class DriverApp5 {

	public static void main(String[] args) {
		
			Factorial f1 =null;
			
			f1=(num)->
			{
				int fact=1;
				for(int i=1;i<=num;i++)
					fact=fact*i;
				return fact;
			};

			
			int result=f1.fact(5);
			System.out.println(result);
	}
}
