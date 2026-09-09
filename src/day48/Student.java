package day48;

public class Student implements Comparable<Student> {
	
	private int rno;						
	private String studentName;				
	private double per;						
	
	
	public Student()   
	{
		this.rno=1;
		this.studentName="Rahul";
		this.per=40.0;
	}
	
	public Student(int x, String y, double z)  
	{
		this.rno=x;
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

//	@Override
//	public int compareTo(Student o) {
//		if(this.per>o.per)
//			return -1;
//		else if(this.per<o.per)
//		return 1;
//		else return 0;
//	}
	
	@Override
	public int compareTo(Student s1) {
		return this.studentName.compareTo(s1.studentName);
	}
	
	
}
