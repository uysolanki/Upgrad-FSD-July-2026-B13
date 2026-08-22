package day35;

public class DriverApp {

	public static void main(String[] args) {
		Shape circle=new Circle();
		circle.area();
		circle.perimeter();
		
		
		Shape rect=new FootballField();
		rect.area();
		rect.perimeter();
	}
}
