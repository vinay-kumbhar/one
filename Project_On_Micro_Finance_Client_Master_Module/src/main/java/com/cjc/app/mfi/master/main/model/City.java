package com.cjc.app.mfi.master.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class City {
	
	@Id
	private int city_id;
	
	private int city_code;
	
	private String city_name;
	
	private String city_status;

	@OneToOne(cascade = CascadeType.ALL)
	private State state_id;

	public int getCity_id() {
		return city_id;
	}

	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}

	public int getCity_code() {
		return city_code;
	}

	public void setCity_code(int city_code) {
		this.city_code = city_code;
	}

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public String getCity_status() {
		return city_status;
	}

	public void setCity_status(String city_status) {
		this.city_status = city_status;
	}

	public State getState_id() {
		return state_id;
	}

	public void setState_id(State state_id) {
		this.state_id = state_id;
	}

	
}
