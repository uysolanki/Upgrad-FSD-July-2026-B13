package day7;

public class SumOf5Numbers {

	public static void main(String[] args) {
		
		int i=1;									//i		sum
													//1		0			is 1<=5 true
		int sum=0;									//2     1           is 2<=5 true
													//3		3           is 3<=5 true
		while(i<=5)									//4		6			is 4<=5 true
		{											//5		10			is 5<=5 true
			sum=sum+i;								//6		15          is 6<=5 false
			
			i=i+1;
			
		}
		
		System.out.println(sum);

	}

}
