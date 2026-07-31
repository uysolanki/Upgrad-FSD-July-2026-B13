package day20;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number of Rows of Matrix 1 : ");
		int r1=sc.nextInt();
		System.out.println("Enter Number of Columns of Matrix 1 : ");
		int c1=sc.nextInt();
		
		System.out.println("Enter Number of Rows of Matrix 2 : ");
		int r2=sc.nextInt();
		System.out.println("Enter Number of Columns of Matrix 2 : ");
		int c2=sc.nextInt();
		
		if(c1==r2)
		{
			
			int matrixA[][]= new int[r1][c1];
			int matrixB[][]= new int[r2][c2];
			int matrixC[][]= new int[r1][c2];
			
			System.out.println("Enter Values for Matrix A");
			for(int i=0;i<matrixA.length;i++)  //rows
			{
			  for(int j=0;j<matrixA[i].length;j++) //cols
			  {
				  matrixA[i][j]=sc.nextInt();
			  }
			}
			
			
			System.out.println("Enter Values for Matrix B");
			for(int i=0;i<matrixB.length;i++)  //rows
			{
			  for(int j=0;j<matrixB[i].length;j++) //cols
			  {
				  matrixB[i][j]=sc.nextInt();
			  }
			}
			
			
			System.out.println("\nMatrix A\n");
			for(int i=0;i<matrixA.length;i++)  //rows
			{
			  for(int j=0;j<matrixA[i].length;j++) //cols
			  {
				  System.out.print(matrixA[i][j]+"\t");
			  }
			  System.out.println();
			}
			
			System.out.println("\nMatrix B\n");
			for(int i=0;i<matrixB.length;i++)  //rows
			{
			  for(int j=0;j<matrixB[i].length;j++) //cols
			  {
				  System.out.print(matrixB[i][j]+"\t");
			  }
			  System.out.println();
			}
			
			for(int i=0;i<r1;i++)  //rows
			{
			  for(int j=0;j<c2;j++) //cols
			  {
				  int sum=0;
				  for(int k=0;k<r2;k++) //cols
				  {
					  sum+=matrixA[i][k]*matrixB[k][j];
				  }
				  matrixC[i][j]=sum;
			  }
			}
			
			System.out.println("\nMatrix C\n");
			for(int i=0;i<matrixC.length;i++)  //rows
			{
			  for(int j=0;j<matrixC[i].length;j++) //cols
			  {
				  System.out.print(matrixC[i][j]+"\t");
			  }
			  System.out.println();
			}
			
		}
		else
		{
			System.out.println("Misison Impossible");
		}
		
		
		
	}
}