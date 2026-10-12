package day58;

import java.util.Arrays;
import java.util.List;

public class PrimeNumberUsingMethodReferencing {
public static void main(String[] args) {
	
	List<Integer> numbers=Arrays.asList(7,20,13,14,25);
	
//	numbers.stream()
//	.filter(num->{
//		
//		int counter=0;
//		for(int i=1;i<=num;i++)
//		{
//			if(num%i==0)
//				counter++;
//		}
//		
//		if(counter==2)
//			return true;
//		else
//			return false;
//	}).forEach(n->System.out.println(n));
	
//	numbers.stream()
//	.filter(PrimeNumberUsingMethodReferencing::checkPrime).forEach(n->System.out.println(n+" is Prime"));
	
	numbers.stream()
	.filter(PrimeNumberUsingMethodReferencing::checkPrime).forEach(System.out::println);
}


public static boolean checkPrime(int num)
{
	int counter=0;
	for(int i=1;i<=num;i++)
	{
		if(num%i==0)
			counter++;
	}
	
	if(counter==2)
		return true;
	else
		return false;
}
}
