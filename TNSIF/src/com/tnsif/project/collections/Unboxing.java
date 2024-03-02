package com.tnsif.project.collections;
//to demonstrate Unboxing

public class Unboxing {
	public static void main(String[] args) {
		Integer a =new Integer(3);
		int i=a.intValue();//converting Integer to int explicitly
		int j=a;  // unboxing ,new compiler will write a.intvalue() internally
		
		System.out.println(a+ " "+i+" "+j);
	}

}
