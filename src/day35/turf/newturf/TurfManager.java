package day35.turf.newturf;

public class TurfManager {
	
	static Turf turf;
	public static Turf bookTurf(int choice)  //choice = 1
	{
		switch(choice)
		{
		case 1 : turf=new CricketTurf(); break;
		case 2:  turf=new FootballTurf(); break;
		case 3:  turf=new TennisTurf(); break;
		default: turf=null;
		}
		
		return turf;
	}

}
