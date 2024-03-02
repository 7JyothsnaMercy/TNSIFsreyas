package com.tnsif.project.collections;

import java.util.Vector;

//to demostarte vector class

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();
		int size=v.size();
		System.out.println(size);
		v.add("red");
		v.add("blue");
		v.add("orange");
		v.add("red");
		v.add("blue");
		v.add("orange");
		v.add("red");
		v.add("blue");
		v.add("orange");
		int size1=v.size();
		System.out.println(size1);
		
		int cap=v.capacity();
		System.out.println("default capacity "+cap);
		v.add("white");
		v.add("pink");
		System.out.println(v.size());
		int cap1=v.capacity();
		System.out.println("default capacity "+cap1);
	}
	

}
