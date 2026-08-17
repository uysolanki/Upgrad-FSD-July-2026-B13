package day31;

public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
		Student batch[]=new Student[3];
		
		batch[0]=new Student(18,"Virat",78.5);
		batch[1]=new Student(45,"Rohit",88.5);
		batch[2]=new Student(7,"Shivam",98.5);
		
		for(int i=0;i<batch.length;i++)
		batch[i].displayStudent();
		
		for(int i=0;i<batch.length;i++)
			System.out.println(batch[i].getStudentName());
		
		double totalPer=0.0;
		for(int i=0;i<batch.length;i++)
			totalPer+=batch[i].getPer();
		
		System.out.println("Total Percentage is "+totalPer);
		System.out.println("Average Percentage is "+ (totalPer/batch.length));
		
		String searchedName="Alice";
		int flag1=0;  //not found
		for(int i=0;i<batch.length;i++)
		{
			boolean result=batch[i].searchByName(searchedName);
			if(result==true)
			{
				System.out.println("Found");
				flag1=1;
				break;
			}
		}
		
		if(flag1==0)
			System.out.println("Not Found");
		
		
		
		
		int searchedRno=45;
		int flag2=0;  //not found
		for(int i=0;i<batch.length;i++)
		{
			boolean result=batch[i].searchByRollNumber(searchedRno);
			if(result==true)
			{
				System.out.println("Found");
				flag2=1;
				break;
			}
		}
		
		if(flag2==0)
			System.out.println("Not Found");
		
	}

}
