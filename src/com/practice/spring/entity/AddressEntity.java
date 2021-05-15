package com.practice.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class AddressEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int addressId;
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
		return "AddressEntity [addressId=" + addressId + ", state=" + state + ", town=" + town + "]";
	}

}
