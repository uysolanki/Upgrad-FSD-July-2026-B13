package day30;

public class TestDriverApp {

	public static void main(String[] args) {
	Test t1=new Test();
	t1.display();				//0
	t1.setX(99);
	t1.display();				//99
	
	upgrad(t1);
	t1.display();				//333
	}

	private static void upgrad(Test t2) {
		// TODO Auto-generated method stub
		t2.setX(333);
		
		t2=new Test();
		t2.setX(777);
		
		
	}

}
