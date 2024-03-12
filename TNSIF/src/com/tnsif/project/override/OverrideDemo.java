package com.tnsif.project.override;
//to demonstrate override 
public class OverrideDemo {
	public static void main(String[] args) {
		Sbi s=new Sbi();  //object creation
	  System.out.println(s.getRateofInterest());
	  Rbi r=new Rbi();
	  System.out.println(r.getRateofInterest());
	}

}
