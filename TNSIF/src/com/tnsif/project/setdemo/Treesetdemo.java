package com.tnsif.project.setdemo;

//to demostarte the tree set
import java.util.TreeSet;

public class Treesetdemo {
	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet<Integer> ();
		t.add(3);
		t.add(8);
		t.add(5);
		t.add(2);
		t.add(0);
		System.out.println(t); // output in the asending order
		
		// it will not allow the duplicate values
		TreeSet<Integer> t1=new TreeSet<Integer> ();
		t1.add(3);
		t1.add(8);
		t1.add(8);
		t1.add(9);
		t1.add(0);
		System.out.println(t1);
	}
	
}
