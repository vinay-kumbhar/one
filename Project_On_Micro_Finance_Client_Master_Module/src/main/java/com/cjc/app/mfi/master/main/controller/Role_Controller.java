package com.cjc.app.mfi.master.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;


import com.cjc.app.mfi.master.main.model.Role_Details;
import com.cjc.app.mfi.master.main.service.ClientService;


@RestController
public class Role_Controller {
	@Autowired
	ClientService cs;
	
	/*
	 * @RequestMapping public String role() { Role_Details rd=new Role_Details();
	 * Branch_details br=new Branch_details();
	 * 
	 * //rd.setBranch_id(br); rd.setRole_id(111); rd.setRole_name("Mananger");
	 * rd.setRole_designation("dg"); rd.setRole_status("active");
	 * 
	 * return "data set role"; }
	 */
	
	@PostMapping("/role")
	public String insert(@RequestBody Role_Details rd) {
		cs.sava(rd);
		return "data save successfully";
	}

}
