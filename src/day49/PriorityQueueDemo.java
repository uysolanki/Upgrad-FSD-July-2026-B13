package day49;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());  //default max heap
		pq.addAll(Arrays.asList(8,2,3,7,1,6));
		int lh=pq.remove();//8
		int rh=pq.remove();//7			//bag=[8,2,3,7,1,6]   -> bag=[2,3,1,6,1]
										//bag=[2,1,1]     -> bag=[2,1,1,3]
	}									//bag=[1]         -> bag=[1]

}
