package com.tnsif.project.inheritance;
//to demonstrate inheritance

public class Citizen {
	private String name;         // data members
	private String address;
	private long aadharno;
	private long phoneno;
	// default constructor
	public Citizen() {
		super();
	
	}
// parameterized constructor
	
	public Citizen(String name, String address, long aadharno, long phoneno) {
		super();
		this.name = name;
		this.address = address;
		this.aadharno = aadharno;
		this.phoneno = phoneno;
	}
	
	// getter and setter method

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getAadharno() {
		return aadharno;
	}

	public void setAadharno(long aadharno) {
		this.aadharno = aadharno;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", address=" + address + ", aadharno=" + aadharno + ", phoneno=" + phoneno
				+ "]";
	}

}
