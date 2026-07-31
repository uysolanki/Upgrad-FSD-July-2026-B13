package day20;

import java.util.Scanner;

public class Array2D3 {

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
		
		//display the diagonal elements
		System.out.print("Diagonal Element are\t");
		for(int i=0;i<matrix.length;i++)  //rows
		{
		  for(int j=0;j<matrix[i].length;j++) //cols
		  {
			  if(i==j)
			  System.out.print(matrix[i][j]+"\t");
		  }
		}
		
		
		//display the Upper Traingle elements
				System.out.print("\nUpper Triangle Element are\t");
				for(int i=0;i<matrix.length;i++)  //rows
				{
				  for(int j=0;j<matrix[i].length;j++) //cols
				  {
					  if(i<j)
					  System.out.print(matrix[i][j]+"\t");
				  }
				}
				
				//display the Lower Triangle elements
				System.out.print("\nLower Triangle Element are\t");
				for(int i=0;i<matrix.length;i++)  //rows
				{
				  for(int j=0;j<matrix[i].length;j++) //cols
				  {
					  if(i>j)
					  System.out.print(matrix[i][j]+"\t");
				  }
				}

		

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