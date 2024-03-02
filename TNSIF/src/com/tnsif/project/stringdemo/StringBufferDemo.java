package com.tnsif.project.stringdemo;
//to demostarte string buffer
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer b=new StringBuffer("welcome");
		//b.append("welcome to java");   // original object changed
		//System.out.println(b);
		
		//b.insert(2, "hi");
		System.out.println(b);
		
		//b.replace(1, 3, "word");
		System.out.println(b);
		
		//b.delete(0, 3);
		//System.out.println(b);
		b.reverse();
		System.out.println(b);
	}

}
