package com.spring.expressionlanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Value("#{5+2}")
	private int x;
	@Value("#{3}")
	private int y;
	
	@Value("#{ T(java.lang.Math).E}")
	private double E;
	
	@Value("#{new java.lang.String('Aqsa')}")
	private String name;
	
	@Value("#{8 >3 }")
	private Boolean isActive;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public double getE() {
		return E;
	}

	public void setE(double e) {
		E = e;
	}

	@Value("#{ T(java.lang.Math).sqrt(25)}")
	private double z;

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", E=" + E + ", name=" + name + ", isActive=" + isActive + ", z=" + z
				+ "]";
	}

	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}

}
