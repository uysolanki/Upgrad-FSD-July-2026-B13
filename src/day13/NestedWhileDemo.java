package day13;

public class NestedWhileDemo {

	public static void main(String[] args) {
		int i=1;
		while(i<=3)
		{
			int j=1;
			while(j<=4)
			{
				System.out.println("Sheep "+ i+ "," +j);
				
				j++;
			}
			
			i++;
		}

	}

}
