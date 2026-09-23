package collectionrevision.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {
		List<String> kothibaskar = new ArrayList(Arrays.asList("Jan","Feb","March","April","May"));
		
		ListIterator<String> lift=kothibaskar.listIterator();
		
//		while(lift.hasNext())
//		{
//			String month=lift.next();
//			if(month.length()>4)
//				lift.add("Apple");	
//		}
		
//		while(lift.hasNext())
//		{
//			String month=lift.next();
//			if(month.length()>4)
//				lift.set("Apple");	
//		}
		
		while(lift.hasNext())
		{
			String month=lift.next();
			if(month.length()>4)
				lift.remove();
		}
		
		while(lift.hasNext())
		{
			System.out.println(lift.next());
		}
		
		while(lift.hasPrevious())
		{
			System.out.println(lift.previous());
		}
		
		
		System.out.println(kothibaskar);
		

	}

}
