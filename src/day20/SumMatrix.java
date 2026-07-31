package day20;

import java.util.Scanner;

public class SumMatrix {

	public static void main(String[] args) {
		int matrix[][]= new int[3][3];
		int transpose[][]= new int[3][3];
		int sum[][]= new int[3][3];
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<matrix.length;i++)  //rows
		{
		  for(int j=0;j<matrix[i].length;j++) //cols
		  {
			  System.out.println("Enter a Number");
			  matrix[i][j]=sc.nextInt();
		  }
		}
		
		
		System.out.println("Input Array");
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
		  for(int j=0;j<matrix[i].length;j++) //cols
		  {
			 transpose[j][i]=matrix[i][j];
		  }
		  
		}
		
		System.out.println("Transpose Array");
		for(int i=0;i<matrix.length;i++)  //rows
		{
		  for(int j=0;j<matrix[i].length;j++) //cols
		  {
			  System.out.print(transpose[i][j]+"\t");
		  }
		  System.out.println();
		}
		
		for(int i=0;i<matrix.length;i++)  //rows
		{
		  for(int j=0;j<matrix[i].length;j++) //cols
		  {
			 sum[i][j]=transpose[j][i]+matrix[i][j];
		  }
		  
		}
		
		System.out.println("Result Matrix");
		for(int i=0;i<matrix.length;i++)  //rows
		{
		  for(int j=0;j<matrix[i].length;j++) //cols
		  {
			  System.out.print(sum[i][j]+"\t");
		  }
		  System.out.println();
		}
	}

}