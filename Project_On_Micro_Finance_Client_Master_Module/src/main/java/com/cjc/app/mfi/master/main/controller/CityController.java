package com.cjc.app.mfi.master.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.mfi.master.main.model.City;
import com.cjc.app.mfi.master.main.service.ClientService;

@RestController
@CrossOrigin("*")
public class CityController {
	
	@Autowired
	ClientService cs;
	
	@PostMapping("/savecitydata")
	public void saveData(@RequestBody City c)
	{
		cs.saveCityData(c);
	}

}
