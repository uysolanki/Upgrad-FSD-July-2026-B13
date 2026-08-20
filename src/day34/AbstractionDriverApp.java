package day34;

public class AbstractionDriverApp {

	public static void main(String[] args) {
		Animal horse1=new Horse();
		Horse horse2=new Horse();
		
		horse1.eat();
		horse1.sleep();
		horse1.run();
		//horse1.horseRacing();
		
		horse2.eat();
		horse2.sleep();
		horse2.run();
		horse2.horseRacing();
		
		
		
		Animal tiger1=new BengalTiger();
		tiger1.eat();
		tiger1.sleep();
		tiger1.run();
		
		Tiger tiger2=new BengalTiger();
		tiger2.eat();
		tiger2.sleep();
		tiger2.run();

		BengalTiger tiger3=new BengalTiger();
		tiger3.eat();
		tiger3.sleep();
		tiger3.run();

	}

}
