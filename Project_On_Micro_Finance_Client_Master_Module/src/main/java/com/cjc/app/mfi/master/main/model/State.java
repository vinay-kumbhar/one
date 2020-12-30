package com.cjc.app.mfi.master.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class State {
	
	@Id
	private int state_id;
	
	private int state_code;
	
	private String state_name;
	
	private String state_status;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Country country_id;

	public int getState_id() {
		return state_id;
	}

	public void setState_id(int state_id) {
		this.state_id = state_id;
	}

	public int getState_code() {
		return state_code;
	}

	public void setState_code(int state_code) {
		this.state_code = state_code;
	}

	public String getState_name() {
		return state_name;
	}

	public void setState_name(String state_name) {
		this.state_name = state_name;
	}

	public String getState_status() {
		return state_status;
	}

	public void setState_status(String state_status) {
		this.state_status = state_status;
	}

	public Country getCountry_id() {
		return country_id;
	}

	public void setCountry_id(Country country_id) {
		this.country_id = country_id;
	}

}
