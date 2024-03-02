package com.tnsif.project.setdemo;
/// to demostrate set operations 

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOperation {

	public static void operations() {
		Set<Integer>  s= new HashSet<Integer>();
		s.add(12);
		s.add(13);
		s.add(18);
		s.add(6);
		System.out.println(s);
		
		Set<Integer>  s1= new HashSet<Integer>();
		s1.addAll(Arrays.asList(new Integer[] {1,3,4,5}));
		System.out.println(s1);
		// contains
		System.out.println("number contains element 3"+s1.contains(3));
		// to do intersection
		s1.retainAll(s);
		System.out.println("set intersection"+s1);
	}
}
