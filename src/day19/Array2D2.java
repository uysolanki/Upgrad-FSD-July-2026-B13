package day19;

public class Array2D2 {

	public static void main(String[] args) {
		int matrix[][]= {{3,0,7},{2,5,7},{7,9,6}};
		
		for(int i=0;i<matrix.length;i++)  //rows
		{
		  for(int j=0;j<matrix[i].length;j++) //cols
		  {
			  System.out.print(matrix[i][j]+"\t");
		  }
		  System.out.println();
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