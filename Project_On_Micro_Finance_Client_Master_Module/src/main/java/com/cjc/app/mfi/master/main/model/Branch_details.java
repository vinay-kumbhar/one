package com.cjc.app.mfi.master.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Branch_details {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int branch_id;
	private String branch_address;
	private String branch_email;
	private String branch_ifsc;
	private long branch_cif;
	private long branch_phno;
	private String branch_status;
	private String branch_type;
	private String branch_name;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="bank_id")
	//@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private Bank_Details bank_details;
	public int getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}
	public String getBranch_address() {
		return branch_address;
	}
	public void setBranch_address(String branch_address) {
		this.branch_address = branch_address;
	}
	public String getBranch_email() {
		return branch_email;
	}
	public void setBranch_email(String branch_email) {
		this.branch_email = branch_email;
	}
	public String getBranch_ifsc() {
		return branch_ifsc;
	}
	public void setBranch_ifsc(String branch_ifsc) {
		this.branch_ifsc = branch_ifsc;
	}
	public long getBranch_cif() {
		return branch_cif;
	}
	public void setBranch_cif(long branch_cif) {
		this.branch_cif = branch_cif;
	}
	public long getBranch_phno() {
		return branch_phno;
	}
	public void setBranch_phno(long branch_phno) {
		this.branch_phno = branch_phno;
	}
	public String getBranch_status() {
		return branch_status;
	}
	public void setBranch_status(String branch_status) {
		this.branch_status = branch_status;
	}
	public String getBranch_type() {
		return branch_type;
	}
	public void setBranch_type(String branch_type) {
		this.branch_type = branch_type;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public Bank_Details getBank_details() {
		return bank_details;
	}
	public void setBank_details(Bank_Details bank_details) {
		this.bank_details = bank_details;
	}
	
	
	
	

}
