package com.tnsif.project.lambdaexpression;
//without parameter
public class LambdaDemo {
	public static void main(String[] args) {
		Message m=()->{return "hello";};
		
		System.out.println(m.greet());
	}


}
