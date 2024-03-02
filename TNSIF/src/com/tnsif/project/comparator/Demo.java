package com.tnsif.project.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Student>  s=new ArrayList<Student>();
		s.add(new Student(2,"bbb","london"));
		s.add(new Student(4,"aaa","India"));
		s.add(new Student(1,"ccc","nepal"));
		
		//System.out.println(s);
		
		for(int i=0;i<s.size();i++) {
			System.out.println(s.get(i));
			
		}
		
		Collections.sort(s,new SortbyRollno() );
		Collections.sort(s,new SortbyName());

		for(int i=0;i<s.size();i++) {
			System.out.println(s.get(i));
		}	
	}


}
