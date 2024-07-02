package com.springcore.collection.standalone;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {

	private List<String> friends;
	private Map<String, Integer> feeStructure;
	private Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Map<String, Integer> getFeeStructure() {
		return feeStructure;
	}

	public void setFeeStructure(Map<String, Integer> feeStructure) {
		this.feeStructure = feeStructure;
	}

	@Override
	public String toString() {
		return "Emp [friends=" + friends + ", feeStructure=" + feeStructure + ", properties=" + properties + "]";
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	
}
