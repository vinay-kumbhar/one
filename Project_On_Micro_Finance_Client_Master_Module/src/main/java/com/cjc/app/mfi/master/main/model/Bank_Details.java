package com.cjc.app.mfi.master.main.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;

@Entity
public class Bank_Details {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bank_id;
	private String bank_name;
	private String bank_address;
	private String bank_status;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "bank_details")
	private Set<Branch_details> bd=new HashSet<>();

	public int getBank_id() {
		return bank_id;
	}

	public void setBank_id(int bank_id) {
		this.bank_id = bank_id;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public String getBank_address() {
		return bank_address;
	}

	public void setBank_address(String bank_address) {
		this.bank_address = bank_address;
	}

	public String getBank_status() {
		return bank_status;
	}

	public void setBank_status(String bank_status) {
		this.bank_status = bank_status;
	}

	
	  public Set<Branch_details> getBd() { return bd; }
	  
	  public void setBd(Set<Branch_details> bd) { this.bd = bd; }
	 
	 
	
	
	

}
