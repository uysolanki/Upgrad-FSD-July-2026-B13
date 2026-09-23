package collectionrevision.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExceptionDemo {

	public static void main(String[] args) {
		List<String> kothibaskar = new ArrayList(Arrays.asList("Jan","Feb","March","April","May"));
		
		
		
		System.out.println("*****");   //modCount=5

		for(String month:kothibaskar)
		{
			kothibaskar.add("June");
			System.out.println(month);
		}								//modCount=5

	}

}
