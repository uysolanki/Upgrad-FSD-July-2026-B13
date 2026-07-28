package day16;

public class ArrayDemo {

	public static void main(String[] args) {     //  0     1     2       3          4
		int ages[]= {18,17,16,21,24};            // 18     17    16      21        24
				
				
				System.out.println(ages[3]);
				System.out.println(ages[1]);
				
				
				System.out.println(ages[0]);
				System.out.println(ages[4]);
				System.out.println(ages[ages.length-1]);
				
				
				for(int i=0;i<ages.length-1;i++)
					System.out.println(ages[i]);
				
				
				System.out.println(ages[0] + ages[ages.length-1]);
	}

}
