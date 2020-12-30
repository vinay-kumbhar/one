package com.cjc.app.mfi.master.main.model;



import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Employee_Details 
{
	@Id
	private int employee_id;
	private String employee_name;
	private long employee_adhar_no;
	private String employee_qualification;
	private long employee_contact_no;
	private String employee_designation;
	private String employee_dob;
	private String employee_doj;
	private String employee_email_id;
	private String employee_gender;
	private String employee_local_address;
	private String employee_per_address;
	private String employee_pancard_no;
	private String employee_uname;
	private String employee_pass;
	public Employee_Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee_Details(int employee_id, String employee_name, long employee_adhar_no,
			String employee_qualification, long employee_contact_no, String employee_designation, String employee_dob,
			String employee_doj, String employee_email_id, String employee_gender, String employee_local_address,
			String employee_per_address, String employee_pancard_no, String employee_uname, String employee_pass) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.employee_adhar_no = employee_adhar_no;
		this.employee_qualification = employee_qualification;
		this.employee_contact_no = employee_contact_no;
		this.employee_designation = employee_designation;
		this.employee_dob = employee_dob;
		this.employee_doj = employee_doj;
		this.employee_email_id = employee_email_id;
		this.employee_gender = employee_gender;
		this.employee_local_address = employee_local_address;
		this.employee_per_address = employee_per_address;
		this.employee_pancard_no = employee_pancard_no;
		this.employee_uname = employee_uname;
		this.employee_pass = employee_pass;
	}
	@Override
	public String toString() {
		return "Employee_Details [employee_id=" + employee_id + ", employee_name=" + employee_name
				+ ", employee_adhar_no=" + employee_adhar_no + ", employee_qualification=" + employee_qualification
				+ ", employee_contact_no=" + employee_contact_no + ", employee_designation=" + employee_designation
				+ ", employee_dob=" + employee_dob + ", employee_doj=" + employee_doj + ", employee_email_id="
				+ employee_email_id + ", employee_gender=" + employee_gender + ", employee_local_address="
				+ employee_local_address + ", employee_per_address=" + employee_per_address + ", employee_pancard_no="
				+ employee_pancard_no + ", employee_uname=" + employee_uname + ", employee_pass=" + employee_pass + "]";
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public long getEmployee_adhar_no() {
		return employee_adhar_no;
	}
	public void setEmployee_adhar_no(long employee_adhar_no) {
		this.employee_adhar_no = employee_adhar_no;
	}
	public String getEmployee_qualification() {
		return employee_qualification;
	}
	public void setEmployee_qualification(String employee_qualification) {
		this.employee_qualification = employee_qualification;
	}
	public long getEmployee_contact_no() {
		return employee_contact_no;
	}
	public void setEmployee_contact_no(long employee_contact_no) {
		this.employee_contact_no = employee_contact_no;
	}
	public String getEmployee_designation() {
		return employee_designation;
	}
	public void setEmployee_designation(String employee_designation) {
		this.employee_designation = employee_designation;
	}
	public String getEmployee_dob() {
		return employee_dob;
	}
	public void setEmployee_dob(String employee_dob) {
		this.employee_dob = employee_dob;
	}
	public String getEmployee_doj() {
		return employee_doj;
	}
	public void setEmployee_doj(String employee_doj) {
		this.employee_doj = employee_doj;
	}
	public String getEmployee_email_id() {
		return employee_email_id;
	}
	public void setEmployee_email_id(String employee_email_id) {
		this.employee_email_id = employee_email_id;
	}
	public String getEmployee_gender() {
		return employee_gender;
	}
	public void setEmployee_gender(String employee_gender) {
		this.employee_gender = employee_gender;
	}
	public String getEmployee_local_address() {
		return employee_local_address;
	}
	public void setEmployee_local_address(String employee_local_address) {
		this.employee_local_address = employee_local_address;
	}
	public String getEmployee_per_address() {
		return employee_per_address;
	}
	public void setEmployee_per_address(String employee_per_address) {
		this.employee_per_address = employee_per_address;
	}
	public String getEmployee_pancard_no() {
		return employee_pancard_no;
	}
	public void setEmployee_pancard_no(String employee_pancard_no) {
		this.employee_pancard_no = employee_pancard_no;
	}
	public String getEmployee_uname() {
		return employee_uname;
	}
	public void setEmployee_uname(String employee_uname) {
		this.employee_uname = employee_uname;
	}
	public String getEmployee_pass() {
		return employee_pass;
	}
	public void setEmployee_pass(String employee_pass) {
		this.employee_pass = employee_pass;
	}
	
	
	
}
