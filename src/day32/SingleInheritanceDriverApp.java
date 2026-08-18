package day32;

public class SingleInheritanceDriverApp {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.acceptPerson();
		e1.acceptEmployee();
		
		e1.displayPerson();
		e1.displayEmployee();
	}

}
