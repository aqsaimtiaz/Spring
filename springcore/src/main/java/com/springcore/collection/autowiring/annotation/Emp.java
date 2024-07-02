package com.springcore.collection.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

//	@Autowired
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("In constructor");
	}

	
	private Address address;

	public Address getAddress() {
		return address;
	}

	@Autowired
	public void setAddress(Address address) {
		System.out.println("in setter");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
}
