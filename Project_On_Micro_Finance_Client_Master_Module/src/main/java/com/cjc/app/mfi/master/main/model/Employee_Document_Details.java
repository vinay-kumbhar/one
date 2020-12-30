package com.cjc.app.mfi.master.main.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;


@Entity
public class Employee_Document_Details 
{
	@Id
	private int employee_document_id;
	@Lob
	private byte[] employee_adhar_card;
	@Lob
	private byte[] employee_bankpassbook;
	@Lob
	private byte[] employee_pancard;
	@Lob
	private byte[] employee_photo;
	private int employee_id;
	public Employee_Document_Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee_Document_Details(int employee_document_id, byte[] employee_adhar_card, byte[] employee_bankpassbook,
			byte[] employee_pancard, byte[] employee_photo, int employee_id) {
		super();
		this.employee_document_id = employee_document_id;
		this.employee_adhar_card = employee_adhar_card;
		this.employee_bankpassbook = employee_bankpassbook;
		this.employee_pancard = employee_pancard;
		this.employee_photo = employee_photo;
		this.employee_id = employee_id;
	}
	@Override
	public String toString() {
		return "Employee_Document_Details [employee_document_id=" + employee_document_id + ", employee_adhar_card="
				+ Arrays.toString(employee_adhar_card) + ", employee_bankpassbook="
				+ Arrays.toString(employee_bankpassbook) + ", employee_pancard=" + Arrays.toString(employee_pancard)
				+ ", employee_photo=" + Arrays.toString(employee_photo) + ", employee_id=" + employee_id + "]";
	}
	public int getEmployee_document_id() {
		return employee_document_id;
	}
	public void setEmployee_document_id(int employee_document_id) {
		this.employee_document_id = employee_document_id;
	}
	public byte[] getEmployee_adhar_card() {
		return employee_adhar_card;
	}
	public void setEmployee_adhar_card(byte[] employee_adhar_card) {
		this.employee_adhar_card = employee_adhar_card;
	}
	public byte[] getEmployee_bankpassbook() {
		return employee_bankpassbook;
	}
	public void setEmployee_bankpassbook(byte[] employee_bankpassbook) {
		this.employee_bankpassbook = employee_bankpassbook;
	}
	public byte[] getEmployee_pancard() {
		return employee_pancard;
	}
	public void setEmployee_pancard(byte[] employee_pancard) {
		this.employee_pancard = employee_pancard;
	}
	public byte[] getEmployee_photo() {
		return employee_photo;
	}
	public void setEmployee_photo(byte[] employee_photo) {
		this.employee_photo = employee_photo;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	
	
	
	
	
}
