package collectionrevision.day8;

public class CloudJump {

	public static void main(String[] args) {
		int clouds[]= {0,0,1,0,0,1,0,0} ;  //ans = 5
		
		int minSteps=playGame(clouds);
		System.out.println(minSteps);
	}

	private static int playGame(int[] clouds) {
		int position=0;
		int jumpCounter=0;
		
		while(position<clouds.length-1)
		{
			if( (position+2)<clouds.length  && clouds[position+2]==0)
				position+=2;
			else
				position+=1;
			
			jumpCounter++;
		}
		return jumpCounter;
	}

}
