package com.cjc.app.mfi.master.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cjc.app.mfi.master.main.model.CibilCheck;
import com.cjc.app.mfi.master.main.model.EnqDetailsRE;
import com.cjc.app.mfi.master.main.service.OEHomeServiceInterface;

@RestController
@CrossOrigin("*")
public class OEHomeController 
{
	@Autowired
	  RestTemplate rest;
	
	@Autowired
	OEHomeServiceInterface oeh;
	
	@GetMapping("/getAllDataFromRE")
	public List<EnqDetailsRE> getAllData()
	{
		String url="http://localhost:8083/getclientRE/acceptedCoustomerEnquiryRE";
		List<EnqDetailsRE> list=rest.getForObject(url, List.class);
		System.out.println(list);
		return list;
	}
	
	@GetMapping("/cibilscore")
	public int generateCibilScore()
	{
		int min=600;
		int max=900;
		 
		int random=(int)(Math.random()*(max-min+1)+min);
		System.out.println(random);
		
		return random;
	}
	
	@PostMapping("/saveCibilCheckData")
	public String saveCibil(@RequestBody CibilCheck cib)
	{
		oeh.saveCibilCheckData(cib);
		return null;
		
	}
	
	@GetMapping("/getAllCheckCibilData")
	public List<CibilCheck> getAllCCData()
	{
		
		return oeh.getAllCCData();
		
	}
}
