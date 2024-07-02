package com.spring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Burger  {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Inside setter method");
		this.price = price;
	}

	public Burger() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	
	@PostConstruct
	public void start() {
		
		System.out.println("Inside start method");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Inside end method");
	}
}
