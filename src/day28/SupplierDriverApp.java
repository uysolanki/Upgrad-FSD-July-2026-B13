package day28;

public class SupplierDriverApp {

	public static void main(String[] args) {
		Supplier s1=new Supplier();
		Supplier s2=new Supplier();
		Supplier s3=new Supplier();

		s1.acceptSupplier();
		s2.acceptSupplier();
		s3.acceptSupplier();
		
		s1.displaySupplier();
		s2.displaySupplier();
		s3.displaySupplier();
	}

}
