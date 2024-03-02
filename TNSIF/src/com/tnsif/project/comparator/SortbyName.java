package com.tnsif.project.comparator;

import java.util.Comparator;

public class SortbyName implements Comparator<Student> {

	@Override
	public int compare(Student a1, Student a2) {
		
		return a1.name.compareTo(a2.name);
	}
}
