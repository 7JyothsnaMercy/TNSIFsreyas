package com.tnsif.project.interfacedemo;

public class Nestedinterface implements Myinterface.Myinnerinterface {
	
	@Override
	public void print() {
		System.out.println("welcome to inner interface");
		
	}
}
