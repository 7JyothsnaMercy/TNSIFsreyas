package com.tnsif.project.multithreadingDemo;

public class Tsynch1 {
	public static void main(String[] args) {
//		Example1 ex=new Example1();
		T1 t1=new T1();
		T1 t2=new T1();
		T1 t3=new T1();
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
