package com.tnsif.project.stringdemo;
//to demostrate compareto method

public class CompareDemo {

	public static void main(String[] args) {
		
		
		String s1="sachin";
		String s2="sachin";
		String s3="ratan";

		System.out.println(s1.compareTo(s2)); // 0

		System.out.println(s1.compareTo(s3));

		System.out.println(s3.compareTo(s1));
		}
}
