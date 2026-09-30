package collectionrevision.day8;

public class EnumDemo {

	public static void main(String[] args) {
		Weekday today=Weekday.WEDNESDAY;
		System.out.println("Today is "+today);

		Direction direction=Direction.NORTH;
		System.out.println("Travelling in " + direction + " direction");
		
		Graha gola=new Graha(200,2000);
		
		Planet planet=Planet.EARTH;
		
		System.out.println("The Gravity of " + planet.name() + " is " + planet.calculateGravity());
		
	}
}


//Sun  my  very educated mother just showed us nine playets
//Solar System
//     			Mercury Venus  Earth Mars Jupiter Saturn Uranus Neptune 
//     radius 	5		 8      10    7     20      15     13     12 
//     mass    	50		80     98    70    200     150    130    120
//     gravity        			9.8


// gravity=(radius*radius)/mass