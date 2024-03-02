package com.tnsif.project.collections;

import java.util.ArrayList;
import java.util.Iterator;

// to demostarte the arraylist using generics

public class ArraylistExample {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("mango");
		list.add("apple");
		list.add("banana");
		
		System.out.println(list);
		
		// Travesing list through iterator
		
		Iterator itr=list.iterator();
		while(itr.hasNext()) {   // check if iterator has a element
			System.out.println(itr.next());//priting the elemet and move next
		}
		
	}

}
