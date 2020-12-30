package com.cjc.app.mfi.master.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.mfi.master.main.model.CibilCheck;
import com.cjc.app.mfi.master.main.repositry.OERepositry;




@Service
public class OEHomeService implements OEHomeServiceInterface
{
  @Autowired
  OERepositry oer;

@Override
public void saveCibilCheckData(CibilCheck cc) 
{
	 oer.save(cc);
	
}

@Override
public List<CibilCheck> getAllCCData() {
	
	
	return oer.findAll();
}
  
  
}
