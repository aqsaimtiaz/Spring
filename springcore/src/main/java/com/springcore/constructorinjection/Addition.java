package com.springcore.constructorinjection;

public class Addition {

	@Override
	public String toString() {
		return "Addition [a=" + a + ", b=" + b + "]";
	}

	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("constructor : int, int");
	}
	
	public Addition(double a, double b) {
		super();
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("constructor : double, double");
	}
	
	public void sum() {
		System.out.println( "sum is " + (this.a + this.b));
	}
	
	private int a;
	private int b;
	
}
