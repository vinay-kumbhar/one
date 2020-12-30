package com.cjc.app.mfi.master.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country {
	
	@Id
	private int country_id;
	
	private int country_code;
	
	private String country_name;
	
	private String country_status;

	public int getCountry_id() {
		return country_id;
	}

	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}

	public int getCountry_code() {
		return country_code;
	}

	public void setCountry_code(int country_code) {
		this.country_code = country_code;
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	public String getCountry_status() {
		return country_status;
	}

	public void setCountry_status(String country_status) {
		this.country_status = country_status;
	}
	
	

}
