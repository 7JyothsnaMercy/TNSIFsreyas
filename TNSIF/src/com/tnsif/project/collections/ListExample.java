package com.tnsif.project.collections;

import java.util.LinkedList;

//to demostarte linked list


public class ListExample {
	
	public static void main(String[] args) {
		LinkedList<Integer> s1=new LinkedList<Integer>(); 
		s1.add(2);
		s1.add(3);
		s1.add(8);
		s1.add(8);
		
		System.out.println(s1);
		LinkedList<Integer> s2=new LinkedList<Integer>(); 
		
		s2.add(12);
		s2.add(56);
		s1.addAll(s2);
		System.out.println(s1); // it is printing all objects
		s2.addFirst(78);
		s2.addLast(80);
		System.out.println(s2);
		s2.remove(2);
		System.out.println(s2);
		
	}	

}
