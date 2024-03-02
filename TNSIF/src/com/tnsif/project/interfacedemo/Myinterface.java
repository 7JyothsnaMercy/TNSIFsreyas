package com.tnsif.project.interfacedemo;
//to demonstrate nested interface:

//outer interface
public interface Myinterface {
 void calculatearea();
	 
	 // nested(inner ) interface
	 
	 interface Myinnerinterface{
		 int id=20;    // data member
		 
		 void print();
	 }

}
