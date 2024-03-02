package com.tnsif.project.finalVariable;

public class FinalmethodDemo extends Finalmethod {
	@Override
	final void show() {   // final method
		System.out.println("welcome");
	}
	
	public static void main(String[] args) {
		FinalmethodDemo demo =new FinalmethodDemo();
		demo.show();
	}
	
	
}

