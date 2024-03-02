package com.tnsif.project.collections;
//to demonstrate Auto boxing 

public class Autoboxing {
	public static void main(String[] args) {
		int a=20;
		Integer i=Integer.valueOf(a);  //converting int into Integer explicitly
		Integer j=a; /// autoboxing ,now compiler will write integer value(a) intenally
		
		System.out.println(a +" "+i+" "+j);
	}

}
