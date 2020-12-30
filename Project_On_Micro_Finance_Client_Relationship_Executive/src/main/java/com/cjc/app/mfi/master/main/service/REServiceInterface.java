package com.cjc.app.mfi.master.main.service;


import java.util.List;

import com.cjc.app.mfi.master.main.model.EnqDetailsRE;


public interface REServiceInterface 
{
	public String saveRE(EnqDetailsRE ed);
	
	public List<EnqDetailsRE> getRE();
}
