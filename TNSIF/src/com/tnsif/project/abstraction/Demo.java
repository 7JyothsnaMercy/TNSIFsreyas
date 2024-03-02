package com.tnsif.project.abstraction;

public class Demo {
	public static void main(String[] args) {
	//Square s=new Square();
	//System.out.println(s);	
	//Shape p1 =new Shape();
		
		Shape p=new Square(4.5f);
		p.calarea();
		p.show();
	}

}
