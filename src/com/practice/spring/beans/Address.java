package com.practice.spring.beans;

public class Address {
	private String state;
	private String town;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	@Override
	public String toString() {
		return "Address [state=" + state + ", town=" + town + "]";
	}

}
