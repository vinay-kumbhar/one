package com.cjc.app.mfi.master.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class EnqDetailsRE 
{
	@Id
	private int enq_id;
	private long enq_adhar_no;
	private String enq_dob;
	private String enq_email_id;
	private String enq_gender;
	private long enq_loan_amount_req;
	private String enq_local_address;
	private long enq_mob_no;
	private String enq_name;
	private String enq_permanent_address;
	private String enq_profession;
	private String enq_pancard_no;
	private String enq_Income_proof;
	private String enq_loan_type;
	private String remark;
	public int getEnq_id() {
		return enq_id;
	}
	public void setEnq_id(int enq_id) {
		this.enq_id = enq_id;
	}
	public long getEnq_adhar_no() {
		return enq_adhar_no;
	}
	public void setEnq_adhar_no(long enq_adhar_no) {
		this.enq_adhar_no = enq_adhar_no;
	}
	public String getEnq_dob() {
		return enq_dob;
	}
	public void setEnq_dob(String enq_dob) {
		this.enq_dob = enq_dob;
	}
	public String getEnq_email_id() {
		return enq_email_id;
	}
	public void setEnq_email_id(String enq_email_id) {
		this.enq_email_id = enq_email_id;
	}
	public String getEnq_gender() {
		return enq_gender;
	}
	public void setEnq_gender(String enq_gender) {
		this.enq_gender = enq_gender;
	}
	public long getEnq_loan_amount_req() {
		return enq_loan_amount_req;
	}
	public void setEnq_loan_amount_req(long enq_loan_amount_req) {
		this.enq_loan_amount_req = enq_loan_amount_req;
	}
	public String getEnq_local_address() {
		return enq_local_address;
	}
	public void setEnq_local_address(String enq_local_address) {
		this.enq_local_address = enq_local_address;
	}
	public long getEnq_mob_no() {
		return enq_mob_no;
	}
	public void setEnq_mob_no(long enq_mob_no) {
		this.enq_mob_no = enq_mob_no;
	}
	public String getEnq_name() {
		return enq_name;
	}
	public void setEnq_name(String enq_name) {
		this.enq_name = enq_name;
	}
	public String getEnq_permanent_address() {
		return enq_permanent_address;
	}
	public void setEnq_permanent_address(String enq_permanent_address) {
		this.enq_permanent_address = enq_permanent_address;
	}
	public String getEnq_profession() {
		return enq_profession;
	}
	public void setEnq_profession(String enq_profession) {
		this.enq_profession = enq_profession;
	}
	public String getEnq_pancard_no() {
		return enq_pancard_no;
	}
	public void setEnq_pancard_no(String enq_pancard_no) {
		this.enq_pancard_no = enq_pancard_no;
	}
	public String getEnq_Income_proof() {
		return enq_Income_proof;
	}
	public void setEnq_Income_proof(String enq_Income_proof) {
		this.enq_Income_proof = enq_Income_proof;
	}
	public String getEnq_loan_type() {
		return enq_loan_type;
	}
	public void setEnq_loan_type(String enq_loan_type) {
		this.enq_loan_type = enq_loan_type;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
