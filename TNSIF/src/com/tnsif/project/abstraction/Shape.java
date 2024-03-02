package com.tnsif.project.abstraction;

public abstract class Shape {
protected float area;      // variable
	
	// abstract method
	
	abstract void calarea();
	
	// concrete method
	
	void show() {
		System.out.println("area of a shape"+ area);
	}

}
