package day8;

public class SchoolChocolate1 {
public static void main(String[] args) {
	
	int sum=0;
	
	for(int rno=1;rno<=5;rno++)						//sum		rno
	{												//0			1
		sum=sum+rno;								//1         2
	}												//3         3     is 3<=5 true
	System.out.println("Total chocolates "+ sum);	//6			4	  is 4<=5 true
}													//10        5     is 5<=5 true
}													//15        6     is 6<=5 false
