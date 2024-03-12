package com.tnsif.project.staticprogram;

public class Student1 {
	int rollno;
	String name;
	static String college="BIT";

	//static method change value
	 static void change() {     //static method
		 college="sreyas";
	 }
	 
	 Student1(int r,String n){
		 rollno=r;
		 name=n;
	 }
	  void display() {
		  System.out.println(rollno+" "+name+" "+college);
	  }


}
