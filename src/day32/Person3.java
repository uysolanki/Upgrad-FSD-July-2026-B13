package day32;

public class Person3 {						//total properties = 3

	protected String name;
	protected int age;
	protected String city;
	
	public Person3() {
		System.out.println("Good Morning");
	}
	
	public Person3(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}



	public void displayPerson()
	{
		System.out.println("Name is "+this.name);
		System.out.println("Age is "+this.age);
		System.out.println("City is "+this.city);
	}
}
