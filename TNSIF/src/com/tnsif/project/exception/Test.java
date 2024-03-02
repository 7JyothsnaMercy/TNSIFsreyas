package com.tnsif.project.exception;
//finally block (no exception)

public class Test {
	public static void main(String[] args) {
		
		try {
			System.out.println("welcome");
		}
		catch(Exception e) {
			System.out.println("hi");
		}
		finally {
			System.out.println("hello java");
		}
	}

}
