package com.cjc.app.mfi.master.main.service;

import java.util.List;

import com.cjc.app.mfi.master.main.model.CibilCheck;

public interface OEHomeServiceInterface 
{
	public void saveCibilCheckData(CibilCheck cc);
	
	public List<CibilCheck> getAllCCData();
}
