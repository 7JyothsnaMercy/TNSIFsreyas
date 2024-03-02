package com.tnsif.project.collections;

import java.util.Stack;
//to demostarte stack class

public class Stackdemo {
	
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<Integer>();
		
		s.push(1);   // push() used to insert elemets
		s.push(5);
		s.push(3);
		s.push(8);
		s.push(9);
		
		System.out.println(s);
		
		s.pop();  // to remove element
		System.out.println(s);
		s.pop();
		System.out.println(s);
		// to search element
		if(s.isEmpty()) {
			System.out.println("stack is empty");
		}
		else {
			System.out.println("not empty");
		}
		System.out.println(s.search(1));
	}	

}
