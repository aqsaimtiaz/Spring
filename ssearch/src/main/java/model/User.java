package model;

import java.util.List;

public class User {

	@Override
	public String toString() {
		return "User [address=" + address + ", name=" + name + ", courses=" + courses + ", gender=" + gender + ", type="
				+ type + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<String> getType() {
		return type;
	}
	public void setType(List<String> type) {
		this.type = type;
	}
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	private String name;
	private List<String> courses;
	private String gender;
	private List<String> type;
}
