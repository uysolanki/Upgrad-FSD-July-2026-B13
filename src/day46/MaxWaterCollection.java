package day46;

public class MaxWaterCollection {

	public static void main(String[] args) {
		//                 left                right
		//              0   1   2   3   4   5   6   7   8
		int heights[]= {1, 	8, 	6, 	2, 	5, 	4, 	8, 	3, 	7};
		
		int max=0;											//max=0, 8, 49										 
		
		int left=0;
		int right=heights.length-1;
		int area=0;
		while(left<right)			
		{
		int height=Math.min(heights[left], heights[right]);   //height =8
		int width=right-left;								  //height =5
		
		area=height*width;	                                  //area=40						     
		
		if(area>max)
			max=area;
		
		if(heights[left]<=heights[right])
			left++;
		else
			right--;
		}
	
		System.out.println(max);
}
}
