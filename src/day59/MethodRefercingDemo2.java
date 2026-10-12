package day59;

import java.util.Arrays;
import java.util.List;

public class MethodRefercingDemo2 {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(6,12,18,28,32);
										// T  F  F  T  F    => 6,28
		
//		numbers.stream()
//		.filter(n->{
//			int sum=0;
//			for(int i=1;i<=n/2;i++)
//			{
//				if(n%i==0)
//					sum+=i;
//			}
//			
//			if(sum==n)
//				return true;
//			else
//				return false;
//		})
//		.forEach(n->System.out.println(n));
		
		numbers.stream()
		.filter(MethodRefercingDemo2::checkPerfect)
		.forEach(n->System.out.println(n));
	}
	
	public static boolean checkPerfect(int n)
	{
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
				sum+=i;
		}
		
		if(sum==n)
			return true;
		else
			return false;
	}
		
		
	

	
}
