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

	public class Demo {

	public static void main(String[] args) {
		Employee e1=new Employee(1,"sushma");
		Employee e2=new Employee(2,"kushma");
		Employee e3=new Employee(3,"resshma");
		e1.display();
		e2.display();
		e3.display();
	}
   }

}
