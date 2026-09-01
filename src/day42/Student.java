package day42;

public class Student {
	
	private int rno;						
	private String studentName;				
	private double per;						
	
	
	public Student()   
	{
		this.rno=1;
		this.studentName="Rahul";
		this.per=40.0;
	}
	
	public Student(int x, String y, double z)  throws  NullPointerException
	{
		this.rno=x;
		if(y==null)
			throw new NullPointerException();
		this.studentName=y;
		this.per=z;
	}
	

	
	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getPer() {
		return per;
	}

	public void setPer(double per) {
		this.per = per;
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", studentName=" + studentName + ", per=" + per + "]";
	}
	
	
}
