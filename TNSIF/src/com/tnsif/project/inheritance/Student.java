package com.tnsif.project.inheritance;

public class Student  extends Citizen {

	private int rollno;                   // data members
	private String collegename;
	// default constructor
	public Student() {
		super();
		
	}
// parameterzied constructor
	
	
	// getter and setter method
	public int getRollno() {
		return rollno;
	}
	
	// parent class parameterzied 
	public Student(String name,String address,long aadharno,long phoneno) {
	super(name,address,aadharno,phoneno);
	this.rollno = rollno;
	this.collegename = collegename;
}
	public void setRoolno(int roolno) {
		this.rollno = rollno;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
// students class parameterized 

	public Student(int roolno, String collegename) {
		super();
		this.rollno = rollno;
		this.collegename = collegename;
	}


	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegename=" + collegename + "]";
	}
	

}
