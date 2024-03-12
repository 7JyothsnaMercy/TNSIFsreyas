package com.tnsif.project.staticprogram;

public class Employee {
	int eid;  //non -static variable
	String name;  //non -static variable
	static String company="TNS";  //static variable

	Employee(int e, String n)
	{
		eid=e;
		name=n;
	}
	void display()
	{
		System.out.println(eid +" "+name+" "+company);
	}

	

}
