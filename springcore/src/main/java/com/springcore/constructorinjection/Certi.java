package com.springcore.constructorinjection;

public class Certi {

	public Certi(String name) {
		super();
		this.name = name;
	}

	public Certi() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String name;

	@Override
	public String toString() {
		return "Certi [name=" + name + "]";
	}

	
}
