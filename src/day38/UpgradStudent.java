package day38;

import java.io.Serializable;

public class UpgradStudent  implements Serializable
{
//	private static final long serialVersionUID = 1L;
	private int rno;						
	private String studentName;				
	private double per;						
	
	public UpgradStudent()   
	{
		this.rno=1;
		this.studentName="Rahul";
		this.per=40.0;
	}
	
	public UpgradStudent(int x, String y, double z) 
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
}
