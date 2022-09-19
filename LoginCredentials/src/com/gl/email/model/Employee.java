package com.gl.email.model;

public class Employee {

	private String fstName;
	private String lastName;
	
	
	public Employee(String fstName, String lastName) {
		
		this.fstName = fstName;
		this.lastName = lastName;
	}

	public String getFstName() {
		return fstName;
	}

	public void setFstName(String fstName) {
		this.fstName = fstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
