package com.spring.stereotyping;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("s1")
public class Student {

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Value("Aqsa")
	private String studentName;
	@Value("DXB")
	private String city;
	@Value("#{mylist}")
	private List<String> phones;
	
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", phones=" + phones + "]";
	}
}
