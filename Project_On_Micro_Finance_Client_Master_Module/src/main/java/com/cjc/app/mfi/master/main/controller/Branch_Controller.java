package com.cjc.app.mfi.master.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;


import com.cjc.app.mfi.master.main.model.Branch_details;
import com.cjc.app.mfi.master.main.service.ClientService;


@RestController
@CrossOrigin("*")
public class Branch_Controller {
	@Autowired
	ClientService cs;
	
	
	/*
	 * @RequestMapping("/branchdata") public String branch() {
	 * 
	 * 
	 * Branch_details br=new Branch_details();
	 * 
	 * Bank_Details bd=new Bank_Details();
	 * 
	 * br.setBankid(bd); br.setId(101); br.setBranch_name("KarveNagar");
	 * br.setBranch_address("pune"); br.setBranch_email("pune.mah");
	 * br.setBranch_phno(9999999); br.setBranch_type("ttt");
	 * br.setBranch_status("active"); br.setBranch_ifsc("CJ00012");
	 * br.setBranch_cif(12344567);
	 * 
	 * return "branch data set successfully";
	 * 
	 * 
	 * }
	 * 
	 * 
	 * 
	 */
	 
	@PostMapping("/branch")
	public String insert(@RequestBody Branch_details brd) {
		cs.sava(brd);
		return "data save successfully";
	}

}
