package com.spring.core.config;

public class Student {

	
	private Samosa samosa;

	@Override
	public String toString() {
		return "Student [samosa=" + samosa + "]";
	}
	
	public void study( ) {
		this.samosa.display();
		System.out.println("Student is studing");
	}

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
	
}
