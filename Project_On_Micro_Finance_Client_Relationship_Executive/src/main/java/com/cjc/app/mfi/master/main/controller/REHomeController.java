package com.cjc.app.mfi.master.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cjc.app.mfi.master.main.model.EnqDetailsRE;
import com.cjc.app.mfi.master.main.model.EnquiryDetails;
import com.cjc.app.mfi.master.main.service.REServiceInterface;

@RestController
@CrossOrigin("*")
public class REHomeController 
{
	@Autowired
	RestTemplate rt;
	
	@Autowired
	REServiceInterface res;
	
	@GetMapping("/getRE")
	public List<EnquiryDetails> getDataRE()
	{
		
		//consumer for Master Module
		String url="http://localhost:8083/getclient/getalldatafor_re";
		List<EnquiryDetails> list=rt.getForObject(url, List.class);
		System.out.println(list);
		return list;
	}
	
	@PostMapping("/saveCoustomerEnquiryRE")
	public String saveRE(@RequestBody EnqDetailsRE ed)
	{
		return res.saveRE(ed);
	}
	
	@GetMapping("/acceptedCoustomerEnquiryRE")
	public List<EnqDetailsRE> getRE()
	{
		return res.getRE();
	}
	
	
}
