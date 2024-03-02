package com.tnsif.project.exception;

//Exception with matching catch block


public class Test1 {

	public static void main(String[] args) {
		try {
			System.out.println(100/0);
		}
		catch(NullPointerException ez) {
			System.out.println("exception caught"+ez.getMessage());
		}
		finally {
			System.out.println("end");
		}
	}
}
