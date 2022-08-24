package com.bankProject.applicationdemo.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;


import org.hibernate.annotations.Type;

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
	private Role role;
	
	@Lob
	@Type(type="org.hiberbate.type.BinaryType")
	private byte[] panCopy;
	
	@Lob
	@Type(type="org.hiberbate.type.BinaryType")
	private byte[] aadharCopy;
	

	private List<BankAccount> accounts;
	

	public BankCustomers(long customerId, long pan, long aadhar, String name, String postalAddress, String email, String dob, int roleId, String role) {
		this.customerId = customerId;
		this.pan = pan;
		this.aadhar = aadhar;
		this.name = name;
		this.postalAddress = postalAddress;
		this.email = email;
		this.dob = dob;
		this.role.setRoleId(roleId);
		this.role.setName(role);
	}

	
	public String getRoleName() {
		return role.getName();
	}

	

	public void setRoleName(String name) {
		this.role.setName(name);
	}

	
	public int getRoleId() {
		return role.getRoleId();
	}

	public void setRoleId(int id) {
		this.role.setRoleId(id);
	}

	public List<BankAccount> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<BankAccount> accounts) {
		this.accounts = accounts;
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
