package com.tnsif.project.comparator;

//to demostarte the comparator interface

public class Student {

	int rollno;
	String name, adrees;
	public Student(int rollno, String name, String adrees) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.adrees = adrees;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", adrees=" + adrees + "]";
	}
	
}
