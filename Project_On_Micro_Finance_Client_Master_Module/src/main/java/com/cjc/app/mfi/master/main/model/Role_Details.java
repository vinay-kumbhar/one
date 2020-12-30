package com.cjc.app.mfi.master.main.model;


import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Role_Details {
	@Id
	private int role_id;
	private String role_designation;
	private String role_name;
	private String role_status;
	private String branch_id;
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public String getRole_designation() {
		return role_designation;
	}
	public void setRole_designation(String role_designation) {
		this.role_designation = role_designation;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public String getRole_status() {
		return role_status;
	}
	public void setRole_status(String role_status) {
		this.role_status = role_status;
	}
	public String getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(String branch_id) {
		this.branch_id = branch_id;
	}
	
	

}
