package com.tnsif.project.exception;

//to demonstrate exception

public class Division {
	
      public static void divide(){
		int a=6,b=0,c;
		try {
			c=a/b;
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("exception caught " + e.getMessage());
		}
	 catch(ArithmeticException e) {
		System.out.println("exception welcome caught " + e.getMessage());
	 }
		catch(Exception e) {
			System.out.println("exception caught " + e.getMessage());
		}
	}
	

}
