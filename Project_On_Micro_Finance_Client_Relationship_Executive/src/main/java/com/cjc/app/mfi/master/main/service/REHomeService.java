package com.cjc.app.mfi.master.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.mfi.master.main.model.EnqDetailsRE;

import com.cjc.app.mfi.master.main.repositry.RERepositry;

@Service
public class REHomeService implements REServiceInterface
{

	@Autowired
	RERepositry sr;
	
	
	@Override
	public String saveRE(EnqDetailsRE ed) {

		sr.save(ed);
		return "Data Saved Successfully !";
	}


	@Override
	public List<EnqDetailsRE> getRE() {
		
		return sr.findAll();
	}

}
