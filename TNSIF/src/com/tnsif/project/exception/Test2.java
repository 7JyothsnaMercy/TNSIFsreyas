package com.tnsif.project.exception;

import java.io.IOException;

public class Test2 {

	public static void main(String[] args) {
	   ThrowsDemo t=new ThrowsDemo();
		try {
			t.display();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}
