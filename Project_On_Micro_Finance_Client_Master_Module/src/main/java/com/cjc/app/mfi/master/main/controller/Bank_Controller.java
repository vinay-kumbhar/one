package com.cjc.app.mfi.master.main.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.mfi.master.main.model.Bank_Details;

import com.cjc.app.mfi.master.main.service.ClientService;

@RestController
@CrossOrigin("*")

public class Bank_Controller {
	@Autowired
	ClientService cs;

//	@RequestMapping("/g")
//	public String dtata() {
//		return "welcome to zuul";
//	}
//	
//	  @RequestMapping("/data") public String dataset(){
//	  
//	  Bank_Details bd=new Bank_Details(); bd.setBank_id(001);
//	  bd.setBank_name("cjc"); bd.setBank_address("xyz");
//	  bd.setBank_status("active");
//	  
//	  
//	  return "data set successfully"; }

	@PostMapping("/post")
	public String insertdata(@RequestBody Bank_Details bd) {
		cs.save(bd);
		return "data save succefully";

	}

//	@GetMapping("/get")
//	public List<Bank_Details> display() {
//		List<Bank_Details> list = bsi.getdata();
//		return list;
//	}

}
