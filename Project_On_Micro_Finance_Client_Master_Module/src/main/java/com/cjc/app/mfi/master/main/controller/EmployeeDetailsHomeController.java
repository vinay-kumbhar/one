package com.cjc.app.mfi.master.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.cjc.app.mfi.master.main.model.Employee_Details;
import com.cjc.app.mfi.master.main.service.ClientService;
@CrossOrigin("*")
@RestController
public class EmployeeDetailsHomeController 
{
	@Autowired
	ClientService cs;
	
	
	@GetMapping("/get")
	public String prelogin()
	{
		return "Welcome To Project";
	}
	
	@GetMapping("/getdata")
	public Employee_Details getData()
	{
		Employee_Details ed=new Employee_Details();
		ed.setEmployee_id(101);
		ed.setEmployee_name("abc");
		ed.setEmployee_adhar_no(123456);
		ed.setEmployee_qualification("asd");
		ed.setEmployee_contact_no(456987);
		ed.setEmployee_designation("qwe");
		ed.setEmployee_dob("12/12/2020");
		ed.setEmployee_doj("12/12/2020");
		ed.setEmployee_email_id("@email.com");
		ed.setEmployee_gender("M/F");
		ed.setEmployee_local_address("localAddress");
		ed.setEmployee_per_address("permanentAddress");
		ed.setEmployee_pancard_no("panNo");
		ed.setEmployee_uname("uname");
		ed.setEmployee_pass("password");
		return ed;
	}
	
	
	@PostMapping("/saveemployeedetails")
	public String saveEmployeeDetails(@RequestBody Employee_Details ed)
	{
		cs.saveEmployeeDetails(ed);
		return "Employee Details Saved Successfully !!!";
	}
}
