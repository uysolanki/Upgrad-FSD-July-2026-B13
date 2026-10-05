package day56;

public class DriverApp {

	public static void main(String[] args) {
		
			Printing p1 =null;
			p1=new NewsPaper();
			p1.print();
			
			p1=new Magazine();
			p1.print();
			
			p1=()->
			{
				System.out.println("Printing Add in Textbook BalBharti");
			};
			p1.print();
			
			
			Animal tiger=()->{
				System.out.println("Tiger eating");
			};
			
			tiger.eat();
	}

}
