package com.bankProject.applicationdemo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "customers")
public class BankCustomers {
	@Id
	private long customerId;
	private long pan;
	private long aadhar;
	private String name;
	private String postalAddress;
	private String email;
	private String dob;
	
	public BankCustomers(long customerId, long pan, long aadhar, String name, String postalAddress, String email, String dob) {
		this.customerId = customerId;
		this.pan = pan;
		this.aadhar = aadhar;
		this.name = name;
		this.postalAddress = postalAddress;
		this.email = email;
		this.dob = dob;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public long getPan() {
		return pan;
	}

	public void setPan(long pan) {
		this.pan = pan;
	}

	public long getAadhar() {
		return aadhar;
	}

	public void setAadhar(long aadhar) {
		this.aadhar = aadhar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPostalAddress() {
		return postalAddress;
	}

	public void setPostalAddress(String postalAddress) {
		this.postalAddress = postalAddress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
}
