package day20;

import java.util.Scanner;

public class MaximumNumberFromEachRow {

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
		
		
		for(int i=0;i<matrix.length;i++)  //rows
		{
			int max=matrix[i][0];
		  for(int j=0;j<matrix[i].length;j++) //cols
		  {
			  if(matrix[i][j]>max)
			  {
				  max=matrix[i][j];
			  }
		  }
		  System.out.println("Maximum Numbers from row "+(i+1) + " is " + max);
		}
	}

}