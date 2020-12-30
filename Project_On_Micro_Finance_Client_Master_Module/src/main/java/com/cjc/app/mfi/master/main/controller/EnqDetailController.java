package com.cjc.app.mfi.master.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.cjc.app.mfi.master.main.model.EnquiryDetails;
import com.cjc.app.mfi.master.main.service.ClientService;



@RestController
@CrossOrigin("*")
public class EnqDetailController {

	@Autowired
	ClientService cs;
	
	@PostMapping("/addenq")
	public String enqDetails(@RequestBody EnquiryDetails end) {
		cs.addCustomerEnq(end);		
		return "Enquiry Details Added Successfully!";
	}
	@GetMapping("/getalldata")
	public Iterable<EnquiryDetails> allData() {
		Iterable<EnquiryDetails> itr=cs.getAllData();
		return itr;
	}
	
	@GetMapping("/getalldatafor_re")
	public List<EnquiryDetails> allDataForRe()
	{
		//producer for RE
		return cs.getAllDataForRE();
	}
	
	
	
}
