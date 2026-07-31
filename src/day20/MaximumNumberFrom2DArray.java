package day20;

import java.util.Scanner;

public class MaximumNumberFrom2DArray {

	public static void main(String[] args) {
		int matrix[][]= new int[3][3];
		
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<matrix.length;i++)  //rows
		{
		  for(int j=0;j<matrix[i].length;j++) //cols
		  {
			  System.out.println("Enter a Number");
			  matrix[i][j]=sc.nextInt();
		  }
		}
		
		
		
		for(int i=0;i<matrix.length;i++)  //rows
		{
		  for(int j=0;j<matrix[i].length;j++) //cols
		  {
			  System.out.print(matrix[i][j]+"\t");
		  }
		  System.out.println();
		}
		
		int max=matrix[0][0];
		for(int i=0;i<matrix.length;i++)  //rows
		{
		  for(int j=0;j<matrix[i].length;j++) //cols
		  {
			  if(matrix[i][j]>max)
			  {
				  max=matrix[i][j];
			  }
		  }
		}
		System.out.println("Maximum Numbers in array is "+max);
	}

}
/*
A
3
0
7
2
5
7
7
9
6

B
307247796 


C
3     0     7
2     5     7
7     9     6

*/