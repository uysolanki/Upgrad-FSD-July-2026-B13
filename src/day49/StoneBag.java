package day49;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class StoneBag {

	public static void main(String[] args) {
		PriorityQueue<Integer> stones=new PriorityQueue<Integer>(Collections.reverseOrder());  //default max heap
		stones.addAll(Arrays.asList(8,2,3,7,1,6));
//		stones.addAll(Arrays.asList(8,2,3,7,1,6,1));   //,,,,,
		
		while(stones.size()>1)
		{
			int s1=stones.remove();
			int s2=stones.remove();
			
			int diff=s1-s2;
			if(diff>0)
			stones.add(diff);
		}
		if(stones.size()==1)
		System.out.println("stone in the bag is " +stones.peek() + " kg");
		else
			System.out.println("No Stones left");
	}

}
