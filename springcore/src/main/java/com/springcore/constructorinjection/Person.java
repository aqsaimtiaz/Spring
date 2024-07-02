package com.springcore.constructorinjection;

import java.util.List;

public class Person {

	public Person(String name, int personId, Certi certi, List<String> numbers) {
		super();
		this.name = name;
		this.personId = personId;
		this.certi = certi;
		this.numbers = numbers;
	}

	private String name;
	private int personId;
	private Certi certi;
	private List<String> numbers;

	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", certi=" + certi + ", numbers=" + numbers + "]";
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

}
